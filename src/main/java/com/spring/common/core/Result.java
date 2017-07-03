package com.spring.common.core;

import com.alibaba.fastjson.JSON;

/**
 * Created by yuxin on 2017/6/30.
 * API统一封装结果
 */
public class Result {
    private int code;
    private String message;
    private String showMessage;
    private Object data;

    public int getCode() {
        return code;
    }

    public Result setCode(ResultCode resultCode) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getShowMessage() {
        return showMessage;
    }

    public Result setShowMessage(String showMessage) {
        this.showMessage = showMessage;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
