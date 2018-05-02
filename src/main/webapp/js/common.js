
 
/**
 * 二次封装ajax
 * @param url 请求路径
 * @param data 请求参数
 * @param callback 会掉函数
 */
 function postAjax(url, data, callback) {  
     $.ajax({  
         type: "post",
         async:false,
         url: url,  
         data: data,  
         dataType: "json",  
         success: callback
     });  
 }  
 
 /**
  * 
  * @returns {Boolean}
  */
 function isOnlyChecked(){
	
	var count = $("[input name='did']:checked").size();
	if(count==1)
		return true;
	else
		return false;
 }
 
 /**
  * 功能：超链接高亮显示．
  * 用法：<a id="aa_3" onclick="linkHighlighted(this)">
  * id 命名必需以 aa_开头，后边填写数字， 超链接id名称不能重复。
  * 
 */

  function linkHighlighted(obj){
      	var linka=document.getElementsByTagName('A');
      		for(var i=0;i<linka.length;i++){
      			if(linka[i].id.indexOf('aa_')!=-1){
      				linka[i].className = '';
      			}
      		}
      		obj.className ='focus';
 }
 
  
  /* 打开一个新页面：调用时不加第二个参数 add by tony */
  function formSubmit (url,sTarget){
      document.forms[0].target = sTarget
      document.forms[0].action = url;
      document.forms[0].submit();
      return true;
  }
 
  /**
   * 获取form表单的参数
   */
  function getFormParam(param) {
	 return decodeURIComponent(param,true);
  }
 

