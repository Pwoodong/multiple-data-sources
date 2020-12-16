package com.jiu.demo.controller;

import com.jiu.demo.common.constant.SystemCode;
import com.jiu.demo.common.vo.ResponseVO;
import com.jiu.demo.service.DemoService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Package com.jiu.demo.controller
 * ClassName ScreenDataController.java
 * Description 大屏可视化展示数据接口
 * <p>
 * 访问路径 http://localhost:9010/big-demo/swagger-ui.html
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-23 14:35
 **/
@Slf4j
@Api(value = "大屏可视化API接口")
@RestController
@RequestMapping("api/{version}/demo")
public class DemoController {

    @Resource(name = "demoService")
    private DemoService demoService;

    @ApiOperation(value = "大屏数据接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "大屏数字",required = true)
    })
    @ApiResponses(value = {
            @ApiResponse(code = 0, message = "成功"),
            @ApiResponse(code = 1, message = "失败")
    })
    @GetMapping("/{id}")
    public ResponseVO getPage1(@PathVariable("id") String id) {
        List<Map<String,Object>> mapList = new ArrayList<>();
        try{
            switch (id) {
                case "1":
                    mapList = demoService.getPageList1();
                    break;
                case "2":
                    mapList = demoService.getPageList2();
                    break;
                default:
            }
            return new ResponseVO<>(SystemCode.SUCCESS,mapList);
        }catch (Exception e){
            log.error("调用接口出现异常."+e.getMessage());
            return new ResponseVO<>(SystemCode.E_BUSINESS,"调用接口出现异常.",null);
        }
    }

}
