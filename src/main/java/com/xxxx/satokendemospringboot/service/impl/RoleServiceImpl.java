package com.xxxx.satokendemospringboot.service.impl;

import com.xxxx.satokendemospringboot.pojo.Role;
import com.xxxx.satokendemospringboot.mapper.RoleMapper;
import com.xxxx.satokendemospringboot.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<String> getRoleList(Object loginId) {
        return roleMapper.getRoleList(loginId);
    }

    @Override
    public Object getList() {
        return roleMapper.selectList(null);
    }
}
