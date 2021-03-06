//package com.spring.common.security;
//
//import com.spring.entity.User;
//import com.spring.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * Created by yuxin on 2017/6/13.
// */
//@Service
//public class UserSpringSecurityService {
//
//    @Autowired
//    UserService userService;
//
//    public User loadUserByTel(String tel) throws UsernameNotFoundException {
//        User user = userService.getByTel(tel);
//        if (null == user) {
//            throw new UsernameNotFoundException("用户不存在");
//        }
//        return user;
//    }
//
//    public static User getLoginUser() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null) {
//            Object principal = authentication.getPrincipal();
//            if (principal instanceof User) {
//                return (User) principal;
//            }
//        }
//        return null;
//    }
//}
