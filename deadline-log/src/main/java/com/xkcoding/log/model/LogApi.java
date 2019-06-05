package com.xkcoding.log.model;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 操作日志实体类
 * </p>
 *
 * @package: com.xkcoding.log.model
 * @description: 操作日志实体类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:55
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class LogApi implements Serializable {
    private static final long serialVersionUID = 5243202901554667255L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 日志类型
     */
    private String type;
    /**
     * 日志标题
     */
    private String title;
    /**
     * 服务器 ip
     */
    private String serverIp;
    /**
     * 服务器名
     */
    private String serverHost;
    /**
     * 操作IP地址
     */
    private String remoteIp;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 请求URI
     */
    private String requestUri;
    /**
     * 操作方式
     */
    private String method;
    /**
     * 方法类
     */
    private String methodClass;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 操作提交的数据
     */
    private String params;
    /**
     * 执行时间
     */
    private String time;

    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    @JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    private LocalDateTime createTime;

}
