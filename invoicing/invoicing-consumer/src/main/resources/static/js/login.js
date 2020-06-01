$(function () {
    $("#loignBtn").click(function () {
        var userName=$("#userName").val();
        var password=$("#password").val();
        var param ={};
        if(checkParam(userName,password)){
            param.userName=userName;
            param.password=password;
            $.ajax({
                url:"login",
                type:"post",
                data:param,
                dataType:"json",
                success:function (result) {
                    if(result!=""){
                        if(result.result==true && result.flag==4){
                            /*把token和userName*/
                            alert(userName)
                            setCookie("token",result.data,5*60*1000)
                            setCookie("userName",userName,5*60*1000)
                            location.href="welcome.html";
                        }
                    }
                    if(result.result==false){
                        alert("false")
                    }

                }

            })

        }


    })

})

function checkParam(userName,password){
    if(userName==null || userName==""){
        alert("用户名不能为空")
        return false;
    }
    if(password==null || password==""){
        alert("密码不为空")
        return false;
    }
    return true;
}
