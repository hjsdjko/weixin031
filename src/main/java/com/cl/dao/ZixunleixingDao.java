package com.cl.dao;

import com.cl.entity.ZixunleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunleixingView;


/**
 * 资讯类型
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ZixunleixingDao extends BaseMapper<ZixunleixingEntity> {
	
	List<ZixunleixingView> selectListView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);

	List<ZixunleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	
	ZixunleixingView selectView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	

}
