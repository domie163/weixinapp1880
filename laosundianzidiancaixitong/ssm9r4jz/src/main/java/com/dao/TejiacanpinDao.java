package com.dao;

import com.entity.TejiacanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TejiacanpinVO;
import com.entity.view.TejiacanpinView;


/**
 * 特价餐品
 * 
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface TejiacanpinDao extends BaseMapper<TejiacanpinEntity> {
	
	List<TejiacanpinVO> selectListVO(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
	
	TejiacanpinVO selectVO(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
	
	List<TejiacanpinView> selectListView(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);

	List<TejiacanpinView> selectListView(Pagination page,@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
	
	TejiacanpinView selectView(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
	
}
