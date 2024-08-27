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

import com.cl.entity.GonggaotongzhiEntity;
import com.cl.entity.view.GonggaotongzhiView;

import com.cl.service.GonggaotongzhiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 公告通知
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/gonggaotongzhi")
public class GonggaotongzhiController {
    @Autowired
    private GonggaotongzhiService gonggaotongzhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggaotongzhiEntity gonggaotongzhi,
		HttpServletRequest request){
        EntityWrapper<GonggaotongzhiEntity> ew = new EntityWrapper<GonggaotongzhiEntity>();

		PageUtils page = gonggaotongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaotongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggaotongzhiEntity gonggaotongzhi, 
		HttpServletRequest request){
        EntityWrapper<GonggaotongzhiEntity> ew = new EntityWrapper<GonggaotongzhiEntity>();

		PageUtils page = gonggaotongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaotongzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggaotongzhiEntity gonggaotongzhi){
       	EntityWrapper<GonggaotongzhiEntity> ew = new EntityWrapper<GonggaotongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggaotongzhi, "gonggaotongzhi")); 
        return R.ok().put("data", gonggaotongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggaotongzhiEntity gonggaotongzhi){
        EntityWrapper< GonggaotongzhiEntity> ew = new EntityWrapper< GonggaotongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggaotongzhi, "gonggaotongzhi")); 
		GonggaotongzhiView gonggaotongzhiView =  gonggaotongzhiService.selectView(ew);
		return R.ok("查询公告通知成功").put("data", gonggaotongzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GonggaotongzhiEntity gonggaotongzhi = gonggaotongzhiService.selectById(id);
		gonggaotongzhi = gonggaotongzhiService.selectView(new EntityWrapper<GonggaotongzhiEntity>().eq("id", id));
        return R.ok().put("data", gonggaotongzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GonggaotongzhiEntity gonggaotongzhi = gonggaotongzhiService.selectById(id);
		gonggaotongzhi = gonggaotongzhiService.selectView(new EntityWrapper<GonggaotongzhiEntity>().eq("id", id));
        return R.ok().put("data", gonggaotongzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggaotongzhiEntity gonggaotongzhi, HttpServletRequest request){
    	gonggaotongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaotongzhi);
        gonggaotongzhiService.insert(gonggaotongzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggaotongzhiEntity gonggaotongzhi, HttpServletRequest request){
    	gonggaotongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaotongzhi);
        gonggaotongzhiService.insert(gonggaotongzhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GonggaotongzhiEntity gonggaotongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggaotongzhi);
        gonggaotongzhiService.updateById(gonggaotongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggaotongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
