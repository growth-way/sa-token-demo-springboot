package com.xxxx.satokendemospringboot.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    // 登录认证：只有登录之后才能进入该方法
    @SaCheckLogin
    @GetMapping("info")
    public String info() {
        return "查询用户信息";
    }

    // 角色认证：必须具有指定角色才能进入该方法
    @SaCheckRole("系统管理员")
    @PostMapping("add")
    public String add() {
        return "用户增加";
    }


}
