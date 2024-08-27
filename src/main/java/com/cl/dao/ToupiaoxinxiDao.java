package com.cl.dao;

import com.cl.entity.ToupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ToupiaoxinxiView;


/**
 * 投票信息
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ToupiaoxinxiDao extends BaseMapper<ToupiaoxinxiEntity> {
	
	List<ToupiaoxinxiView> selectListView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);

	List<ToupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	
	ToupiaoxinxiView selectView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	

}
