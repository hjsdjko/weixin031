package com.cl.entity.view;

import com.cl.entity.QuxiaotoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 取消投票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-08 17:59:53
 */
@TableName("quxiaotoupiao")
public class QuxiaotoupiaoView  extends QuxiaotoupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaotoupiaoView(){
	}
 
 	public QuxiaotoupiaoView(QuxiaotoupiaoEntity quxiaotoupiaoEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaotoupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
