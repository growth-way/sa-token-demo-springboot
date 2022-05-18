package com.xxxx.satokendemospringboot.controller;


import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.service.IRoleService;
import com.xxxx.satokendemospringboot.service.impl.RoleServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleServiceImpl roleService;

    @GetMapping("list")
    public ResInfo getRoleList() {
       return ResInfo.success("获取成功", roleService.getList());
    }

}
