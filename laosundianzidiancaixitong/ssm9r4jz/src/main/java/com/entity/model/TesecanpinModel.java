package com.entity.model;

import com.entity.TesecanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 特色餐品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public class TesecanpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐品名称
	 */
	
	private String canpinmingcheng;
		
	/**
	 * 餐品分类
	 */
	
	private String canpinfenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：餐品名称
	 */
	 
	public void setCanpinmingcheng(String canpinmingcheng) {
		this.canpinmingcheng = canpinmingcheng;
	}
	
	/**
	 * 获取：餐品名称
	 */
	public String getCanpinmingcheng() {
		return canpinmingcheng;
	}
				
	
	/**
	 * 设置：餐品分类
	 */
	 
	public void setCanpinfenlei(String canpinfenlei) {
		this.canpinfenlei = canpinfenlei;
	}
	
	/**
	 * 获取：餐品分类
	 */
	public String getCanpinfenlei() {
		return canpinfenlei;
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
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
