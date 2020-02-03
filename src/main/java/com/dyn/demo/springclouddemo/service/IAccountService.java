package com.dyn.demo.springclouddemo.service;

import com.dyn.demo.springclouddemo.entity.Account;
import com.dyn.demo.springclouddemo.frame.base.MyBaseService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
public interface IAccountService extends MyBaseService<Account> {

    int add(Account account);

    int add2(Account account);

    void transfer(Account account);

}
