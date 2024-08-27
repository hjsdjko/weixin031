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

import com.cl.entity.ShequhuodongEntity;
import com.cl.entity.view.ShequhuodongView;

import com.cl.service.ShequhuodongService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区活动
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/shequhuodong")
public class ShequhuodongController {
    @Autowired
    private ShequhuodongService shequhuodongService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequhuodongEntity shequhuodong,
		HttpServletRequest request){
        EntityWrapper<ShequhuodongEntity> ew = new EntityWrapper<ShequhuodongEntity>();

		PageUtils page = shequhuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequhuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequhuodongEntity shequhuodong, 
		HttpServletRequest request){
        EntityWrapper<ShequhuodongEntity> ew = new EntityWrapper<ShequhuodongEntity>();

		PageUtils page = shequhuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequhuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequhuodongEntity shequhuodong){
       	EntityWrapper<ShequhuodongEntity> ew = new EntityWrapper<ShequhuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequhuodong, "shequhuodong")); 
        return R.ok().put("data", shequhuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequhuodongEntity shequhuodong){
        EntityWrapper< ShequhuodongEntity> ew = new EntityWrapper< ShequhuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequhuodong, "shequhuodong")); 
		ShequhuodongView shequhuodongView =  shequhuodongService.selectView(ew);
		return R.ok("查询社区活动成功").put("data", shequhuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequhuodongEntity shequhuodong = shequhuodongService.selectById(id);
		shequhuodong = shequhuodongService.selectView(new EntityWrapper<ShequhuodongEntity>().eq("id", id));
        return R.ok().put("data", shequhuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequhuodongEntity shequhuodong = shequhuodongService.selectById(id);
		shequhuodong = shequhuodongService.selectView(new EntityWrapper<ShequhuodongEntity>().eq("id", id));
        return R.ok().put("data", shequhuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
    	shequhuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequhuodong);
        shequhuodongService.insert(shequhuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
    	shequhuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequhuodong);
        shequhuodongService.insert(shequhuodong);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequhuodongEntity shequhuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequhuodong);
        shequhuodongService.updateById(shequhuodong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequhuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
