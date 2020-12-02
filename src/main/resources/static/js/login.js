$(function(){
	$("#btn").click(function(){
		var method=$("#method").val();
		alert("method:"+method);
		if($("#username").val().length==0||$("#password").val().length==0){
			$("#hint").text("友情提示：对不起你的用户名或密码为空");
		}
		else{
			$.ajax({
				url:'LoginAndRegisterServlet',
				data:{
					username:$("#username").val(),
					password:$("#password").val(),
					method:$("#method").val()},
			     dataType:'json',
			     success:function(data){
			    	 $("#sort").html("<div>欢迎"+data.json_user.username+"登录</div>");
			    	 $("#welcome").html(data.json_user.username);
			     },
			     error:function(){
			    	 alert("error");
			     }
			});
		}
		//alert("hello a.....");
	}); 
	
	$("#username").focus(function(){
		 $("#hint").text("友情提示");
		//alert("hello a.....");
	}); 
	$("#password").focus(function(){
		 $("#hint").text("友情提示");
		//alert("hello a.....");
	}); 
});