package com.jiu.demo.config.annotation;

import java.lang.annotation.*;

/**
 * Package com.jiu.demo.config.annotation
 * ClassName ApiVersion.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-23
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {

    /**
     * 标识版本号，从1开始
     */
    int value() default 1;

}
