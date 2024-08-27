package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZixunleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunleixingView;


/**
 * 资讯类型
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ZixunleixingService extends IService<ZixunleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunleixingView> selectListView(Wrapper<ZixunleixingEntity> wrapper);
   	
   	ZixunleixingView selectView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunleixingEntity> wrapper);
   	

}

