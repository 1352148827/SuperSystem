package com.nlzh.my.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nlzh.my.pojo.MyEvent;
import com.nlzh.my.query.MyEventQueryVO;

public interface MyEventMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MyEvent record);

    int insertSelective(MyEvent record);

    MyEvent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MyEvent record);

    int updateByPrimaryKey(MyEvent record);

	List<MyEvent> listAll();

	/**
	 * 多条件获取记录
	 * @param myEventQueryVO
	 * @return
	 */
	List<MyEvent> selectByQueryVO(MyEventQueryVO myEventQueryVO);

	/**
	 * 多条件获取记录数
	 * @param myEventQueryVO
	 * @return
	 */
	Long countByQueryVO(MyEventQueryVO myEventQueryVO);

	/**
	 * 批量删除
	 * @param id
	 * @return
	 */
	int deleteBatchMyEvent(@Param("id")Long[] id);
}