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

import com.cl.entity.BaoxiuEntity;
import com.cl.entity.view.BaoxiuView;

import com.cl.service.BaoxiuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 报修
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/baoxiu")
public class BaoxiuController {
    @Autowired
    private BaoxiuService baoxiuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoxiuEntity baoxiu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			baoxiu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoxiuEntity> ew = new EntityWrapper<BaoxiuEntity>();

		PageUtils page = baoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoxiuEntity baoxiu, 
		HttpServletRequest request){
        EntityWrapper<BaoxiuEntity> ew = new EntityWrapper<BaoxiuEntity>();

		PageUtils page = baoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoxiuEntity baoxiu){
       	EntityWrapper<BaoxiuEntity> ew = new EntityWrapper<BaoxiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoxiu, "baoxiu")); 
        return R.ok().put("data", baoxiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoxiuEntity baoxiu){
        EntityWrapper< BaoxiuEntity> ew = new EntityWrapper< BaoxiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoxiu, "baoxiu")); 
		BaoxiuView baoxiuView =  baoxiuService.selectView(ew);
		return R.ok("查询报修成功").put("data", baoxiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoxiuEntity baoxiu = baoxiuService.selectById(id);
		baoxiu = baoxiuService.selectView(new EntityWrapper<BaoxiuEntity>().eq("id", id));
        return R.ok().put("data", baoxiu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoxiuEntity baoxiu = baoxiuService.selectById(id);
		baoxiu = baoxiuService.selectView(new EntityWrapper<BaoxiuEntity>().eq("id", id));
        return R.ok().put("data", baoxiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoxiuEntity baoxiu, HttpServletRequest request){
    	baoxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiu);
        baoxiuService.insert(baoxiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaoxiuEntity baoxiu, HttpServletRequest request){
    	baoxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiu);
        baoxiuService.insert(baoxiu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaoxiuEntity baoxiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoxiu);
        baoxiuService.updateById(baoxiu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoxiuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
