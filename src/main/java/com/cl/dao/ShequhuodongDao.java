package com.cl.dao;

import com.cl.entity.ShequhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequhuodongView;


/**
 * 社区活动
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ShequhuodongDao extends BaseMapper<ShequhuodongEntity> {
	
	List<ShequhuodongView> selectListView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);

	List<ShequhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	
	ShequhuodongView selectView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	

}
