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


import com.dao.TesecanpinDao;
import com.entity.TesecanpinEntity;
import com.service.TesecanpinService;
import com.entity.vo.TesecanpinVO;
import com.entity.view.TesecanpinView;

@Service("tesecanpinService")
public class TesecanpinServiceImpl extends ServiceImpl<TesecanpinDao, TesecanpinEntity> implements TesecanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TesecanpinEntity> page = this.selectPage(
                new Query<TesecanpinEntity>(params).getPage(),
                new EntityWrapper<TesecanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TesecanpinEntity> wrapper) {
		  Page<TesecanpinView> page =new Query<TesecanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TesecanpinVO> selectListVO(Wrapper<TesecanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TesecanpinVO selectVO(Wrapper<TesecanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TesecanpinView> selectListView(Wrapper<TesecanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TesecanpinView selectView(Wrapper<TesecanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
