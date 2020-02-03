package com.dyn.demo.springclouddemo.service.impl;

import com.dyn.demo.springclouddemo.frame.base.MyServiceImpl;
import com.dyn.demo.springclouddemo.entity.User;
import com.dyn.demo.springclouddemo.mapper.UserMapper;
import com.dyn.demo.springclouddemo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
@Service
public class UserServiceImpl extends MyServiceImpl<UserMapper, User> implements IUserService {


}
