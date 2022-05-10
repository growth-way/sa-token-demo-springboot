package com.xxxx.satokendemospringboot.mapper;

import com.xxxx.satokendemospringboot.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author queening
 * @since 2022-05-09
 */
public interface UserMapper extends BaseMapper<User> {

    Integer selectIdByUserName(String userName);
}
