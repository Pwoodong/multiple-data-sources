package com.jiu.demo.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Package com.jiu.demo.config.datasource
 * ClassName DataSourceMaterConfig.java
 * Description 主数据源
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-16 15:41
 **/
@Configuration
@MapperScan(basePackages = "com.jiu.demo.mapper.master",sqlSessionFactoryRef = "masterSqlSessionFactory")
public class DataSourceMaterConfig {

    public final static String mapperXmlLocation = "classpath:mapper/*/*.xml";

    @Bean(name = "masterDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(masterDataSource());
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperXmlLocation));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "masterDataSourceTransactionManager")
    @Primary
    public DataSourceTransactionManager masterDataSourceTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

}
