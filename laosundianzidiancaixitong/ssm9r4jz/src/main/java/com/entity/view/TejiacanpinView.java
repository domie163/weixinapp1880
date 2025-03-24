package com.entity.view;

import com.entity.TejiacanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特价餐品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
@TableName("tejiacanpin")
public class TejiacanpinView  extends TejiacanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TejiacanpinView(){
	}
 
 	public TejiacanpinView(TejiacanpinEntity tejiacanpinEntity){
 	try {
			BeanUtils.copyProperties(this, tejiacanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
