package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ToupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ToupiaoxinxiView;


/**
 * 投票信息
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface ToupiaoxinxiService extends IService<ToupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToupiaoxinxiView> selectListView(Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	ToupiaoxinxiView selectView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToupiaoxinxiEntity> wrapper);
   	

}

