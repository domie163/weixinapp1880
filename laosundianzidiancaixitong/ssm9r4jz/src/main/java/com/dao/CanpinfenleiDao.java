package com.dao;

import com.entity.CanpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanpinfenleiVO;
import com.entity.view.CanpinfenleiView;


/**
 * 餐品分类
 * 
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface CanpinfenleiDao extends BaseMapper<CanpinfenleiEntity> {
	
	List<CanpinfenleiVO> selectListVO(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
	
	CanpinfenleiVO selectVO(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
	
	List<CanpinfenleiView> selectListView(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);

	List<CanpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
	
	CanpinfenleiView selectView(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
	
}
