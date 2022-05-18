package com.xxxx.satokendemospringboot.service;

import com.xxxx.satokendemospringboot.pojo.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
public interface IRoleService extends IService<Role> {

    List<String> getRoleList(Object loginId);

    Object getList();
}
