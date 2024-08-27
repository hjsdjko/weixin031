package com.cl.dao;

import com.cl.entity.BaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaoxiuView;


/**
 * 报修
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface BaoxiuDao extends BaseMapper<BaoxiuEntity> {
	
	List<BaoxiuView> selectListView(@Param("ew") Wrapper<BaoxiuEntity> wrapper);

	List<BaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuEntity> wrapper);
	
	BaoxiuView selectView(@Param("ew") Wrapper<BaoxiuEntity> wrapper);
	

}
