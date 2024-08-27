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


import com.cl.dao.WodetoupiaoDao;
import com.cl.entity.WodetoupiaoEntity;
import com.cl.service.WodetoupiaoService;
import com.cl.entity.view.WodetoupiaoView;

@Service("wodetoupiaoService")
public class WodetoupiaoServiceImpl extends ServiceImpl<WodetoupiaoDao, WodetoupiaoEntity> implements WodetoupiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodetoupiaoEntity> page = this.selectPage(
                new Query<WodetoupiaoEntity>(params).getPage(),
                new EntityWrapper<WodetoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodetoupiaoEntity> wrapper) {
		  Page<WodetoupiaoView> page =new Query<WodetoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WodetoupiaoView> selectListView(Wrapper<WodetoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodetoupiaoView selectView(Wrapper<WodetoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
