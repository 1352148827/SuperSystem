<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${ctx}/js/system/sysMemo/sysMemoList.js"></script>

</head>
<body>
	
<div id="mainBody">
		<div>
		    <div class="panel-body form-group" style="margin-bottom:0px;">
		        <button id="btn_edit" type="button" class="btn btn-default" style="display: none; border-radius: 0">
		         <span  class="glyphicon glyphicon-pencil" aria-hidden="true" ></span>修改
			     </button>
			      <button id="btn_delete" type="button" class="btn btn-default" style="display: none;">
			          <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
			      </button>
			      <button id="btn_add" type="button" class="btn btn-default">
			          <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
			      </button>
		     </div>
		</div>
		<table id="mytab" class="table table-hover"></table>
		<div id="toolbar" class="btn-group pull-right" style="margin-right: 20px;">
		 </div>
 </div>
</body>
</html>