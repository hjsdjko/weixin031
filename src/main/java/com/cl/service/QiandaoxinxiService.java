package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QiandaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QiandaoxinxiView;


/**
 * 签到信息
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface QiandaoxinxiService extends IService<QiandaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaoxinxiView> selectListView(Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	QiandaoxinxiView selectView(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaoxinxiEntity> wrapper);
   	

}

