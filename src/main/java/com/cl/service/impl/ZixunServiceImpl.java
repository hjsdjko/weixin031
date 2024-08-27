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


import com.cl.dao.ZixunDao;
import com.cl.entity.ZixunEntity;
import com.cl.service.ZixunService;
import com.cl.entity.view.ZixunView;

@Service("zixunService")
public class ZixunServiceImpl extends ServiceImpl<ZixunDao, ZixunEntity> implements ZixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunEntity> page = this.selectPage(
                new Query<ZixunEntity>(params).getPage(),
                new EntityWrapper<ZixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunEntity> wrapper) {
		  Page<ZixunView> page =new Query<ZixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZixunView> selectListView(Wrapper<ZixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunView selectView(Wrapper<ZixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
