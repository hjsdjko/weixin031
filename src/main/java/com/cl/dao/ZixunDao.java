package com.cl.dao;

import com.cl.entity.ZixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunView;


/**
 * 资讯
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:59:52
 */
public interface ZixunDao extends BaseMapper<ZixunEntity> {
	
	List<ZixunView> selectListView(@Param("ew") Wrapper<ZixunEntity> wrapper);

	List<ZixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunEntity> wrapper);
	
	ZixunView selectView(@Param("ew") Wrapper<ZixunEntity> wrapper);
	

}
