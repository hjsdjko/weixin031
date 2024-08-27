package com.cl.dao;

import com.cl.entity.ShequhuodongbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequhuodongbaomingView;


/**
 * 社区活动报名
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ShequhuodongbaomingDao extends BaseMapper<ShequhuodongbaomingEntity> {
	
	List<ShequhuodongbaomingView> selectListView(@Param("ew") Wrapper<ShequhuodongbaomingEntity> wrapper);

	List<ShequhuodongbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<ShequhuodongbaomingEntity> wrapper);
	
	ShequhuodongbaomingView selectView(@Param("ew") Wrapper<ShequhuodongbaomingEntity> wrapper);
	

}
