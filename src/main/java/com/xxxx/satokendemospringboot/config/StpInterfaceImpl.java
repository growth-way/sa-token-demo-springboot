package com.xxxx.satokendemospringboot.config;

import cn.dev33.satoken.stp.StpInterface;
import com.xxxx.satokendemospringboot.service.IPermissionService;
import com.xxxx.satokendemospringboot.service.IRoleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 17482
 */
@Component
public class StpInterfaceImpl implements StpInterface {
    @Resource
    private IPermissionService permissionService;
    @Resource
    private IRoleService roleService;
    @Override
    public List<String> getPermissionList(Object loginId, String s) {
        return permissionService.getPermissionList(loginId);
    }

    @Override
    public List<String> getRoleList(Object loginId, String s) {
        return roleService.getRoleList(loginId);
    }
}
