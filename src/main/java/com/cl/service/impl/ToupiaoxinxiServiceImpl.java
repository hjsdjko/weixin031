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


import com.cl.dao.ToupiaoxinxiDao;
import com.cl.entity.ToupiaoxinxiEntity;
import com.cl.service.ToupiaoxinxiService;
import com.cl.entity.view.ToupiaoxinxiView;

@Service("toupiaoxinxiService")
public class ToupiaoxinxiServiceImpl extends ServiceImpl<ToupiaoxinxiDao, ToupiaoxinxiEntity> implements ToupiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToupiaoxinxiEntity> page = this.selectPage(
                new Query<ToupiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ToupiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToupiaoxinxiEntity> wrapper) {
		  Page<ToupiaoxinxiView> page =new Query<ToupiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ToupiaoxinxiView> selectListView(Wrapper<ToupiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToupiaoxinxiView selectView(Wrapper<ToupiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
