package com.xxxx.satokendemospringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.satokendemospringboot.mapper.PermissionMapper;
import com.xxxx.satokendemospringboot.pojo.Permission;
import com.xxxx.satokendemospringboot.service.IPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<String> getPermissionList(Object loginId) {
        return permissionMapper.getPermissionList(loginId);
    }
}
