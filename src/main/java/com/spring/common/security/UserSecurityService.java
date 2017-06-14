//package com.spring.common.security;
//
//import com.spring.entity.User;
//import com.spring.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by yuxin on 2017/3/15.
// */
//@Service
//public class UserSecurityService implements UserDetailsService {
//
//
//    @Autowired
//    UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // TODO: 2017/6/12 需要username查询
//        User user = userService.getByTel(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        List<SimpleGrantedAuthority> list = createAuthority(user.getRole());
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), list);
//    }
//
//    private List<SimpleGrantedAuthority> createAuthority(Integer role) {
//        List<SimpleGrantedAuthority> list = new ArrayList<>();
//        if (User.RoleTypes.root.equals(role)) {
//            list.add(new SimpleGrantedAuthority("root"));
//        }
//        if (User.RoleTypes.user.equals(role)) {
//            list.add(new SimpleGrantedAuthority("user"));
//        }
//        return list;
//    }
//}
