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

import com.cl.entity.ShequhuodongbaomingEntity;
import com.cl.entity.view.ShequhuodongbaomingView;

import com.cl.service.ShequhuodongbaomingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区活动报名
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/shequhuodongbaoming")
public class ShequhuodongbaomingController {
    @Autowired
    private ShequhuodongbaomingService shequhuodongbaomingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequhuodongbaomingEntity shequhuodongbaoming,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			shequhuodongbaoming.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShequhuodongbaomingEntity> ew = new EntityWrapper<ShequhuodongbaomingEntity>();

		PageUtils page = shequhuodongbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequhuodongbaoming), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequhuodongbaomingEntity shequhuodongbaoming, 
		HttpServletRequest request){
        EntityWrapper<ShequhuodongbaomingEntity> ew = new EntityWrapper<ShequhuodongbaomingEntity>();

		PageUtils page = shequhuodongbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequhuodongbaoming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequhuodongbaomingEntity shequhuodongbaoming){
       	EntityWrapper<ShequhuodongbaomingEntity> ew = new EntityWrapper<ShequhuodongbaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequhuodongbaoming, "shequhuodongbaoming")); 
        return R.ok().put("data", shequhuodongbaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequhuodongbaomingEntity shequhuodongbaoming){
        EntityWrapper< ShequhuodongbaomingEntity> ew = new EntityWrapper< ShequhuodongbaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequhuodongbaoming, "shequhuodongbaoming")); 
		ShequhuodongbaomingView shequhuodongbaomingView =  shequhuodongbaomingService.selectView(ew);
		return R.ok("查询社区活动报名成功").put("data", shequhuodongbaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequhuodongbaomingEntity shequhuodongbaoming = shequhuodongbaomingService.selectById(id);
		shequhuodongbaoming = shequhuodongbaomingService.selectView(new EntityWrapper<ShequhuodongbaomingEntity>().eq("id", id));
        return R.ok().put("data", shequhuodongbaoming);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequhuodongbaomingEntity shequhuodongbaoming = shequhuodongbaomingService.selectById(id);
		shequhuodongbaoming = shequhuodongbaomingService.selectView(new EntityWrapper<ShequhuodongbaomingEntity>().eq("id", id));
        return R.ok().put("data", shequhuodongbaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequhuodongbaomingEntity shequhuodongbaoming, HttpServletRequest request){
    	shequhuodongbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequhuodongbaoming);
        shequhuodongbaomingService.insert(shequhuodongbaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequhuodongbaomingEntity shequhuodongbaoming, HttpServletRequest request){
    	shequhuodongbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequhuodongbaoming);
        shequhuodongbaomingService.insert(shequhuodongbaoming);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequhuodongbaomingEntity shequhuodongbaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequhuodongbaoming);
        shequhuodongbaomingService.updateById(shequhuodongbaoming);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequhuodongbaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
