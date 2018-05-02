package com.nlzh.core.service;

import java.util.List;

import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.query.SysMemoQuery;

/**
 * 菜单
 * @author 13521
 *
 */
public interface SysMemoService {
	
	int deleteByPrimaryKey(Long sysMemoId);

    int insert(SysMemo sysMemo);

    SysMemo selectByPrimaryKey(Long sysMemoId);

    int updateByPrimaryKey(SysMemo sysMemo);
    
	List<SysMemo> listAll();

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo对象
	 * @param sysmemoanothername
	 * @return
	 */
	SysMemo selectBySysmemoanothername(String sysmemoanothername);

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo对象(关联)
	 * @param moduleName
	 * @return
	 */
	SysMemo selectRelationBySysmemoanothername(String sysmemoanothername);

	Page<SysMemo> listPage(SysMemoQuery sysMemoQuery);

	/**
	 * 批量删除
	 * @param sysMemoId
	 * @return
	 */
	Result deleteBatchSysMemot(Long[] sysMemoId);
	
	
	
}
