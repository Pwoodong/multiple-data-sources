package com.jiu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 * @author liaoyj
 **/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AnnotationWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationWayApplication.class, args);
    }
}
