package com.jiu.demo.mapper.master;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.dao
 * ClassName MasterDemoDao.java
 * Description DEMO数据接口
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-12-16 14:51
 **/
//@Mapper
@Component
public interface DemoMasterMapper {

    /**
     * 查询数据
     * @return      List
     **/
    //@Select("select * from multiple_data_demo")
    List<Map<String,Object>> selectDemo1();

}
