package com.xxxx.satokendemospringboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.satokendemospringboot.pojo.Permission;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
public interface IPermissionService extends IService<Permission> {
    /**
     *获取用户权限码
     * @return
     */
    List<String> getPermissionList(Object loginId);



}
