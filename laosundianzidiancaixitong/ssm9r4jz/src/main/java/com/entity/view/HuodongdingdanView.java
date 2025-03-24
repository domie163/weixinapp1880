package com.entity.view;

import com.entity.HuodongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
@TableName("huodongdingdan")
public class HuodongdingdanView  extends HuodongdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongdingdanView(){
	}
 
 	public HuodongdingdanView(HuodongdingdanEntity huodongdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, huodongdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
