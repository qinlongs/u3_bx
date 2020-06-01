/*设置cookie*/
window.setCookie=function(tokenName,tokenValue,expireTime){
    var curTime = new Date();
    /*设置cookie的有效时间*/
    curTime.setTime(curTime.getTime()+expireTime);
    document.cookie=tokenName+"="+tokenValue+"_"+curTime.getTime();

}
/*获取cookie中存储的token值*/
window.getCookie=function (tokenName) {
    if(document.cookie.length>0){
        var cookie = document.cookie;

        var tokenStr = cookie.split(tokenName+"=");
        var token = tokenStr[1].split("_")[0];
        var expireTime = tokenStr[1].split("_")[1];
        var curTime = new Date();
        if(tokenName=="token"){
            expireTime = expireTime.split(";")[0];
        }
        if(curTime.getTime()<expireTime){
            return token;
        }else{
            return null;
        }

    }
}