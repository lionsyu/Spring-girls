package com.spring.common.baseResult;

/**
 * Created by yuxin on 2017/6/7.
 */
public enum ResultCode {

    SUCCESS("200", "成功"),

    BAD_REQUEST("400", "请求错误"),

    FORBIDDEN("403", "无权访问"),

    NOT_FOUND("404", "请求失败"),

    METHOD_NOT_ALLOWED("405", "请求方法不能被用于请求相应的资源"),

    INTERNAL_SERVER_ERROR("500", "服务器异常");

    private ResultCode(String value, String msg){
        this.val = value;
        this.msg = msg;
    }

    public String val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    private String val;
    private String msg;
}
