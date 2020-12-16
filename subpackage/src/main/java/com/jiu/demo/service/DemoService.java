package com.jiu.demo.service;

import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.service
 * ClassName DemoService.java
 * Description Demo接口
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-25 9:52
 **/
public interface DemoService {

    /**
     * 屏幕数据获取
     * @param
     * @return      List
     **/
    List<Map<String,Object>> getPageList1();

    /**
     * 屏幕数据获取
     * @param
     * @return      List
     **/
    List<Map<String,Object>> getPageList2();

}
