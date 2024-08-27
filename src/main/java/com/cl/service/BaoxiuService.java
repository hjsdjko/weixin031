package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BaoxiuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaoxiuView;


/**
 * 报修
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface BaoxiuService extends IService<BaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiuView> selectListView(Wrapper<BaoxiuEntity> wrapper);
   	
   	BaoxiuView selectView(@Param("ew") Wrapper<BaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiuEntity> wrapper);
   	

}

