<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="/static/css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<h1>Welcome</h1>
			
			<form class="form">
				<input type="text" placeholder="Username"name="Username">
				<input type="password" placeholder="Password"name="Password">
				<button type="submit" id="login-button">Login</button>
			</form>
		</div>
		
		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</div>

<script src="/static/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script>
$('#login-button').click(function (event) {
	event.preventDefault();
	// $('form').fadeOut(500);
	// $('.wrapper').addClass('form-success');
	$.ajax({
		url:'/admin/login',
		type:'post',
		data:$('form').serialize(),//序列化
		success:function(data){
		    if(data.code===0){
		        alert("error")
		    }
			else{
		        alert("success")
		         window.location.href="/WEB-INF/views/index.html"
				}
		},dataType:"json"
	})
});
</script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
<h1>停车管理</h1>
</div>
</body>
</html>