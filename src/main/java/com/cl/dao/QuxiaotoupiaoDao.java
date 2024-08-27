package com.cl.dao;

import com.cl.entity.QuxiaotoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QuxiaotoupiaoView;


/**
 * 取消投票
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface QuxiaotoupiaoDao extends BaseMapper<QuxiaotoupiaoEntity> {
	
	List<QuxiaotoupiaoView> selectListView(@Param("ew") Wrapper<QuxiaotoupiaoEntity> wrapper);

	List<QuxiaotoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaotoupiaoEntity> wrapper);
	
	QuxiaotoupiaoView selectView(@Param("ew") Wrapper<QuxiaotoupiaoEntity> wrapper);
	

}
