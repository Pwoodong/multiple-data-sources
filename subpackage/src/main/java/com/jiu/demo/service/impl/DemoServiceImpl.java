package com.jiu.demo.service.impl;

import com.jiu.demo.mapper.master.DemoMasterMapper;
import com.jiu.demo.mapper.slave.DemoSlaveMapper;
import com.jiu.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.service.impl
 * ClassName DemoServiceImpl.java
 * Description 屏幕二接口实现
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-23 14:52
 **/
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMasterMapper demoMasterMapper;

    @Resource
    private DemoSlaveMapper demoSlaveMapper;

    /**
     * @see DemoService#getPageList1()
     * */
    @Override
    public List<Map<String,Object>> getPageList1() {
        return demoMasterMapper.selectDemo1();
    }

    /**
     * @see DemoService#getPageList2()
     * */
    @Override
    public List<Map<String,Object>> getPageList2() {
        return demoSlaveMapper.selectDemo2();
    }

}
