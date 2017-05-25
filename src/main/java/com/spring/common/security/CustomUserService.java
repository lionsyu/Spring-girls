//package com.spring.common.security;
//import com.spring.entity.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
///**
// * Created by yuxin on 2017/3/15.
// */
//public class CustomUserService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
//         User user = new User();
//         if (user == null){
//             throw new UsernameNotFoundException("用户名不存在");
//         }
//         return user;
//    }
//}
