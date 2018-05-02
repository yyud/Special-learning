
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/demo/demo.css" />
    <script src="/static/jquery-easyui-1.5.4.5/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/static/jquery-easyui-1.5.4.5/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/static/js/display.js" type="text/javascript" charset="utf-8"></script>
    <title>Title</title>
</head>
<body>
<table id="dg" title="商家收费类型" class="easyui-datagrid" style="width:700px;height:250px"
       url="/businessprice/findAll"
       toolbar="#toolbar"
       rownumbers="true"
       fitColumns="true"
       autoRowHeight="false"
       singleSelect="true"
       pagination="true"
       pageSize="10"method="get">
    <thead>
    <tr>
        <th field="id" width="50">编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号</th>
        <th field="pricetype" width="50">收费类型</th>
        <th field="price" width="50">金&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;额</th>
        <th field="email" width="50">编 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp辑</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">修改</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
</div>

</body>
</html>
