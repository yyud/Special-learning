<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/4/18
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Row Editing in DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/demo/demo.css">
    <script type="text/javascript" src="/static/jquery-easyui-1.5.4.5/jquery.min.js"></script>
    <script type="text/javascript" src="/static/jquery-easyui-1.5.4.5/jquery.easyui.min.js"></script>
</head>
<body>
<%--<h2>Row Editing in DataGrid</h2>
<p>Click the row to start editing.</p>--%>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="DataGrid Complex Toolbar" style="width:700px;height:250px"
       data-options="
       iconCls: 'icon-edit',
       singleSelect:true,
       url: '/admin/find',

       pagination:true,
       method:'get',
       toolbar:'#tb'">
    <thead>
    <tr>
        <th data-options="field:'id',width:150,align:'center'">ID</th>
        <th data-options="field:'username',width:150,align:'center'">用户名</th>
        <th data-options="field:'password',width:150,align:'center'">密码</th>
        <th data-options="field:'power',width:150,align:'center'">权限</th>
    </tr>
    </thead>
</table>
<div id="tb" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"></a>
        <%--<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true"></a>--%>
        <a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true"></a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">Accept</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">Reject</a>
    </div>
    <div>
        用户名: <input class="easyui-textbox" style="width:80px">
        权限: <input class="easyui-textbox" style="width:80px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>
</div>

<script type="text/javascript">
    var editIndex = undefined;
    function endEditing(){
        if (editIndex == undefined){return true}
        if ($('#dg').datagrid('validateRow', editIndex)){

            return true;
        } else {
            return false;
        }
    }
    function onClickRow(index){
        if (editIndex != index){
            if (endEditing()){
                $('#dg').datagrid('selectRow', index)
                    .datagrid('beginEdit', index);
                editIndex = index;
            } else {
                $('#dg').datagrid('selectRow', editIndex);
            }
        }
    }
    function accept(){
        if (endEditing()){
            $('#dg').datagrid('acceptChanges');
        }
    }
    function reject(){
        $('#dg').datagrid('rejectChanges');
        editIndex = undefined;
    }
    function getChanges(){
        var rows = $('#dg').datagrid('getChanges');
        alert(rows.length+' rows are changed!');
    }
</script>
</body>
</html>

