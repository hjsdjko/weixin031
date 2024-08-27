package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WodetoupiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WodetoupiaoView;


/**
 * 我的投票
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface WodetoupiaoService extends IService<WodetoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodetoupiaoView> selectListView(Wrapper<WodetoupiaoEntity> wrapper);
   	
   	WodetoupiaoView selectView(@Param("ew") Wrapper<WodetoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodetoupiaoEntity> wrapper);
   	

}

