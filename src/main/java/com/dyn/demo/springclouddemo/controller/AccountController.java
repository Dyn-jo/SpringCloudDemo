package com.dyn.demo.springclouddemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dyn.demo.springclouddemo.entity.Account;
import com.dyn.demo.springclouddemo.frame.base.MyBaseController;
import com.dyn.demo.springclouddemo.frame.response.GenericResponse;
import com.dyn.demo.springclouddemo.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dyn
 * @since 2020-01-30
 */
@Api
@RestController
@RequestMapping("/account")
public class AccountController extends MyBaseController {

    @Autowired
    IAccountService iAccountService;

    @ApiOperation(value = "获取列表", notes = "获取列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public GenericResponse<IPage> list() {
//        List<Account> accountList = iAccountService.list();
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        IPage page = iAccountService.page(new Page(0, 2), wrapper);

        List<Account> accountList = page.getRecords();
        accountList.stream().forEach(System.out :: println);
        return GenericResponse.build(page);
//        return GenericResponse.build(ErrorCodes.SYSTEM_ERROR);
//        return GenericResponse.build(ErrorCodes.SYSTEM_ERROR, page);
    }

    @RequestMapping("/add")
    public GenericResponse<List<Account>> add(@RequestBody Account account) {
        int result = iAccountService.add(account);
        System.out.println("执行行：" + result);
        List<Account> accountList = iAccountService.list();
        accountList.stream().forEach(System.out :: println);
        return GenericResponse.build(accountList);
    }

    @RequestMapping("/add2")
    public List<Account> add2(@RequestBody Account account) {
        int result = iAccountService.add2(account);
        System.out.println("执行行：" + result);
        List<Account> accountList = iAccountService.list();
        accountList.stream().forEach(System.out :: println);
        return accountList;
    }

    @RequestMapping("/transfer")
    public void transfer(@RequestBody Account account) {
//        throw new BusinessException(ErrorCodes.SYSTEM_ERROR);
        iAccountService.transfer(account);
    }

}
