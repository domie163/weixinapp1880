package com.entity.vo;

import com.entity.TejiacanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 特价餐品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public class TejiacanpinVO  implements Serializable {
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
	 * 原价格
	 */
	
	private Integer yuanjiage;
		
	/**
	 * 活动价格
	 */
	
	private Integer huodongjiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
				
	
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
	 * 设置：原价格
	 */
	 
	public void setYuanjiage(Integer yuanjiage) {
		this.yuanjiage = yuanjiage;
	}
	
	/**
	 * 获取：原价格
	 */
	public Integer getYuanjiage() {
		return yuanjiage;
	}
				
	
	/**
	 * 设置：活动价格
	 */
	 
	public void setHuodongjiage(Integer huodongjiage) {
		this.huodongjiage = huodongjiage;
	}
	
	/**
	 * 获取：活动价格
	 */
	public Integer getHuodongjiage() {
		return huodongjiage;
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
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
			
}
