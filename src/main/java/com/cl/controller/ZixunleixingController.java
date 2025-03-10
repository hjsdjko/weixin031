package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZixunleixingEntity;
import com.cl.entity.view.ZixunleixingView;

import com.cl.service.ZixunleixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 资讯类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/zixunleixing")
public class ZixunleixingController {
    @Autowired
    private ZixunleixingService zixunleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunleixingEntity zixunleixing,
		HttpServletRequest request){
        EntityWrapper<ZixunleixingEntity> ew = new EntityWrapper<ZixunleixingEntity>();

		PageUtils page = zixunleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunleixingEntity zixunleixing, 
		HttpServletRequest request){
        EntityWrapper<ZixunleixingEntity> ew = new EntityWrapper<ZixunleixingEntity>();

		PageUtils page = zixunleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunleixingEntity zixunleixing){
       	EntityWrapper<ZixunleixingEntity> ew = new EntityWrapper<ZixunleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixunleixing, "zixunleixing")); 
        return R.ok().put("data", zixunleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunleixingEntity zixunleixing){
        EntityWrapper< ZixunleixingEntity> ew = new EntityWrapper< ZixunleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixunleixing, "zixunleixing")); 
		ZixunleixingView zixunleixingView =  zixunleixingService.selectView(ew);
		return R.ok("查询资讯类型成功").put("data", zixunleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunleixingEntity zixunleixing = zixunleixingService.selectById(id);
		zixunleixing = zixunleixingService.selectView(new EntityWrapper<ZixunleixingEntity>().eq("id", id));
        return R.ok().put("data", zixunleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunleixingEntity zixunleixing = zixunleixingService.selectById(id);
		zixunleixing = zixunleixingService.selectView(new EntityWrapper<ZixunleixingEntity>().eq("id", id));
        return R.ok().put("data", zixunleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunleixingEntity zixunleixing, HttpServletRequest request){
    	zixunleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunleixing);
        zixunleixingService.insert(zixunleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunleixingEntity zixunleixing, HttpServletRequest request){
    	zixunleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunleixing);
        zixunleixingService.insert(zixunleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixunleixingEntity zixunleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixunleixing);
        zixunleixingService.updateById(zixunleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
