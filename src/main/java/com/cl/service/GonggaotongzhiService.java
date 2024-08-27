package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GonggaotongzhiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GonggaotongzhiView;


/**
 * 公告通知
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface GonggaotongzhiService extends IService<GonggaotongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaotongzhiView> selectListView(Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	GonggaotongzhiView selectView(@Param("ew") Wrapper<GonggaotongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaotongzhiEntity> wrapper);
   	

}

