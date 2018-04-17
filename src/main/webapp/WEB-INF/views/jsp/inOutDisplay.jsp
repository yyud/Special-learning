
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table{
            border: 2px salmon;
            border-collapse: collapse;
        }
        td,th{
            boder:3px solid red;
            width: 80px;
            hight: 10px;
        }
    </style>
</head>
<body>
<div>
    <table >
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>标识</td>
            <td>位置</td>
            <td>状态</td>
        </tr>
    </table>
</div>

<button id="delete-data">删除</button>>

<form id="date-tt">
    名称：<input type="text" name="exitname">
    标识：<input type="text" name="exitsign">
    位置：<input type="text" name="location">
    状态：<input type="text" name="state">
    <button type="button" id="save">保存</button>
</form>

<script src="/static/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script>

    /*请求获取所有数据*/
    window.onload =function (event) {
        $.ajax({
            url:'/inout/find',
            type:'post',
           // contentType:" application/json; charset=UTF-8",
            // data:$('form').serialize(),//序列化
            success:function(data){
                if(data.code===0){
                    alert("error")
                }
                else{

                    jsondata = data;
                        var table = document.getElementsByTagName('table')[0];
                        for(var i = 0;i<data.length;i++){
                            var tr =table.insertRow (table.rows.length);
                            var x = data[i].length;
                            var obj = data[i];
                            for(var p in obj){
                                if(x==0){
                                    x--;
                                    break;
                                }
                                var td =tr.insertCell(tr.cells.length);
                                td.innerText =obj[p];
                            }
                        }
                }
            },dataType:"json"
        })
    }

    $("#delete-data").click (function (event) {

    });


    $("#save").click (function (event) {
        var exitsandentranceEntity ={
            exitid:66,
            exitname:$("#1").val(),
            exitsign:$("#2").val(),
            location:$("#3").val(),
            state:$("#4").val()
        }


        event.preventDefault();
        $.ajax({
            url:'/inout/save',
            type:'post',
            data:$('#date-tt').serialize(),//序列化
            success:function(){
                    window.location.href="/static/jsp/inOutDisplay.jsp"
            },dataType:"json"
        })
    });

</script>
</body>
</html>