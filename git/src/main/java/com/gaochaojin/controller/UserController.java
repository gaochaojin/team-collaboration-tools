package com.gaochaojin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 20:43 2019/4/9
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/hello")
    public Object sayHello() {
        logger.debug("springboot项目--版本v2.2----master和dev合并，解决冲突");
        return "hello";
    }
}
