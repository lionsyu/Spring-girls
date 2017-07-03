package com.spring.common.core;

/**
 * Created by yuxin on 2017/6/30.
 * 业务异常，该异常只做INFO级别日志记录
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 8664020015144214757L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
