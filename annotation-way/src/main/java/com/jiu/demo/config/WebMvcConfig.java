package com.jiu.demo.config;

import com.jiu.demo.config.handler.CustomRequestMappingHandlerMapping;
import com.jiu.demo.config.interceptor.CorsInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Package com.jiu.demo.config
 * ClassName WebMvcConfig.java
 * Description WEB配置
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-23 15:56
 **/
@Slf4j
@Configuration
public class WebMvcConfig implements WebMvcConfigurer, WebMvcRegistrations {

    @Bean
    public CorsInterceptor corsInterceptor() {
        CorsInterceptor corsInterceptor = new CorsInterceptor();
        return corsInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsInterceptor())
                .addPathPatterns("/**");
    }

    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new CustomRequestMappingHandlerMapping();
    }

}
