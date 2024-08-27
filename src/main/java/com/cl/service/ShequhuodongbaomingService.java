package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShequhuodongbaomingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequhuodongbaomingView;


/**
 * 社区活动报名
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ShequhuodongbaomingService extends IService<ShequhuodongbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequhuodongbaomingView> selectListView(Wrapper<ShequhuodongbaomingEntity> wrapper);
   	
   	ShequhuodongbaomingView selectView(@Param("ew") Wrapper<ShequhuodongbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequhuodongbaomingEntity> wrapper);
   	

}

