package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TesecanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TesecanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TesecanpinView;


/**
 * 特色餐品
 *
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface TesecanpinService extends IService<TesecanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TesecanpinVO> selectListVO(Wrapper<TesecanpinEntity> wrapper);
   	
   	TesecanpinVO selectVO(@Param("ew") Wrapper<TesecanpinEntity> wrapper);
   	
   	List<TesecanpinView> selectListView(Wrapper<TesecanpinEntity> wrapper);
   	
   	TesecanpinView selectView(@Param("ew") Wrapper<TesecanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TesecanpinEntity> wrapper);
   	
}

