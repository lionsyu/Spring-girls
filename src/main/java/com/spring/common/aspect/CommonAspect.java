//package com.spring.common.aspect;
//
//import com.alibaba.fastjson.JSON;
//import com.spring.common.baseResult.JsonFactory;
//import com.spring.common.baseResult.ResultEnum;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StopWatch;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by yuxin on 2017/3/14.
// */
//@Component
//@Order(9999)
//@Aspect
//public class CommonAspect {
//
//    Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Pointcut("execution(public * com.spring.controller.*(..))")
//    public void aop(){}
//
//    @Around("aop()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        try {
//            StopWatch clock = new StopWatch();
//            clock.start();
//            Object o = pjp.proceed();
//            clock.stop();
//            long cost = clock.getTotalTimeMillis();
//            if (cost > 1000) {
//                logger.info("cost:{}ms invoke method:{},args:{}", cost, pjp.getSignature(), JSON.toJSONString(pjp.getArgs()));
//            }
//            return o;
//        } catch (Throwable e) {
//            logger.error("invoke method:" + pjp.getSignature() + ",args:" + JSON.toJSONString(pjp.getArgs()) + " error", e);
//            return new JsonFactory<Void>().errorFactory(ResultEnum.ERROR);
//        }
//    }
//
//    @Before("aop()")
//    public void requestInfo(JoinPoint joinPoint){
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        logger.info("url={}",request.getRequestURL());
//        logger.info("method={}",request.getMethod());
//        logger.info("ip={}",request.getRemoteAddr());
//        logger.info("class_method={}",joinPoint.getSignature().getDeclaringType()+"."+joinPoint.getSignature().getDeclaringTypeName() );
//        logger.info("args={}",joinPoint.getArgs());
//    }
//
//
//}
