package com.jiu.demo.common.vo;

import com.jiu.demo.common.constant.SystemCode;
import lombok.Data;

/**
 * Package com.jiu.demo.common.vo
 * ClassName ResponseVO.java
 * Description 返回实体
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-11-25 13:56
 **/
@Data
public class ResponseVO<T> {
    /**
     * 响应码
     */
    private String code;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 构造方法
     *
     * @param systemCode 系统编码
     * @param data    消息体
     */
    public ResponseVO(SystemCode systemCode, T data) {
        this.code = systemCode.code;
        this.message = systemCode.desc;
        this.data = data;
    }

    /**
     * 构造方法
     *
     * @param systemCode 系统编码
     * @param message    消息
     * @param data       消息体
     */
    public ResponseVO(SystemCode systemCode,String message, T data) {
        this.code = systemCode.code;
        this.message = message;
        this.data = data;
    }

    /**
     * 使用此构造方法 代表返回成功
     *
     * @param data 消息体
     */
    public ResponseVO(T data) {
        this.code = SystemCode.SUCCESS.code;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "code='" + code + '\'' +
                ", message=" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
