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


import com.cl.dao.QuxiaotoupiaoDao;
import com.cl.entity.QuxiaotoupiaoEntity;
import com.cl.service.QuxiaotoupiaoService;
import com.cl.entity.view.QuxiaotoupiaoView;

@Service("quxiaotoupiaoService")
public class QuxiaotoupiaoServiceImpl extends ServiceImpl<QuxiaotoupiaoDao, QuxiaotoupiaoEntity> implements QuxiaotoupiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaotoupiaoEntity> page = this.selectPage(
                new Query<QuxiaotoupiaoEntity>(params).getPage(),
                new EntityWrapper<QuxiaotoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaotoupiaoEntity> wrapper) {
		  Page<QuxiaotoupiaoView> page =new Query<QuxiaotoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QuxiaotoupiaoView> selectListView(Wrapper<QuxiaotoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaotoupiaoView selectView(Wrapper<QuxiaotoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
