package com.xxxx.satokendemospringboot.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 17482
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResInfo {
    private long code;
    private String msg;
    private Object object;

    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static ResInfo success(String msg) {
        return new ResInfo(200, msg, null);
    }

    public static ResInfo success(String msg, Object object) {
        return new ResInfo(200, msg, object);
    }

    /**
     * 失败返回
     * @param msg
     * @return
     */
    public static ResInfo error(String msg) {
        return new ResInfo(500, msg, null);
    }

    public static ResInfo error(String msg, Object object) {
        return new ResInfo(500, msg, object);
    }
}
