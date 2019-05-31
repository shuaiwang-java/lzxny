var myJs = {

    /**
     * 用myJs.getUrlValue("name");   参数填写String字符
     * 获取当前页面Url?后面参数的值     比如http://localhost:63342/WebStrom/demo2/a1.html?name=123      var name = getUrlValue("name");
     * @param name
     * @returns {string}
     */
    getUrlValue: function(name) {
        var result = window.location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
        if (result == null || result.length < 1) {
            return "";
        }
        return result[1];
    },

    /**
     * 判断是否为空false不为空
     * @param o
     * @returns {boolean}
     */
    isnull:  function(o){
         if(typeof o == "undefined" || o == null || o == ""){
            return true;
        }else{
            return false;
        }
    },
    //时间转换的方法
    getMyDate: function(str){
            var oDate = new Date(str),
            oYear = oDate.getFullYear(),
            oMonth = oDate.getMonth()+1,
            oDay = oDate.getDate(),
            oHour = oDate.getHours(),
            oMin = oDate.getMinutes(),
            oSen = oDate.getSeconds(),
            oTime = oYear +'年'+ myJs.getzf(oMonth) +'月'+ myJs.getzf(oDay) +'日'+ myJs.getzf(oHour) +':'+
					myJs.getzf(oMin) +':'+myJs.getzf(oSen);//最后拼接时间
            return oTime;
        },
    //补0操作
    getzf: function(num){
          if(parseInt(num) < 10){
              num = '0'+num;
			}
          	return num;
        },
}