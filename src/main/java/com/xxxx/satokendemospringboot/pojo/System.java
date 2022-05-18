package com.xxxx.satokendemospringboot.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统表
 * </p>
 *
 * @author queening
 * @since 2022-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_system")
@ApiModel(value="System对象", description="系统表")
public class System implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "网站名")
    private String websiteName;

    @ApiModelProperty(value = "注册开关")
    private Integer registerSwitch;

    @ApiModelProperty(value = "审核开关")
    private Integer auditSwitch;

    @ApiModelProperty(value = "验证码开关")
    private Integer codeSwitch;

    @ApiModelProperty(value = "评论开关")
    private Integer commentSwitch;

    @ApiModelProperty(value = "版权")
    private String copyright;

    @ApiModelProperty(value = "网站状态")
    private Long status;


}
