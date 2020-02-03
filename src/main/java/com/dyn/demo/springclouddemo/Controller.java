package com.dyn.demo.springclouddemo;

import com.dyn.demo.springclouddemo.frame.bean.ConfigBean;
import com.dyn.demo.springclouddemo.frame.bean.PropBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ConfigBean configBean;

    @Autowired
    PropBean propBean;

    @RequestMapping("/hello")
    public String helloSpringBoot() {
        int a = 0;
        System.out.println(configBean.getName() + "," + configBean.getAge());
        System.out.println(propBean.toString());
        System.out.println();
        return configBean.toString();
    }

}
