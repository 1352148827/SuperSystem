<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- =======================添加页面 =============================================================-->
 <div id="addBody" style="width:100%;position: absolute;top:10px">
     <div class="col-sm-12">
        		<div class="ibox float-e-margins">
        			<div class="ibox-title">
	                    <h5>添加   我的事件</h5>
	                </div>
	                <div class="ibox-content">
		                <form id="addForm" method="post" class="form-horizontal">
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件名称</label>
		                        <div class="col-sm-10">
		                            <input type="text"  class="inptAttribute form-control" name="name" id="add_name" />
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">时间</label>
		                        <div class="col-sm-10">
		                            <input class="inptAttribute form-control" name="date" type="text" id="add_date" style="width:90px;" onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的简介</label>
		                        <div class="col-sm-10">
		                            <input type="text" id="add_synopsis"  class="inptAttribute form-control" name="synopsis" />
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的详情</label>
		                        <div class="col-sm-10">
		                            <textarea class="inptAttribute form-control" id="add_content" name="content" style="width:300px;height:100px;"></textarea>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的状态</label>
		                        <div class="col-sm-10">
		                            <label>
		                                <input type="radio"  name="state" value=1  /> 准备中
		                            </label>
		                            <label>
		                                <input type="radio"  name="state" value=2 /> 执行中
		                            </label>
		                            <label>
		                                <input type="radio"  name="state" value=3 /> 已完成
		                            </label>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <div class="col-sm-2 col-sm-offset-2">
		                            <button type="button" class="btn btn-primary btn-block"  id="add_saveBtn">保存</button>
		                        </div>
		                        <div class="col-sm-2 col-sm-offset-1">
		                            <button type="button" class="btn btn-default btn-block"  id="add_backBtn">返回</button>
		                        </div>
		                    </div>
		                </form>
	                </div>
        		</div>
            </div>   	
 </div>
 
 <script type="text/javascript">
 	/*
	 * 添加页面保存按钮事件
	 */
	$('#add_saveBtn').click(function(){
		$('#addForm').bootstrapValidator('validate');
 	if($("#addForm").data('bootstrapValidator').isValid()){
 		alert($('#addForm').serialize())
			$.post("../MyEventAction/insertMyEvent.do",
					$('#addForm').serialize(),
					function(data){
				
				if(data.status){
					cleanInptAttribute();
					layer.msg('添加成功!',{icon:1,time:1000});
				}else{
					layer.msg(data.msg,{icon:2,time:1000});
				}
			});
 		}
	});
	
 	
 	/*
 	添加页面取消按钮（返回主页面）
 	*/
	$("#add_backBtn").click(function(){
		window.location.href = "../MyEventAction/toMyEventList.do";	
	});
	
	
	
  /*
   * 清空参数方法
   */
  function cleanInptAttribute() {
	  $(".inptAttribute").val("");
  }
 
 	
 	
	/**
	 * 添加校验方法
	 */
	$('#addForm').bootstrapValidator({
   	feedbackIcons: {
           valid: 'glyphicon glyphicon-ok',
           invalid: 'glyphicon glyphicon-remove',
           validating: 'glyphicon glyphicon-refresh'
       },
       live: 'enabled',
       fields: {
    	   name: {
               validators: {
                   notEmpty: {
                       message: '事件名称不能为空'
                   }
               }
           },
           date: {
               validators: {
                   notEmpty: {
                       message: '日期不能为空'
                   }
               }
           },
           state: {
               validators: {
                   notEmpty: {
                       message: '事件状态不能为空'
                   }
               }
           },
           synopsis: {
               validators: {
                   notEmpty: {
                       message: '事件简介不能为空'
                   }
               }
           },
           content: {
               validators: {
                   notEmpty: {
                       message: '事件内容不能为空'
                   }
               }
           },
       }
   });	
 </script>
 
</body>
</html>