package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShequhuodongEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequhuodongView;


/**
 * 社区活动
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ShequhuodongService extends IService<ShequhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequhuodongView> selectListView(Wrapper<ShequhuodongEntity> wrapper);
   	
   	ShequhuodongView selectView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequhuodongEntity> wrapper);
   	

}

