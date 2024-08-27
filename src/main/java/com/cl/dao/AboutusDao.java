package com.cl.dao;

import com.cl.entity.AboutusEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.AboutusView;


/**
 * 物业信息
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface AboutusDao extends BaseMapper<AboutusEntity> {
	
	List<AboutusView> selectListView(@Param("ew") Wrapper<AboutusEntity> wrapper);

	List<AboutusView> selectListView(Pagination page,@Param("ew") Wrapper<AboutusEntity> wrapper);
	
	AboutusView selectView(@Param("ew") Wrapper<AboutusEntity> wrapper);
	

}
