package com.xkcoding.log.model;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 自定义日志实体类
 * </p>
 *
 * @package: com.xkcoding.log.model
 * @description: 自定义日志实体类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:56
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class LogCustom implements Serializable {
    private static final long serialVersionUID = 7115088311761096702L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 服务器名
     */
    private String serverHost;
    /**
     * 服务器IP地址
     */
    private String serverIp;
    /**
     * 日志级别
     */
    private String logLevel;
    /**
     * 日志业务id
     */
    private String logId;
    /**
     * 日志数据
     */
    private String logData;
    /**
     * 操作方式
     */
    private String method;
    /**
     * 请求URI
     */
    private String requestUri;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 操作提交的数据
     */
    private String params;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    @JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    private LocalDateTime createTime;

}
