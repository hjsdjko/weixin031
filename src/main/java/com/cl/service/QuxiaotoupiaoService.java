package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QuxiaotoupiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QuxiaotoupiaoView;


/**
 * 取消投票
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
public interface QuxiaotoupiaoService extends IService<QuxiaotoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaotoupiaoView> selectListView(Wrapper<QuxiaotoupiaoEntity> wrapper);
   	
   	QuxiaotoupiaoView selectView(@Param("ew") Wrapper<QuxiaotoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaotoupiaoEntity> wrapper);
   	

}

