package com.spring.common.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Created by yuxin on 2017/5/23.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    private UserSpringSecurityService userSpringSecurityService;


    @Autowired
    public void setUserSecurityService(UserSpringSecurityService userSpringSecurityService) {
        this.userSpringSecurityService = userSpringSecurityService;
    }

    /**
     * 重载configure
     * configure(WebSecurity):配置Spring Security的Filter链
     * configure(HttpSecurity):配置如何通过拦截器保护请求
     * configure(AuthenticationManagerBuilder)配置user-detail
     */


//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin().and().
//                authorizeRequests().antMatchers("/").authenticated()
//                .antMatchers(HttpMethod.POST, "/").authenticated();
//        //.anyRequest().permitAll();
//        // 下面指定url强制使用https
//        //.and().requiresChannel().antMatchers("/").requiresSecure();
//        // 下面指定url强制使用http
//        //.and().requiresChannel().antMatchers("/").requiresInsecure();
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/").permitAll()
//                .antMatchers("/user/**").hasRole("USER")
//                .and()
//                .formLogin().loginPage("/login").defaultSuccessUrl("/user")
//                .and()
//                .logout().logoutUrl("/logout").logoutSuccessUrl("/login");
//    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").authenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailsService());
    }
}
