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
	
	
 
<!-- =======================修改页面 =============================================================-->
 		<div id="editBody" style="width:100%; height:500px;position: absolute;top:10px;">
        	<div class="col-sm-12">
        		<div class="ibox float-e-margins">
        			<div class="ibox-title">
	                    <h5>修改我的事件</h5>
	                </div>
	                <div class="ibox-content">
		                <form id="editForm" method="post" class="form-horizontal">
		                	<input type="hidden" id="edit_id" name="id" class="inptAttribute" > 
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件名称</label>
		                        <div class="col-sm-10">
		                            <input type="text"  class="inptAttribute form-control" name="name" id="edit_name" readonly/>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">时间</label>
		                        <div class="col-sm-10">
		                            <input class="inptAttribute form-control" name="date" type="text" id="edit_date" style="width:90px;" onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的简介</label>
		                        <div class="col-sm-10">
		                            <input type="text" id="edit_synopsis"  class="inptAttribute form-control" name="synopsis" />
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的详情</label>
		                        <div class="col-sm-10">
		                            <textarea class="inptAttribute form-control" id="edit_content" name="content" style="width:300px;height:100px;"></textarea>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <label class="col-sm-2 control-label">事件的状态</label>
		                        <div class="col-sm-10">
		                            <label>
		                                <input type="radio" name="state" value="1"  /> 准备中
		                            </label>
		                            <label>
		                                <input type="radio" name="state" value="2" /> 执行中
		                            </label>
		                            <label>
		                                <input type="radio" name="state" value="3" /> 已完成
		                            </label>
		                        </div>
		                    </div>
		                    <div class="hr-line-dashed"></div>
		                    <div class="form-group">
		                        <div class="col-sm-2 col-sm-offset-2">
		                            <button type="button" class="btn btn-primary btn-block"  id="edit_saveBtn">保存</button>
		                        </div>
		                        <div class="col-sm-2 col-sm-offset-1">
		                            <button type="button" class="btn btn-default btn-block"  id="edit_backBtn">返回</button>
		                        </div>
		                    </div>
		                </form>
	                </div>
        		</div>
            </div>
		</div>
		
<script type="text/javascript">

	$(function(){
		
		var edit_id = "${myEvent.id}";
		var edit_name ="${myEvent.name}" ;
		var edit_date = "${myEvent.date}";
		var edit_synopsis ="${myEvent.synopsis}" ;
		var edit_content = "${myEvent.content}";
		
		$("#edit_id").val(edit_id);
		$("#edit_name").val(edit_name);
		$("#edit_date").val(edit_date);
		$("#edit_synopsis").val(edit_synopsis);
		$("#edit_content").val(edit_content);
		
		var state = "${myEvent.state}";
		
		if(state==1){
			$("#editForm input[name=state]:eq(0)").prop("checked",true);
			$("#editForm input[name=state]:eq(2)").prop("checked",false);
			$("#editForm input[name=state]:eq(1)").prop("checked",false);
		}else if(state==2){
			$("#editForm input[name=state]:eq(1)").prop("checked",true);
			$("#editForm input[name=state]:eq(2)").prop("checked",false);
			$("#editForm input[name=state]:eq(0)").prop("checked",false);
		}else if(state==3){
			$("#editForm input[name=state]:eq(2)").prop("checked",true);
			$("#editForm input[name=state]:eq(0)").prop("checked",false);
			$("#editForm input[name=state]:eq(1)").prop("checked",false);
		} 
		
	});


/*
 * 修改页面返回按钮事件
 */
$('#edit_backBtn').click(function(){
	window.location.href = "../MyEventAction/toMyEventList.do";	
})

	/**
	 * 修改页面保存按钮事件
	 */
	$('#edit_saveBtn').click(function(){
		
		alert($('#editForm').serialize());
		$('#editForm').bootstrapValidator('validate');
    	if($("#editForm").data('bootstrapValidator').isValid()){
			$.post("../MyEventAction/updateMyEvent.do",
					$('#editForm').serialize(),
					function(data){
				
				if(data.status){
					layer.msg('修改成功!',{icon:1,time:1000});
					window.location.href = "../MyEventAction/toMyEventList.do";
				}else{
					layer.msg(data.msg,{icon:2,time:1000});
				}
			
						
			});
    		 
    		 	
    	}
	})
	



/*
 * 修改校验方法
 */
$('#editForm').bootstrapValidator({
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