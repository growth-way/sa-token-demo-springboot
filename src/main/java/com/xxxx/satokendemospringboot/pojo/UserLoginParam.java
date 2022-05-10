package com.xxxx.satokendemospringboot.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 17482
 */
@Data
@ApiModel(description = "用户实体对象")
public class UserLoginParam {
    @ApiModelProperty(value = "用户名",required = true)
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @ApiModelProperty(value = "用户名",required = true)
    @NotBlank(message = "密码不能为空")
    private String userPwd;
}
