package com.xxxx.satokendemospringboot.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.stp.StpUtil;
import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.service.IRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private IRoleService roleService;

    @GetMapping("list")
    @SaCheckLogin
    public ResInfo getUserRoleList() {
        System.out.println(StpUtil.getLoginId());
        List<String> roleList = roleService.getRoleList(StpUtil.getLoginId());
        return ResInfo.success("获取用户角色成功", roleList);

    }

}
