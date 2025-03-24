package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanpinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanpinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanpinfenleiView;


/**
 * 餐品分类
 *
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface CanpinfenleiService extends IService<CanpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanpinfenleiVO> selectListVO(Wrapper<CanpinfenleiEntity> wrapper);
   	
   	CanpinfenleiVO selectVO(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
   	
   	List<CanpinfenleiView> selectListView(Wrapper<CanpinfenleiEntity> wrapper);
   	
   	CanpinfenleiView selectView(@Param("ew") Wrapper<CanpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanpinfenleiEntity> wrapper);
   	
}

