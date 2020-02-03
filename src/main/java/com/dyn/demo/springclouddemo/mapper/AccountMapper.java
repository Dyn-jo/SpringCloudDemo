package com.dyn.demo.springclouddemo.mapper;

import com.dyn.demo.springclouddemo.frame.base.MyBaseMapper;
import com.dyn.demo.springclouddemo.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
@Mapper
public interface AccountMapper extends MyBaseMapper<Account> {

    @Insert("insert into account(account_name, account_money) values(#{accountName}, #{accountMoney})")
    int add(@Param("accountName") String accountName, @Param("accountMoney") double accountMoney);

//    int add2(@Param("accountName") String accountName);

    int add2(@Param("account") Account account);

}
