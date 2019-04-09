package com.gaochaojin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 11:38 2019/4/9
 */

@Controller
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String info(HttpServletRequest request, HttpServletResponse response) {//线程1

        logger.info(" UserController：index");
        return "index";
    }
}
