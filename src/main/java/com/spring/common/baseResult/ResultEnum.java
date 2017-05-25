package com.spring.common.baseResult;

/**
 * Created by yuxin on 2017/3/15.
 */
public enum ResultEnum {

    ERROR(-1000, "系统异常", "系统异常，请稍后再试~"),
    PARAM_ERROR(-1001, "参数异常", "参数异常"),
    TEL_ERROR(-1002, "手机号不符合规范", "请输入正确的手机号"),
    USER_NOT_EXIST(-1003, "用户不存在", "用户不存在"),
    PASSWORD_ERROR(-1004, "密码错误", "密码错误"),
    NO_ACCESS(-1005, "无权操作", "无权操作");


    private int code;
    private String msg;
    private String showMsg;

    ResultEnum(int code, String msg, String showMsg) {
        this.code = code;
        this.msg = msg;
        this.showMsg = showMsg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getShowMsg() {
        return showMsg;
    }
}
