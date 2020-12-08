//vue的核心对象 view model  双向绑定
//如果数据发生改变，页面同步显示
//反之也成立
//view model
var vm = new Vue(
    {
        el:'#app', //让vu掌握指定的视图区域
        data:{
            student:{
                sid:'',
                sname:'',
                spassword:'',
                sidcard:'',
                ssex:'',
                sbirthday:'',
                spostatus:'',
                snative:'',
                sfolk:'',
                shealth:'',
                scid:'',
                sgid:'',
                sdid:'',
                sadmissiond:'',
                sadmissionm:'',
                sstudyway:'',
                saddress:'',
                sphone:'',
                semail:'',
                spower:'',
                sstate:'',
            },
            viewid:1, //控制视图的状态  ==1 显示列表，==2 添加 == 3修改
            students:[] //集合
        },
        methods:{
            //函数
            findAll:function () {
                var vm = this
                axios.get('/students')
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.students = response.data.data
                        vm.viewid = 1
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            findOne:function (sid) {
                var vm = this
                axios.get('/students/'+sid)
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.student = response.data.data
                        vm.viewid = 3
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            deleteStudent:function (sid) {
                axios.delete('/students/'+sid)
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
            saveStudent:function () {
                var vm = this
                axios.post('/students',vm.student)
                    .then(function (response) {//正常
                        console.log(response.data);
                        vm.findAll()
                    })
                    .catch(function (err) {//请求失败
                        console.log(err);
                        alert(response.err)
                    });
            },
            updateStudent:function (sid) {
                var vm = this
                axios.put('/students/'+sid,vm.student)
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