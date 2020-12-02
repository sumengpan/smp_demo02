<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>Classic Register Form Responsive Widget Template :: w3layouts</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Classic Register Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
		function go_register(){
			//alert("lgo");
			window.location.href="register.jsp";
		}
	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="css/font-awesome.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	<!-- web-fonts -->
	<link href="//fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- //web-fonts -->
</head>

<body>
 
	<!--header-->
	<h1>
		<span>登录</span>界面
		 </h1>
	<!--//header-->
	<!-- content -->
	<div class="main-content-agile">
		<div class="sub-main-w3">
			<form action="LoginAndRegisterServlet" method="post">
				<input type="hidden" name="method" value="login">
				<!-- 用户名 -->
				<div class="form-style-agile">
					<label>Your Name</label>
					<div class="pom-agile">
						<input placeholder="Your Name" name="uname" value="" type="text" required="">
						<span class="fa fa-user-o" aria-hidden="true"></span>
					</div>
				</div>
			 <!-- 密码 -->
				<div class="form-style-agile">
					<label>Password</label>
					<div class="pom-agile">
						<input placeholder="Password" name="upasswd" value="" type="password" id="password1" required="">
						<span class="fa fa-key" aria-hidden="true"></span>
					</div>
				</div>
				<!-- 权限 -->
				<div class="form-style-agile">
					<label>Power</label>
					<div class="pom-agile">
						<input placeholder="Power" name="upower" value="" type="text" required="">
						<span class="fa fa-user-o" aria-hidden="true"></span>
					</div>
				</div>

				<div class="form-group">
							<label for="validatecode" class="sr-only">验证码</label> <img
								src="code" onclick="this.src='code?'+Math.random();"
								class="c_code" title="点击更换"> <input type="text"
								class="form-control" name="validatecode" id="validatecode"
								placeholder="验证码" autocomplete="off">
						</div>
				<div class="sub-agile">
					<input type="checkbox" id="brand1" name="rememberMe" value="true">
					<label for="brand1">
						<span></span>I Accept to the Terms & Conditions</label>
				</div>
				<div class="clear"></div>
				<input style="float:left" type="submit" value="登录">&nbsp;
				<input style="float:right" type="button" value="注册" onclick="go_register()">
			</form>
		</div>
	</div>
	<!-- //content -->
	<!--footer-->
	<div class="footer">
		<h2>&copy; 2018 Classic Register Form. All rights reserved | Design by
			<a href="http://w3layouts.com">W3layouts</a>
		</h2>
	</div>
	<!--//footer-->


	<!-- password-script -->
	<script>
		window.onload = function () {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}

		function validatePassword() {
			var pass2 = document.getElementById("password2").value;
			var pass1 = document.getElementById("password1").value;
			if (pass1 != pass2)
				document.getElementById("password2").setCustomValidity("Passwords Don't Match");
			else
				document.getElementById("password2").setCustomValidity('');
			//empty string means no validation error
		}
	</script>
	<!-- //password-script -->

</body>

</html>