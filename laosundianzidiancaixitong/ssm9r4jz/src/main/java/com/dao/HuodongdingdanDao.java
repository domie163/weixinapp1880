package com.dao;

import com.entity.HuodongdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongdingdanVO;
import com.entity.view.HuodongdingdanView;


/**
 * 活动订单
 * 
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface HuodongdingdanDao extends BaseMapper<HuodongdingdanEntity> {
	
	List<HuodongdingdanVO> selectListVO(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
	
	HuodongdingdanVO selectVO(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
	
	List<HuodongdingdanView> selectListView(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);

	List<HuodongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
	
	HuodongdingdanView selectView(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
	
}
