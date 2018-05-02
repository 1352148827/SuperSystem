<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	// 页面加载时 加载菜单栏
	$(function (){
		var url = "SystemAction/listAll.do";
		var data={};
		postAjax(url,data,function(arr){
			var str = "";
			$.each(arr,function(i,item){
				str += "<span id=\""+item.sysMemoAnothername+"\" onclick=\"toModule('"+item.sysMemoAnothername+"');\">"+item.sysMemoName+"</span>&nbsp&nbsp";
			});
			$("#menuContent").append(str); 
		})
	});
	
	// ======================常用的方法========================================
	var toModule =function(moduleName){
		top.leftFrame.location.href = 'homeAction_toleft.do?moduleName=' + moduleName;
		top.main.location.href = 'homeAction_tomain.do?moduleName=' + moduleName;
	}
</script>
</head>
<body>
	<h1>上面</h1>
	<div id="menuContent">
		<!-- 菜单栏的内容 -->
	</div>
</body>


</html>
