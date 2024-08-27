package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZixunEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunView;


/**
 * 资讯
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:52
 */
public interface ZixunService extends IService<ZixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunView> selectListView(Wrapper<ZixunEntity> wrapper);
   	
   	ZixunView selectView(@Param("ew") Wrapper<ZixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunEntity> wrapper);
   	

}

