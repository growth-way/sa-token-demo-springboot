package com.xxxx.satokendemospringboot.service;

import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.satokendemospringboot.pojo.UserLoginParam;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
public interface IUserService extends IService<User> {

    ResInfo doLogin(UserLoginParam userLoginParam);
}
