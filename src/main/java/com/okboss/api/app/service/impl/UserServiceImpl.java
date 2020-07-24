package com.okboss.api.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.okboss.api.app.entity.User;
import com.okboss.api.app.entity.vo.UserVO;
import com.okboss.api.app.mapper.UserMapper;
import com.okboss.api.app.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author kk
 * @since 2020-06-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public IPage<UserVO> pageList(Page<UserVO> page, Map<String, String> param) {
		return userMapper.pageList(page, param);
	}

	@Override
	public List<UserVO> list(Map<String, String> param) {
		return userMapper.list(param);
	}
}
