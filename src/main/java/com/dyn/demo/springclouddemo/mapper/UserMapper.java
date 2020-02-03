package com.dyn.demo.springclouddemo.mapper;

import com.dyn.demo.springclouddemo.frame.base.MyBaseMapper;
import com.dyn.demo.springclouddemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
@Mapper
public interface UserMapper extends MyBaseMapper<User> {

}
