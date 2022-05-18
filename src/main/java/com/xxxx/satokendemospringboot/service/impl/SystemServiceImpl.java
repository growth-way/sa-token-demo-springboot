package com.xxxx.satokendemospringboot.service.impl;

import com.xxxx.satokendemospringboot.pojo.System;
import com.xxxx.satokendemospringboot.mapper.SystemMapper;
import com.xxxx.satokendemospringboot.service.ISystemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统表 服务实现类
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@Service
public class SystemServiceImpl extends ServiceImpl<SystemMapper, System> implements ISystemService {

}
