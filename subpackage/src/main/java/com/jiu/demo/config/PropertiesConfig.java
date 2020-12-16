package com.jiu.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Package com.jiu.demo.config
 * ClassName PropertiesConfig.java
 * Description 配置文件属性
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-25 15:05
 **/
@Component
@ConfigurationProperties(prefix = "business")
@Data
public class PropertiesConfig {

    private String systemStartTime;

}
