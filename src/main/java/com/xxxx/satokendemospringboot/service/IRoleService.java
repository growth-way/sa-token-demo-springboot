package com.xxxx.satokendemospringboot.service;

import com.xxxx.satokendemospringboot.pojo.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
public interface IRoleService extends IService<Role> {

    /**
     * 返回用户角色
     * @param loginId
     * @return
     */
    List<String> getRoleList(Object loginId);
}
