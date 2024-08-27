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


import com.cl.dao.BaoxiuDao;
import com.cl.entity.BaoxiuEntity;
import com.cl.service.BaoxiuService;
import com.cl.entity.view.BaoxiuView;

@Service("baoxiuService")
public class BaoxiuServiceImpl extends ServiceImpl<BaoxiuDao, BaoxiuEntity> implements BaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiuEntity> page = this.selectPage(
                new Query<BaoxiuEntity>(params).getPage(),
                new EntityWrapper<BaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiuEntity> wrapper) {
		  Page<BaoxiuView> page =new Query<BaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BaoxiuView> selectListView(Wrapper<BaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiuView selectView(Wrapper<BaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
