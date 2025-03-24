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


import com.dao.TejiacanpinDao;
import com.entity.TejiacanpinEntity;
import com.service.TejiacanpinService;
import com.entity.vo.TejiacanpinVO;
import com.entity.view.TejiacanpinView;

@Service("tejiacanpinService")
public class TejiacanpinServiceImpl extends ServiceImpl<TejiacanpinDao, TejiacanpinEntity> implements TejiacanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TejiacanpinEntity> page = this.selectPage(
                new Query<TejiacanpinEntity>(params).getPage(),
                new EntityWrapper<TejiacanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TejiacanpinEntity> wrapper) {
		  Page<TejiacanpinView> page =new Query<TejiacanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TejiacanpinVO> selectListVO(Wrapper<TejiacanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TejiacanpinVO selectVO(Wrapper<TejiacanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TejiacanpinView> selectListView(Wrapper<TejiacanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TejiacanpinView selectView(Wrapper<TejiacanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
