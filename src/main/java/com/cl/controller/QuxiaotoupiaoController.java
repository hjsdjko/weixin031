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

import com.cl.entity.QuxiaotoupiaoEntity;
import com.cl.entity.view.QuxiaotoupiaoView;

import com.cl.service.QuxiaotoupiaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消投票
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@RestController
@RequestMapping("/quxiaotoupiao")
public class QuxiaotoupiaoController {
    @Autowired
    private QuxiaotoupiaoService quxiaotoupiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaotoupiaoEntity quxiaotoupiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			quxiaotoupiao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaotoupiaoEntity> ew = new EntityWrapper<QuxiaotoupiaoEntity>();

		PageUtils page = quxiaotoupiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotoupiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaotoupiaoEntity quxiaotoupiao, 
		HttpServletRequest request){
        EntityWrapper<QuxiaotoupiaoEntity> ew = new EntityWrapper<QuxiaotoupiaoEntity>();

		PageUtils page = quxiaotoupiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotoupiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaotoupiaoEntity quxiaotoupiao){
       	EntityWrapper<QuxiaotoupiaoEntity> ew = new EntityWrapper<QuxiaotoupiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaotoupiao, "quxiaotoupiao")); 
        return R.ok().put("data", quxiaotoupiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaotoupiaoEntity quxiaotoupiao){
        EntityWrapper< QuxiaotoupiaoEntity> ew = new EntityWrapper< QuxiaotoupiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaotoupiao, "quxiaotoupiao")); 
		QuxiaotoupiaoView quxiaotoupiaoView =  quxiaotoupiaoService.selectView(ew);
		return R.ok("查询取消投票成功").put("data", quxiaotoupiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaotoupiaoEntity quxiaotoupiao = quxiaotoupiaoService.selectById(id);
		quxiaotoupiao = quxiaotoupiaoService.selectView(new EntityWrapper<QuxiaotoupiaoEntity>().eq("id", id));
        return R.ok().put("data", quxiaotoupiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaotoupiaoEntity quxiaotoupiao = quxiaotoupiaoService.selectById(id);
		quxiaotoupiao = quxiaotoupiaoService.selectView(new EntityWrapper<QuxiaotoupiaoEntity>().eq("id", id));
        return R.ok().put("data", quxiaotoupiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaotoupiaoEntity quxiaotoupiao, HttpServletRequest request){
    	quxiaotoupiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaotoupiao);
        quxiaotoupiaoService.insert(quxiaotoupiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaotoupiaoEntity quxiaotoupiao, HttpServletRequest request){
    	quxiaotoupiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaotoupiao);
        quxiaotoupiaoService.insert(quxiaotoupiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QuxiaotoupiaoEntity quxiaotoupiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaotoupiao);
        quxiaotoupiaoService.updateById(quxiaotoupiao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaotoupiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
