<%--
  Created by IntelliJ IDEA.
  User: yyud
  Date: 2018/4/18
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商家信息管理</title>
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="/static/jquery-easyui-1.5.4.5/demo/demo.css" />
    <script src="/static/jquery-easyui-1.5.4.5/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/static/jquery-easyui-1.5.4.5/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<h2>Row Editing in DataGrid</h2>
<p>Click the row to start editing.</p>
<div style="margin:20px 0;"></div>

<table id="dg" class="easyui-datagrid" title="Row Editing in DataGrid" style="width:700px;height:auto"
       data-options="
    				iconCls: 'icon-edit',
    				singleSelect: 'true',
    				toolbar: '#tb',
    				url: '/business/findAll',
    				method: 'get',
    				pagination:'true',
    				onClickRow: onClickRow
    			">
    <thead>
    <tr>
        <th data-options="field:'businessid',width:80">编号</th>
        <th data-options="field:'businessname',width:100, editor:'numberbox'">商家名称</th>
        <th data-options="field:'phone',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">电话</th>
        <th data-options="field:'pricetype',width:80,align:'right',
	          formatter:function(value,row){
    							return row.pricetype;
    						},
    						editor:{
    							type:'combobox',
    							options:{
    								valueField:'id',
    								textField:'pricetype',
    								method:'get',
    								url:'/businessprice/findAll',
    								required:true
    							}
    						}">收费类型</th>
        <th data-options="field:'remark',width:250,editor:'textbox'">描述</th>
        <th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>
    </tr>
    </thead>
</table>

<div id="tb" style="height:auto">
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">Append</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">Remove</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">Accept</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">Reject</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">GetChanges</a>
</div>

<script type="text/javascript">
    var editIndex = undefined;
    function endEditing(){
        if (editIndex == undefined){return true}
        if ($('#dg').datagrid('validateRow', editIndex)){
            var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'id'});
            var productname = $(ed.target).combobox('getText');
            $('#dg').datagrid('getRows')[editIndex]['pricetype'] = pricetype;
            $('#dg').datagrid('endEdit', editIndex);
            editIndex = undefined;
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
    function append(){
        if (endEditing()){
            $('#dg').datagrid('appendRow',{status:'P'});
            editIndex = $('#dg').datagrid('getRows').length-1;
            $('#dg').datagrid('selectRow', editIndex)
                .datagrid('beginEdit', editIndex);
        }
    }
    function removeit(){
        if (editIndex == undefined){return}
        $('#dg').datagrid('cancelEdit', editIndex)
            .datagrid('deleteRow', editIndex);
        editIndex = undefined;
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


