package com.lsc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lsc
 * @version 1.0.0
 * @date 2022/11/7 13:53
 * @Description
 */

@RestController
public class TestController {


    @RequestMapping(value = "/test")
    public String testJenkins() {
        return "测试jenkins服务";
    }



}
