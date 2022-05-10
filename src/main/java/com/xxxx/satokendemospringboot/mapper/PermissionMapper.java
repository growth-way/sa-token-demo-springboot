package com.xxxx.satokendemospringboot.mapper;

import com.xxxx.satokendemospringboot.pojo.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
public interface PermissionMapper extends BaseMapper<Permission> {


    List<String> getPermissionList(Object loginId);
}
