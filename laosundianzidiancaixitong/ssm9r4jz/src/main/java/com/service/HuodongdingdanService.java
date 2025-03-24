package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongdingdanView;


/**
 * 活动订单
 *
 * @author 
 * @email 
 * @date 2021-01-20 10:28:23
 */
public interface HuodongdingdanService extends IService<HuodongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongdingdanVO> selectListVO(Wrapper<HuodongdingdanEntity> wrapper);
   	
   	HuodongdingdanVO selectVO(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
   	
   	List<HuodongdingdanView> selectListView(Wrapper<HuodongdingdanEntity> wrapper);
   	
   	HuodongdingdanView selectView(@Param("ew") Wrapper<HuodongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongdingdanEntity> wrapper);
   	
}

