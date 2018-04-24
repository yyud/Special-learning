 <%-- Created by IntelliJ IDEA.
  User: admin
  Date: 2018/4/11
  Time: 10:25
  To change this template use File | Settings | File Templates.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员</title>
</head>
<body>
        <!--<table>
            <tr>
                <th width="50">用户名</th>
                <th width="50">密码</th>
                <th width="50">权限</th>
            </tr>
        </table>-->
        <table title="My Users" border="1" cellspacing="0" style="width:550px;">
            <tr>
                <th width="50">编号</th>
                <th width="50">用户名</th>
                <th width="50">密码</th>
                <th width="50">权限</th>
                <th width="30"></th>
            </tr>
            <table id="user" border="1" cellspacing="0" style="width:550px;height:50px;"></table>
        </table>
        <script src="/static/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script>
    $(document).ready(function() {
        $.ajax({
            url: "/admin/find",//请求地址
            dataType: "json",//数据格式
            type: "post",//请求方式
            async: false,//是否异步请求
            success: function (data) {   //如何发送成功
                var html = "";
                for (var i = 0; i < data.length; i++) {    //遍历data数组
                    var ls = data[i];
                    html += "<tr><td width='50'align='center'>" + ls.id + "</td><td width='50'align='center'>" + ls.username + "</td><td width='50'align='center'>" + ls.password + "</td><td width='50'align='center'>" + ls.power
                        + "</td><td width='30'><button type='submit' class='delete'>删除</button><button>修改</button></td></tr>";
                }
                $("#user").html(html); //在html页面id=ulul的标签里显示html内容
            },
        })
    });
    $('.delete').click(function () {
        ///event.preventDefault();
        // $('form').fadeOut(500);
        // $('.wrapper').addClass('form-success');
        $.ajax({
            url:'/cha/delete',
            type:'post',
            async: false,//是否异步请求
            data:$(2).serialize(),//序列化
            success:function(data){

                if(data.code===1){
                    alert("success")
                    window.location.href="#"
                }
                else{
                    alert("error")

                }
            },dataType:"json"
        })
    });
</script>
</body>
</html>
