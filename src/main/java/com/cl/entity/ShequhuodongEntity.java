package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 社区活动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@TableName("shequhuodong")
public class ShequhuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShequhuodongEntity() {
		
	}
	
	public ShequhuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动标题
	 */
					
	private String huodongbiaoti;
	
	/**
	 * 社区活动描述
	 */
					
	private String shequhuodongmiaoshu;
	
	/**
	 * 活动时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huodongshijian;
	
	/**
	 * 活动地点
	 */
					
	private String huodongdidian;
	
	/**
	 * 人数
	 */
					
	private Integer renshu;
	
	/**
	 * 举办者
	 */
					
	private String jubanzhe;
	
	/**
	 * 报名开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baomingkaishishijian;
	
	/**
	 * 报名结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baomingjieshushijian;
	
	/**
	 * 取消规则
	 */
					
	private String quxiaoguize;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动标题
	 */
	public void setHuodongbiaoti(String huodongbiaoti) {
		this.huodongbiaoti = huodongbiaoti;
	}
	/**
	 * 获取：活动标题
	 */
	public String getHuodongbiaoti() {
		return huodongbiaoti;
	}
	/**
	 * 设置：社区活动描述
	 */
	public void setShequhuodongmiaoshu(String shequhuodongmiaoshu) {
		this.shequhuodongmiaoshu = shequhuodongmiaoshu;
	}
	/**
	 * 获取：社区活动描述
	 */
	public String getShequhuodongmiaoshu() {
		return shequhuodongmiaoshu;
	}
	/**
	 * 设置：活动时间
	 */
	public void setHuodongshijian(Date huodongshijian) {
		this.huodongshijian = huodongshijian;
	}
	/**
	 * 获取：活动时间
	 */
	public Date getHuodongshijian() {
		return huodongshijian;
	}
	/**
	 * 设置：活动地点
	 */
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
	/**
	 * 设置：人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
	/**
	 * 设置：举办者
	 */
	public void setJubanzhe(String jubanzhe) {
		this.jubanzhe = jubanzhe;
	}
	/**
	 * 获取：举办者
	 */
	public String getJubanzhe() {
		return jubanzhe;
	}
	/**
	 * 设置：报名开始时间
	 */
	public void setBaomingkaishishijian(Date baomingkaishishijian) {
		this.baomingkaishishijian = baomingkaishishijian;
	}
	/**
	 * 获取：报名开始时间
	 */
	public Date getBaomingkaishishijian() {
		return baomingkaishishijian;
	}
	/**
	 * 设置：报名结束时间
	 */
	public void setBaomingjieshushijian(Date baomingjieshushijian) {
		this.baomingjieshushijian = baomingjieshushijian;
	}
	/**
	 * 获取：报名结束时间
	 */
	public Date getBaomingjieshushijian() {
		return baomingjieshushijian;
	}
	/**
	 * 设置：取消规则
	 */
	public void setQuxiaoguize(String quxiaoguize) {
		this.quxiaoguize = quxiaoguize;
	}
	/**
	 * 获取：取消规则
	 */
	public String getQuxiaoguize() {
		return quxiaoguize;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
