package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TejiacanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TejiacanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TejiacanpinView;


/**
 * 特价餐品
 *
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface TejiacanpinService extends IService<TejiacanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TejiacanpinVO> selectListVO(Wrapper<TejiacanpinEntity> wrapper);
   	
   	TejiacanpinVO selectVO(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
   	
   	List<TejiacanpinView> selectListView(Wrapper<TejiacanpinEntity> wrapper);
   	
   	TejiacanpinView selectView(@Param("ew") Wrapper<TejiacanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TejiacanpinEntity> wrapper);
   	
}

