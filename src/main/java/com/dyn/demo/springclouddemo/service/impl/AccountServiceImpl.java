package com.dyn.demo.springclouddemo.service.impl;

import com.dyn.demo.springclouddemo.frame.base.MyServiceImpl;
import com.dyn.demo.springclouddemo.entity.Account;
import com.dyn.demo.springclouddemo.mapper.AccountMapper;
import com.dyn.demo.springclouddemo.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
@Service
public class AccountServiceImpl extends MyServiceImpl<AccountMapper, Account> implements IAccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        return accountMapper.add(account.getAccountName(), account.getAccountMoney());
    }

    @Override
    public int add2(Account account) {
        return accountMapper.add2(account);
    }

    /**
     * 声明事务
     * 当加注解@Transactional之后，两个人的钱都没有增减。当不加@Transactional，用户1减了10，用户2没有增加
     *
     * @param account
     */
    @Transactional
    @Override
    public void transfer(Account account) {
        account.setAccountId(1);
        account.setAccountMoney(90.0);
        accountMapper.updateById(account);

        int i = 1 / 0;
        account.setAccountId(2);
        account.setAccountMoney(110.0);
        accountMapper.updateById(account);
    }

}
