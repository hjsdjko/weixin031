package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.AboutusDao;
import com.cl.entity.AboutusEntity;
import com.cl.service.AboutusService;
import com.cl.entity.view.AboutusView;

@Service("aboutusService")
public class AboutusServiceImpl extends ServiceImpl<AboutusDao, AboutusEntity> implements AboutusService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AboutusEntity> page = this.selectPage(
                new Query<AboutusEntity>(params).getPage(),
                new EntityWrapper<AboutusEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AboutusEntity> wrapper) {
		  Page<AboutusView> page =new Query<AboutusView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<AboutusView> selectListView(Wrapper<AboutusEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AboutusView selectView(Wrapper<AboutusEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
