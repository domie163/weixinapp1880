package com.entity.view;

import com.entity.TesecanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特色餐品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
@TableName("tesecanpin")
public class TesecanpinView  extends TesecanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TesecanpinView(){
	}
 
 	public TesecanpinView(TesecanpinEntity tesecanpinEntity){
 	try {
			BeanUtils.copyProperties(this, tesecanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
