package com.jiu.demo.mapper.slave;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.dao.slave
 * ClassName DemoSlaveDao.java
 * Description Demo数据接口
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-16 15:49
 **/
//@Mapper
@Component
public interface DemoSlaveMapper {

    /**
     * 查询数据
     * @return      List
     **/
    //@Select("select * from multiple_data_demo")
    List<Map<String,Object>> selectDemo2();

}
