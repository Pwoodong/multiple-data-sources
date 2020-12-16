package com.jiu.demo.mapper;

import com.jiu.demo.config.datasource.annotation.TargetDataSource;
import com.jiu.demo.config.datasource.common.DataSourceKey;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.dao
 * ClassName MultipleDataDemoDao.java
 * Description DEMO数据接口
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-16 14:51
 **/
@Component
public interface MultipleDataDemoDao {

    /**
     * 查询数据
     * @return      List
     **/
    @TargetDataSource(dataSourceKey = DataSourceKey.DB_MYSQL)
    List<Map<String,Object>> selectDemo1();

    /**
     * 查询数据
     * @return      List
     **/
    @TargetDataSource(dataSourceKey = DataSourceKey.DB_ORACLE)
    List<Map<String,Object>> selectDemo2();

}
