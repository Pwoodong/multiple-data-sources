package com.jiu.demo.common.constant;

/**
 * Package com.jiu.demo.common.constant
 * ClassName SystemCode.java
 * Description 系统码
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-25 13:58
 **/
public enum SystemCode {

    /**
     * 业务错误
     */
    E_BUSINESS("1", "业务异常"),
    /**
     * 系统错误
     */
    E_ERROR("9999", "系统异常"),
    /**
     * 成功代码
     */
    SUCCESS("0", "成功");

    /**
     * 返回码
     */
    public String code;

    /**
     * 描述
     */
    public String desc;

    SystemCode(String code,String desc) {
        this.code = code;
        this.desc = desc;
    }

}
