package com.cl.dao;

import com.cl.entity.GonggaotongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GonggaotongzhiView;


/**
 * 公告通知
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface GonggaotongzhiDao extends BaseMapper<GonggaotongzhiEntity> {
	
	List<GonggaotongzhiView> selectListView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);

	List<GonggaotongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	
	GonggaotongzhiView selectView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
	

}
