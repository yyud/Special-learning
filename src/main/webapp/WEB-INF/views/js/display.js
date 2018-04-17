$(function(){
    $.ajax({
        url:'/businesspric/findall',
        type:'post',
        // contentType:" application/json; charset=UTF-8",
         data:$('form').serialize(),//序列化
        success:function(data){
            if(data.code===0){
                alert("error")
            }
            else{
            }
        },dataType:"json"
    });

});