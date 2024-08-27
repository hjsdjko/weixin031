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

import com.cl.entity.ToupiaoxinxiEntity;
import com.cl.entity.view.ToupiaoxinxiView;

import com.cl.service.ToupiaoxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 投票信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/toupiaoxinxi")
public class ToupiaoxinxiController {
    @Autowired
    private ToupiaoxinxiService toupiaoxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ToupiaoxinxiEntity toupiaoxinxi,
		HttpServletRequest request){
        EntityWrapper<ToupiaoxinxiEntity> ew = new EntityWrapper<ToupiaoxinxiEntity>();

		PageUtils page = toupiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toupiaoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ToupiaoxinxiEntity toupiaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<ToupiaoxinxiEntity> ew = new EntityWrapper<ToupiaoxinxiEntity>();

		PageUtils page = toupiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toupiaoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ToupiaoxinxiEntity toupiaoxinxi){
       	EntityWrapper<ToupiaoxinxiEntity> ew = new EntityWrapper<ToupiaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( toupiaoxinxi, "toupiaoxinxi")); 
        return R.ok().put("data", toupiaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ToupiaoxinxiEntity toupiaoxinxi){
        EntityWrapper< ToupiaoxinxiEntity> ew = new EntityWrapper< ToupiaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( toupiaoxinxi, "toupiaoxinxi")); 
		ToupiaoxinxiView toupiaoxinxiView =  toupiaoxinxiService.selectView(ew);
		return R.ok("查询投票信息成功").put("data", toupiaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ToupiaoxinxiEntity toupiaoxinxi = toupiaoxinxiService.selectById(id);
		toupiaoxinxi = toupiaoxinxiService.selectView(new EntityWrapper<ToupiaoxinxiEntity>().eq("id", id));
        return R.ok().put("data", toupiaoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ToupiaoxinxiEntity toupiaoxinxi = toupiaoxinxiService.selectById(id);
		toupiaoxinxi = toupiaoxinxiService.selectView(new EntityWrapper<ToupiaoxinxiEntity>().eq("id", id));
        return R.ok().put("data", toupiaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ToupiaoxinxiEntity toupiaoxinxi, HttpServletRequest request){
    	toupiaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toupiaoxinxi);
        toupiaoxinxiService.insert(toupiaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ToupiaoxinxiEntity toupiaoxinxi, HttpServletRequest request){
    	toupiaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toupiaoxinxi);
        toupiaoxinxiService.insert(toupiaoxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ToupiaoxinxiEntity toupiaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(toupiaoxinxi);
        toupiaoxinxiService.updateById(toupiaoxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        toupiaoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
