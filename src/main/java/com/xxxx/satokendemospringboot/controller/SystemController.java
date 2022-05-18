package com.xxxx.satokendemospringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统表 前端控制器
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/system")
public class SystemController {
    @GetMapping("test")
    public String test() {
        return "系统用户";
    }

}
