package com.spring.common.aspect;

import com.spring.common.core.Result;
import com.spring.common.core.ResultCode;
import com.spring.common.core.ServiceException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yuxin on 2017/3/17.
 */
@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * com.spring.controller.)")
    public void log() {

    }
}
