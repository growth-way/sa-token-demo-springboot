package com.xxxx.satokendemospringboot;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.NotRoleException;
import com.xxxx.satokendemospringboot.base.ResInfo;
import com.xxxx.satokendemospringboot.exceptions.ParamsException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 17482
 */
@ControllerAdvice
public class GlobalExceptionResolver{

    /**
     * 参数异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = ParamsException.class)
    @ResponseBody
    public ResInfo resolverParamsException(ParamsException e) {
        ResInfo resInfo = new ResInfo();
        resInfo.setCode(e.getCode());
        resInfo.setMsg(e.getMsg());
        return resInfo;
    }

    /**
     * validation数据校验不通过
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResInfo resolverBindException(BindException e) {
        ResInfo resInfo = new ResInfo();
        resInfo.setCode(500);
        resInfo.setMsg(e.getBindingResult().getFieldError().getDefaultMessage());
        return resInfo;
    }

    /**
     * 未登录异常
     */
    @ExceptionHandler(value = NotLoginException.class)
    @ResponseBody
    public ResInfo resolverBindException(NotLoginException e) {
        ResInfo resInfo = new ResInfo();
        resInfo.setCode(500);
        resInfo.setMsg("尚未登陆，请登录");
        return resInfo;
    }
    /**
     * 权限不足
     */
    @ExceptionHandler(value = {NotRoleException.class,NotPermissionException.class})
    @ResponseBody
    public ResInfo resolverNotRoleException(NotRoleException e) {
        ResInfo resInfo = new ResInfo();
        resInfo.setCode(500);
        resInfo.setMsg("权限不足");
        return resInfo;
    }
}
