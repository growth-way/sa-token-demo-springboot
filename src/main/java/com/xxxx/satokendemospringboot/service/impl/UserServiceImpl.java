package com.xxxx.satokendemospringboot.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.mapper.UserMapper;
import com.xxxx.satokendemospringboot.pojo.User;
import com.xxxx.satokendemospringboot.pojo.UserLoginParam;
import com.xxxx.satokendemospringboot.service.IUserService;
import com.xxxx.satokendemospringboot.utils.AssertUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public ResInfo doLogin(UserLoginParam userLoginParam) {
        //获取用户
        User user = userMapper.selectOne(new QueryWrapper<User>().
                eq("userName", userLoginParam.getUserName()).
                eq("userPwd", userLoginParam.getUserPwd()));
        //判断用户
        AssertUtil.isTrue(null==user, "请检查用户名或密码");
        StpUtil.login(userMapper.selectIdByUserName(userLoginParam.getUserName()));
        Map<String,String> resultMap= new HashMap<>();
        resultMap.put("username", userLoginParam.getUserName());
        resultMap.put("token", StpUtil.getTokenValue());
        return ResInfo.success("登陆成功", resultMap);
    }
}
