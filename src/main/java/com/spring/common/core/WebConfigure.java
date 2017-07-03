package com.spring.common.core;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by yuxin on 2017/6/30.
 */
public class WebConfigure extends WebMvcConfigurerAdapter {

    private final Logger logger = LoggerFactory.getLogger(WebConfigure.class);

    //异常统一处理
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new HandlerExceptionResolver() {
            @Override
            public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
                Result result = new Result();
                if (handler instanceof HandlerMethod) {
                    HandlerMethod handlerMethod = (HandlerMethod) handler;

                    if (e instanceof ServiceException) {
                        //业务失败（错误信息不抛出到客户端）
                        result.setCode(ResultCode.FAIL).setShowMessage("业务失败");
                        logger.error(e.getMessage());
                    } else {
                        result.setCode(ResultCode.INTERNAL_SERVER_ERROR).setShowMessage("接口错误");
                        String msg = new StringBuilder("接口{uri}出现异常,方法:{class}{method},异常信息:{error}"
                                .replace("{uri}", request.getRequestURI())
                                .replace("{class}", handlerMethod.getBean().getClass().getName())
                                .replace("{method}", handlerMethod.getMethod().getName())
                                .replace("{error}", e.getMessage())).toString();
                        logger.error(msg, e);
                    }
                } else {
                    if (e instanceof NoHandlerFoundException) {
                        result.setCode(ResultCode.NOT_FOUND).setMessage("接口【" + request.getRequestURI() + "】不存在");
                    } else {
                        result.setCode(ResultCode.INTERNAL_SERVER_ERROR).setMessage("接口错误");
                        logger.error(e.getMessage(), e);
                    }
                }
                responseResult(response, result);
                return new ModelAndView();
            }
        });
    }

    private void responseResult(HttpServletResponse response, Result result) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setStatus(200);
        try {
            response.getWriter().write(JSON.toJSONString(result));
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
