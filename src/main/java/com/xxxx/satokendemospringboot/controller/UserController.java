package com.xxxx.satokendemospringboot.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("info")
    public String info() {
        return "查询用户信息";
    }
}
