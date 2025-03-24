package com.entity;

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
 * 特色餐品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
@TableName("tesecanpin")
public class TesecanpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TesecanpinEntity() {
		
	}
	
	public TesecanpinEntity(T t) {
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
	 * 餐品编号
	 */
					
	private String canpinbianhao;
	
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
	 * 设置：餐品编号
	 */
	public void setCanpinbianhao(String canpinbianhao) {
		this.canpinbianhao = canpinbianhao;
	}
	/**
	 * 获取：餐品编号
	 */
	public String getCanpinbianhao() {
		return canpinbianhao;
	}
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
