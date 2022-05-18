package com.xxxx.satokendemospringboot.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.pojo.UserLoginParam;
import com.xxxx.satokendemospringboot.service.IUserService;
import com.xxxx.satokendemospringboot.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 登录实现类
 * @author 17482
 */
@RestController
@CrossOrigin
public class LoginController {
    @Resource
    private UserServiceImpl userService;
    /**
     * 用户登录
     * @param userLoginParam
     * @return
     */
    @PostMapping("doLogin")
    public ResInfo doLogin(@Valid UserLoginParam userLoginParam) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        return userService.doLogin(userLoginParam);
    }
    // 查询登录状态
    @GetMapping("isLogin")
    public SaResult isLogin() {
        return SaResult.ok("是否登录：" + StpUtil.isLogin());
    }

    // 注销
    @PostMapping("logout")
    public SaResult logout() {
        StpUtil.logout();
        return SaResult.ok();
    }
}
