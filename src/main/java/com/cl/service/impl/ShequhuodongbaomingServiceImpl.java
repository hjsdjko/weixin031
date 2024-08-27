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


import com.cl.dao.ShequhuodongbaomingDao;
import com.cl.entity.ShequhuodongbaomingEntity;
import com.cl.service.ShequhuodongbaomingService;
import com.cl.entity.view.ShequhuodongbaomingView;

@Service("shequhuodongbaomingService")
public class ShequhuodongbaomingServiceImpl extends ServiceImpl<ShequhuodongbaomingDao, ShequhuodongbaomingEntity> implements ShequhuodongbaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequhuodongbaomingEntity> page = this.selectPage(
                new Query<ShequhuodongbaomingEntity>(params).getPage(),
                new EntityWrapper<ShequhuodongbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequhuodongbaomingEntity> wrapper) {
		  Page<ShequhuodongbaomingView> page =new Query<ShequhuodongbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShequhuodongbaomingView> selectListView(Wrapper<ShequhuodongbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequhuodongbaomingView selectView(Wrapper<ShequhuodongbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
