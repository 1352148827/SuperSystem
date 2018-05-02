// bootstrapTable公共的方法
//删除按钮与修改按钮的出现与消失
$('.bootstrap-table').change(function(){
	alert(dataArr);
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
});

//tableHeight函数
function tableHeight(){
    //可以根据自己页面情况进行调整
    return $(window).height() -280;
}