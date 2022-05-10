package com.xxxx.satokendemospringboot;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 17482
 */
@SpringBootApplication
@MapperScan("com.xxxx.satokendemospringboot.mapper")
public class SaTokenDemoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaTokenDemoSpringbootApplication.class, args);
        System.out.println("启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
