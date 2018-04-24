<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/4/23
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <script type="text/javascript" src="/static/jquery-easyui-1.5.4.5/jquery.min.js"></script>
    <!-- 2    css资源 -->
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/default/easyui.css">
    <!-- 3    图标资源 -->
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/icon.css">
    <!-- 4    jquery-easyui-1.5.4.5的js包 -->
    <script type="text/javascript" src="/static/jquery-easyui-1.5.4.5/jquery.easyui.min.js"></script>
    <!-- 5    本地语言 -->
    <script type="text/javascript" src="/static/jquery-easyui-1.5.4.5/locale/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript" src="/static/js/blacklist.js"></script>
    <%--<link rel="stylesheet" type="text/css" href="/static/css/user.css">--%>
</head>
<body style="width:900px;">

<table id="box" ></table>

<div id="tb">
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="obj.add();">添加</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="obj.edit();">修改</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="obj.remove();">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" style="display: none" id="save" onclick="obj.save();">保存</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" style="display: none" id="redo" onclick="obj.redo();">取消编辑</a>
    </div>
    <div>
        车牌：<input type="text" class="textbox" name="username">
        权限：<input type="text" class="textbox" name="power">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="obj.search();">查询</a>
    </div>

</div>
</body>
</html>