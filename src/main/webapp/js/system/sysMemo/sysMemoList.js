
// ====================页面加载事件start======================
$(function(){
	
	//根据窗口调整表格高度
	$(window).resize(function() {
	    $('#mytab').bootstrapTable('resetView', {
	        height: tableHeight()
	    })
	})
 
    //生成用户数据
    $('#mytab').bootstrapTable({
    	method: 'post',
	    contentType: "application/x-www-form-urlencoded",//必须要有！！！！
	    url:"../SysMemoAction/listPage.do",//要请求数据的文件路径
	    height:tableHeight(),//高度调整
	    toolbar: '#toolbar',//指定工具栏
	    striped: true, //是否显示行间隔色
	    dataField: "pageData",//bootstrap table 可以前端分页也可以后端分页，这里
	    //我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的  
	    //rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
	    pageNumber: 1, //初始化加载第一页，默认第一页
	    pagination:true,//是否分页
	    queryParamsType:'limit',//查询参数组织方式
	    queryParams:queryParams,//请求服务器时所传的参数
	    sidePagination:'server',//指定服务器端分页
	    pageSize:10,//单页记录数
	    pageList:[5,10,20,30],//分页步进值
	    showRefresh:true,//刷新按钮
	    showColumns:true,
	    clickToSelect: true,//是否启用点击选中行
	    toolbarAlign:'right',//工具栏对齐方式
	    buttonsAlign:'right',//按钮对齐方式
	    toolbar:'#toolbar',//指定工作栏
	    columns:[
	        {
	            title:'全选',
	            field:'select',
	            //复选框
	            checkbox:true,
	            class:'check_box',
	            width:25,
	            align:'center',
	            valign:'middle',
	        },
	        {
	            title:'ID',
	            field:'sysMemoId',
	            visible:false
	        },
	        {
	            title:'模板id',
	            field:'sysTemplateId',
	            visible:false
	        },
	        {
	            title:'系统菜单名称',
	            field:'sysMemoName'
	        },
	        {
	            title:'系统菜单别名',
	            field:'sysMemoAnothername',
	            visible:false
	        },
	        {
	            title:'系统菜单的url',
	            field:'sysMemoUrl',
	            visible:false
	        },
	        {
	            title:'系统菜单的备注',
	            field:'sysMemoRemark'
	        },
	        {
	            title:'创建时间',
	            field:'gmtCreate',
	            visible:false
	        },
	        {
	            title:'修改时间',
	            field:'gmtModified',
	        }
	    ],
	    locale:'zh-CN',//中文支持,
	    responseHandler:function(res){
	        //在ajax获取到数据，渲染表格之前，修改数据源
	        return res;
	    },
	    // 点击多选框的操作
	    onCheck:function(row){
	       // 显示和隐藏功能按钮
	       Operation_btn();

	    },
	    // 取消多选框时的操作
	    onUncheck:function(row){
          // 显示和隐藏功能按钮
          Operation_btn();

        }, 
        // 点击全选框时触发的操作
        onCheckAll:function(rows){
            // 显示和隐藏功能按钮
            Operation_btn();
        },
    
    	
    })
    
    
    
    //删除按钮与修改按钮的出现与消失
    function Operation_btn(){
    	var dataArr=$('#mytab .selected');
    	if(dataArr.length==1){
    		$('#btn_edit').css('display','block').removeClass('fadeOutRight').addClass('animated fadeInRight');
    	}else{
    		$('#btn_edit').addClass('fadeOutRight');
    		setTimeout(function(){
    			$('#btn_edit').css('display','none');
    		},400);	
    	}
    	if(dataArr.length>=1){
    		$('#btn_delete').css('display','block').removeClass('fadeOutRight').addClass('animated fadeInRight');
    	}else{
    		$('#btn_delete').addClass('fadeOutRight');
    		setTimeout(function(){
    			$('#btn_delete').css('display','none');
    		},400);	
    	}
    };
    
	
	//请求服务数据时所传参数
	function queryParams(params){
	    return{
	        //每页多少条数据
	        pageSize: params.limit,
	        //请求第几页
	        pageNumber:params.pageNumber
	    }
	}
	 //查询按钮事件
	$('#search_btn').click(function(){
	    $('#mytab').bootstrapTable('refresh', {url: '../MyEventAction/listPage.do'});
	})
	
	
	//tableHeight函数
    function tableHeight(){
        //可以根据自己页面情况进行调整
        return $(window).height() -280;
    }

	
	// ====================按钮的事件==============================
	/**
	 * 跳转新增页面
	 */
	$('#btn_add').click(function(){
		window.location.href = "../SysMemoAction/toSysMemoAdd.do";
	})
	
	/**
	 * 跳转修改页面
	 */
	$('#btn_edit').click(function(){
		// 获取参数
		var dataArr=$('#mytab').bootstrapTable('getSelections');
		
		var id = dataArr[0].id;
		var data={'sysMemoId':id};
		window.location.href = "../MyEventAction/toSysMemoUpdate.do?sysMemoId="+id;
		
	});
	
	  
	
	
	
	
	/**
	 * 删除方法
	 */
	$('#btn_delete').click(function(){
	   var dataArr=$('#mytab').bootstrapTable('getSelections');
	   var flag = confirm("确定要删除   选中的   菜单吗？");
	   
	   if(flag){
		   	var id=[];
	       	for(var i=0;i<dataArr.length;i++){
	       		id.push(dataArr[i].id);
	       	}
	       	var data={'sysMemoId':id};
	       	$.post("../MyEventAction/deleteBatchSysMemo.do",
        			data,
        			function(data){
        				if(data.status){
        					layer.msg('删除成功!',{icon:1,time:1000});	
        					window.location.href = "../SysMemoAction/toSysMemoList.do";
        				}else{
        					layer.msg(data.msg,{icon:2,time:1000});	
        				}
        			}
        	);
		   
		   
	   }
	})
	
	

	//==============通用方法==================================
  /**
   * 清空参数方法
   */
  function cleanInptAttribute() {
	  $(".inptAttribute").val("");
  }
  
 
	
})
