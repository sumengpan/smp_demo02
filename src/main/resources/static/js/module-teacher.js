//vue的核心对象 view model  双向绑定
//如果数据发生改变，页面同步显示
//反之也成立
//view model
var vm = new Vue(
    {
        el:'#app', //让vu掌握指定的视图区域
        data:{
            teacher:{
                tid:'',
                tpassword:'',
                tname:'',
                tsex:'',
                tbirthday:'',
                tpostatus:'',
                tnative:'',
                tfolk:'',
                tidcard:'',
                tpst:'',
                tdid:'',
                tphone:'',
                temail:'',
                tpower:'',
                tstate:'',
            },
            viewid:1, //控制视图的状态  ==1 显示列表，==2 添加 == 3修改
            teachers:[] //集合
        },
        methods:{
            //函数
            findAll:function () {
                var vm = this
                axios.get('/teachers')
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.teachers = response.data.data
                        vm.viewid = 1
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            findOne:function (tid) {
                var vm = this
                axios.get('/teachers/'+tid)
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.teacher = response.data.data
                        vm.viewid = 3
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            deleteTeacher:function (tid) {
                axios.delete('/teachers/'+tid)
                    .then(function (response) {//正常
                        console.log(response.data);
                        //vm.students = response.data.data
                        //vm.viewid = 1
                        vm.findAll()
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            showSaveForm:function(){
                var vm = this
                vm.viewid = 2
            },
            back:function(){
                var vm = this
                vm.viewid = 1
            },
            saveTeacher:function () {
                var vm = this
                axios.post('/teachers',vm.teacher)
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.findAll()
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            updateTeacher:function (tid) {
                var vm = this
                axios.put('/teachers/'+tid,vm.teacher)
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.findAll()
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            }
        },
        created:function () {
            //发送请求查询列表
            // alert("vm创建成功")
            //this表示当前vm对象
            this.findAll()
        }
    }
) //创建了MVVM中的VM对象