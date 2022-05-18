package com.xxxx.satokendemospringboot.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.mapper.RoleMapper;
import com.xxxx.satokendemospringboot.pojo.User;
import com.xxxx.satokendemospringboot.mapper.UserMapper;
import com.xxxx.satokendemospringboot.pojo.UserLoginParam;
import com.xxxx.satokendemospringboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.satokendemospringboot.utils.AssertUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public ResInfo doLogin(UserLoginParam userLoginParam) {
        //获取用户
        User user = userMapper.selectOne(new QueryWrapper<User>().
                eq("username", userLoginParam.getUsername()).
                eq("password", userLoginParam.getPassword()));
        //判断用户
        AssertUtil.isTrue(null==user, "请检查用户名或密码");
        StpUtil.login(userMapper.selectOne(new QueryWrapper<User>().select("id").eq("username", userLoginParam.getUsername())));
        Map<String,Object> resultMap= new HashMap<>();
        resultMap.put("username", userLoginParam.getUsername());
        resultMap.put("token", StpUtil.getTokenValue());
        return ResInfo.success("登陆成功", resultMap);
    }
}
