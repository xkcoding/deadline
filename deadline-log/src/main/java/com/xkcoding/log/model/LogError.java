package com.xkcoding.log.model;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 服务异常日志实体类
 * </p>
 *
 * @package: com.xkcoding.log.model
 * @description: 服务异常日志实体类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:56
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class LogError implements Serializable {
    private static final long serialVersionUID = -616342209061133851L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 服务器 ip
     */
    private String serverIp;
    /**
     * 服务器名
     */
    private String serverHost;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 请求url
     */
    @Nullable
    private String requestUri;
    /**
     * 操作方式
     */
    private String method;
    /**
     * 堆栈信息
     */
    private String stackTrace;
    /**
     * 异常名
     */
    private String exceptionName;
    /**
     * 异常消息
     */
    private String message;
    /**
     * 类名
     */
    private String methodClass;
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 操作提交的数据
     */
    private String params;
    /**
     * 代码行数
     */
    private Integer lineNumber;
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
