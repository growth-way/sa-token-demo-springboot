package com.xxxx.satokendemospringboot.mapper;

import com.xxxx.satokendemospringboot.pojo.Role;
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
public interface RoleMapper extends BaseMapper<Role> {

    List<String> getRoleList(Object loginId);
}
