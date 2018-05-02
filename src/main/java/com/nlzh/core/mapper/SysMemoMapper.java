package com.nlzh.core.mapper;

import java.util.List;

import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.query.SysMemoQuery;
import com.nlzh.my.pojo.MyEvent;
import com.nlzh.my.query.MyEventQueryVO;

public interface SysMemoMapper {
    int deleteByPrimaryKey(Long sysMemoId);

    int insert(SysMemo record);

    int insertSelective(SysMemo record);

    SysMemo selectByPrimaryKey(Long sysMemoId);

    int updateByPrimaryKeySelective(SysMemo record);

    int updateByPrimaryKey(SysMemo record);

	List<SysMemo> listAll();

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo对象
	 * @param sysmemoanothername
	 * @return
	 */
	SysMemo selectBySysmemoanothername(String sysmemoanothername);

	/**
	 * 通过Sysmemoanothername（系统别名）来获取SysMemo(关联)对象
	 * @param sysmemoanothername
	 * @return
	 */
	SysMemo selectRelationBySysmemoanothername(String sysmemoanothername);
	
	/**
	 * 多条件获取记录
	 * @param myEventQueryVO
	 * @return
	 */
	List<SysMemo> listByQueryVO(SysMemoQuery sysMemoQuery);

	/**
	 * 多条件获取记录数
	 * @param myEventQueryVO
	 * @return
	 */
	Long countByQueryVO(SysMemoQuery sysMemoQuery);


}