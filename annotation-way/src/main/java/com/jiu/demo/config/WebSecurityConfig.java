package com.jiu.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Package com.jiu.demo.config
 * ClassName WebSecurityConfig.java
 * Description WEB安全配置
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-23 15:54
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                //禁用csrf
                .csrf().disable()
                //不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests()
                //登录接口都可以访问
                .antMatchers("/login", "/sso/home", "/sso/otherLogin", "/ws/message", "/api").permitAll()
                //其他请求必须登录认证
                /*.anyRequest().authenticated()*/
                //禁用缓存
                .and().headers().cacheControl();
    }

}
