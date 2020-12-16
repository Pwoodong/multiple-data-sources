package com.jiu.demo.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Package com.jiu.demo.config.datasource
 * ClassName DataSourceSalveConfig.java
 * Description 从数据源
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-16 15:42
 **/
@Configuration
@MapperScan(basePackages = "com.jiu.demo.mapper.slave",sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class DataSourceSalveConfig {

    public final static String mapperXmlLocation = "classpath:mapper/*/*.xml";

    @Bean(name = "slaveDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "slaveSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(slaveDataSource());
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperXmlLocation));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "slaveDataSourceTransactionManager")
    public DataSourceTransactionManager slaveDataSourceTransactionManager() {
        return new DataSourceTransactionManager(slaveDataSource());
    }

}
