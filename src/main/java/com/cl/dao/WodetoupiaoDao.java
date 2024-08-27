package com.cl.dao;

import com.cl.entity.WodetoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WodetoupiaoView;


/**
 * 我的投票
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface WodetoupiaoDao extends BaseMapper<WodetoupiaoEntity> {
	
	List<WodetoupiaoView> selectListView(@Param("ew") Wrapper<WodetoupiaoEntity> wrapper);

	List<WodetoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<WodetoupiaoEntity> wrapper);
	
	WodetoupiaoView selectView(@Param("ew") Wrapper<WodetoupiaoEntity> wrapper);
	

}
