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

import com.cl.entity.ZixunEntity;
import com.cl.entity.view.ZixunView;

import com.cl.service.ZixunService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 资讯
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:52
 */
@RestController
@RequestMapping("/zixun")
public class ZixunController {
    @Autowired
    private ZixunService zixunService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunEntity zixun,
		HttpServletRequest request){
        EntityWrapper<ZixunEntity> ew = new EntityWrapper<ZixunEntity>();

		PageUtils page = zixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunEntity zixun, 
		HttpServletRequest request){
        EntityWrapper<ZixunEntity> ew = new EntityWrapper<ZixunEntity>();

		PageUtils page = zixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunEntity zixun){
       	EntityWrapper<ZixunEntity> ew = new EntityWrapper<ZixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixun, "zixun")); 
        return R.ok().put("data", zixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunEntity zixun){
        EntityWrapper< ZixunEntity> ew = new EntityWrapper< ZixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixun, "zixun")); 
		ZixunView zixunView =  zixunService.selectView(ew);
		return R.ok("查询资讯成功").put("data", zixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunEntity zixun = zixunService.selectById(id);
		zixun = zixunService.selectView(new EntityWrapper<ZixunEntity>().eq("id", id));
        return R.ok().put("data", zixun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunEntity zixun = zixunService.selectById(id);
		zixun = zixunService.selectView(new EntityWrapper<ZixunEntity>().eq("id", id));
        return R.ok().put("data", zixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunEntity zixun, HttpServletRequest request){
    	zixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixun);
        zixunService.insert(zixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunEntity zixun, HttpServletRequest request){
    	zixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixun);
        zixunService.insert(zixun);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixunEntity zixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixun);
        zixunService.updateById(zixun);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
