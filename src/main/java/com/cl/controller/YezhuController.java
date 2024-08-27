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

import com.cl.entity.YezhuEntity;
import com.cl.entity.view.YezhuView;

import com.cl.service.YezhuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 业主
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:59:52
 */
@RestController
@RequestMapping("/yezhu")
public class YezhuController {
    @Autowired
    private YezhuService yezhuService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		YezhuEntity u = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", username));
        if(u==null || !u.getMima().equals(password)) {
            return R.error("账号或密码不正确");
        }
        if(!"是".equals(u.getSfsh())) return R.error("账号已锁定，请联系管理员审核。");
		String token = tokenService.generateToken(u.getId(), username,"yezhu",  "业主" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody YezhuEntity yezhu){
    	//ValidatorUtils.validateEntity(yezhu);
    	YezhuEntity u = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", yezhu.getZhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		yezhu.setId(uId);
        yezhuService.insert(yezhu);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        YezhuEntity u = yezhuService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	YezhuEntity u = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        yezhuService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YezhuEntity yezhu,
		HttpServletRequest request){
        EntityWrapper<YezhuEntity> ew = new EntityWrapper<YezhuEntity>();

		PageUtils page = yezhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yezhu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YezhuEntity yezhu, 
		HttpServletRequest request){
        EntityWrapper<YezhuEntity> ew = new EntityWrapper<YezhuEntity>();

		PageUtils page = yezhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yezhu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YezhuEntity yezhu){
       	EntityWrapper<YezhuEntity> ew = new EntityWrapper<YezhuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yezhu, "yezhu")); 
        return R.ok().put("data", yezhuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YezhuEntity yezhu){
        EntityWrapper< YezhuEntity> ew = new EntityWrapper< YezhuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yezhu, "yezhu")); 
		YezhuView yezhuView =  yezhuService.selectView(ew);
		return R.ok("查询业主成功").put("data", yezhuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YezhuEntity yezhu = yezhuService.selectById(id);
		yezhu = yezhuService.selectView(new EntityWrapper<YezhuEntity>().eq("id", id));
        return R.ok().put("data", yezhu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YezhuEntity yezhu = yezhuService.selectById(id);
		yezhu = yezhuService.selectView(new EntityWrapper<YezhuEntity>().eq("id", id));
        return R.ok().put("data", yezhu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YezhuEntity yezhu, HttpServletRequest request){
    	yezhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yezhu);
    	YezhuEntity u = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", yezhu.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		yezhu.setId(new Date().getTime());
        yezhuService.insert(yezhu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YezhuEntity yezhu, HttpServletRequest request){
    	yezhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yezhu);
    	YezhuEntity u = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", yezhu.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		yezhu.setId(new Date().getTime());
        yezhuService.insert(yezhu);
        return R.ok();
    }

     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        YezhuEntity yezhu = yezhuService.selectOne(new EntityWrapper<YezhuEntity>().eq("zhanghao", username));
        return R.ok().put("data", yezhu);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody YezhuEntity yezhu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yezhu);
        yezhuService.updateById(yezhu);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<YezhuEntity> list = new ArrayList<YezhuEntity>();
        for(Long id : ids) {
            YezhuEntity yezhu = yezhuService.selectById(id);
            yezhu.setSfsh(sfsh);
            yezhu.setShhf(shhf);
            list.add(yezhu);
        }
        yezhuService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yezhuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
