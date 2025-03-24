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


import com.dao.CanpinfenleiDao;
import com.entity.CanpinfenleiEntity;
import com.service.CanpinfenleiService;
import com.entity.vo.CanpinfenleiVO;
import com.entity.view.CanpinfenleiView;

@Service("canpinfenleiService")
public class CanpinfenleiServiceImpl extends ServiceImpl<CanpinfenleiDao, CanpinfenleiEntity> implements CanpinfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanpinfenleiEntity> page = this.selectPage(
                new Query<CanpinfenleiEntity>(params).getPage(),
                new EntityWrapper<CanpinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanpinfenleiEntity> wrapper) {
		  Page<CanpinfenleiView> page =new Query<CanpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanpinfenleiVO> selectListVO(Wrapper<CanpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanpinfenleiVO selectVO(Wrapper<CanpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanpinfenleiView> selectListView(Wrapper<CanpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanpinfenleiView selectView(Wrapper<CanpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
