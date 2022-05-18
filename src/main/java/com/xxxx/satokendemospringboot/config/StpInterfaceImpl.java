package com.xxxx.satokendemospringboot.config;

import cn.dev33.satoken.stp.StpInterface;
import com.xxxx.satokendemospringboot.pojo.User;
import com.xxxx.satokendemospringboot.service.IRoleService;
import com.xxxx.satokendemospringboot.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

import static cn.dev33.satoken.sso.SaSsoConsts.ParamName.loginId;

/**
 * @author 17482
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private RoleServiceImpl roleService;

    @Override
    public List<String> getPermissionList(Object loginId, String s) {
        return null;
    }

    @Override
    public List<String> getRoleList(Object userStr, String s) {
        String str = (String) userStr;
        System.out.println();
        return roleService.getRoleList(((String) userStr).split(",")[0].split("=")[1]);
    }
}
