package com.xxxx.satokendemospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 17482
 */
@RestController
@RequestMapping("vip")
public class VipController {
    @GetMapping("test")
    public String test() {
        return "vip用户专区";
    }
}
