package com.jiu.demo;

import com.jiu.demo.common.constant.SystemCode;
import com.jiu.demo.common.vo.ResponseVO;
import com.jiu.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo
 * ClassName DemoControllerTest.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-24 10:13
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void  test1(){
        List<Map<String,Object>> mapList = demoService.getPageList1();
        System.out.println(new ResponseVO<>(SystemCode.SUCCESS,mapList));
    }

    @Test
    public void  test2(){
        List<Map<String, Object>> mapList = demoService.getPageList1();
        System.out.println(new ResponseVO<>(SystemCode.SUCCESS,mapList));
    }

}
