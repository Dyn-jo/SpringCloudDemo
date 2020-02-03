package com.dyn.demo.springclouddemo.frame.exception;

import com.dyn.demo.springclouddemo.frame.response.CodeMessage;

public interface ErrorCodes {

    // 通用异常
    CodeMessage SUCCESS = CodeMessage.of("0000", "成功");

    CodeMessage SYSTEM_ERROR = CodeMessage.of("9999", "系统异常！");

}
