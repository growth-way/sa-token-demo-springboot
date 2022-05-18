package com.xxxx.satokendemospringboot.config;

import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpLogic;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 17482
 */
@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册Sa-Token的路由拦截器
        registry.addInterceptor(new SaRouteInterceptor((req, res, handler)->{
            SaRouter.match("/user/**", r -> StpUtil.checkLogin());
            SaRouter.match("/system/**", r -> StpUtil.checkRole("admin"));
            SaRouter.match("/role/**", r -> StpUtil.checkRole("admin"));
            SaRouter.match("/user/**", r -> StpUtil.checkRole("user"));
            SaRouter.match("/vip/**", r -> StpUtil.checkRole("vip"));

        }))
                .addPathPatterns("/**")
                .excludePathPatterns("/doLogin")
        .excludePathPatterns("/doc.html");

    }

}
