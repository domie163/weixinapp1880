package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuodongdingdanDao;
import com.entity.HuodongdingdanEntity;
import com.service.HuodongdingdanService;
import com.entity.vo.HuodongdingdanVO;
import com.entity.view.HuodongdingdanView;

@Service("huodongdingdanService")
public class HuodongdingdanServiceImpl extends ServiceImpl<HuodongdingdanDao, HuodongdingdanEntity> implements HuodongdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongdingdanEntity> page = this.selectPage(
                new Query<HuodongdingdanEntity>(params).getPage(),
                new EntityWrapper<HuodongdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongdingdanEntity> wrapper) {
		  Page<HuodongdingdanView> page =new Query<HuodongdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongdingdanVO> selectListVO(Wrapper<HuodongdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongdingdanVO selectVO(Wrapper<HuodongdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongdingdanView> selectListView(Wrapper<HuodongdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongdingdanView selectView(Wrapper<HuodongdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
