package com.nlzh.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.core.mapper.SysMemoMapper;
import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.query.SysMemoQuery;
import com.nlzh.core.service.SysMemoService;
import com.nlzh.my.pojo.MyEvent;

/**
 * 系统菜单
 * @author 13521
 *
 */
@Service
public class SysMemoServiceImpl implements SysMemoService {

	@Autowired
	private SysMemoMapper sysMemoMapper;

	@Override
	public int deleteByPrimaryKey(Long sysMemoId) {
		return sysMemoMapper.deleteByPrimaryKey(sysMemoId);
	}

	@Override
	public int insert(SysMemo sysMemo) {
		return sysMemoMapper.insertSelective(sysMemo);
	}

	@Override
	public SysMemo selectByPrimaryKey(Long sysMemoId) {
		return sysMemoMapper.selectByPrimaryKey(sysMemoId);
	}

	@Override
	public int updateByPrimaryKey(SysMemo sysMemo) {
		return sysMemoMapper.updateByPrimaryKeySelective(sysMemo);
	}

	@Override
	public List<SysMemo> listAll() {
		return sysMemoMapper.listAll();
	}

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo对象
	 * @param moduleName
	 * @return
	 */
	@Override
	public SysMemo selectBySysmemoanothername(String sysmemoanothername) {
		return sysMemoMapper.selectBySysmemoanothername(sysmemoanothername);
	}

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo对象（关联）
	 */
	@Override
	public SysMemo selectRelationBySysmemoanothername(String sysmemoanothername) {
		return sysMemoMapper.selectRelationBySysmemoanothername(sysmemoanothername);
	}

	
	@Override
	public Page<SysMemo> listPage(SysMemoQuery sysMemoQuery) {
		Page<SysMemo> page = new Page<SysMemo>();
		
		List<SysMemo> list = sysMemoMapper.listByQueryVO(sysMemoQuery);
		Long rows = sysMemoMapper.countByQueryVO(sysMemoQuery);
		
		page.setTotal(rows);
		page.setPageData(list);
		
		return page;
	}

	/**
	 * 批量删除
	 */
	@Override
	public Result deleteBatchSysMemot(Long[] sysMemoId) {
		Result result = new Result();
		
		if(sysMemoId == null || !(sysMemoId.length>0)){
			result.setStatus(false);
			result.setMsg("您没有选中菜单");
			return result;
		}
		
		for (Long id : sysMemoId) {
			sysMemoMapper.deleteByPrimaryKey(id);
		}
		
		result.setStatus(true);
		return result;
	}

}
