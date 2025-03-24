package com.dao;

import com.entity.TesecanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TesecanpinVO;
import com.entity.view.TesecanpinView;


/**
 * 特色餐品
 * 
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface TesecanpinDao extends BaseMapper<TesecanpinEntity> {
	
	List<TesecanpinVO> selectListVO(@Param("ew") Wrapper<TesecanpinEntity> wrapper);
	
	TesecanpinVO selectVO(@Param("ew") Wrapper<TesecanpinEntity> wrapper);
	
	List<TesecanpinView> selectListView(@Param("ew") Wrapper<TesecanpinEntity> wrapper);

	List<TesecanpinView> selectListView(Pagination page,@Param("ew") Wrapper<TesecanpinEntity> wrapper);
	
	TesecanpinView selectView(@Param("ew") Wrapper<TesecanpinEntity> wrapper);
	
}
