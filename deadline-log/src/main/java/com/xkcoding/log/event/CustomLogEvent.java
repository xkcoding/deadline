package com.xkcoding.log.event;

import org.springframework.context.ApplicationEvent;

import java.util.Map;

/**
 * <p>
 * 自定义日志事件
 * </p>
 *
 * @package: com.xkcoding.log.event
 * @description: 自定义日志事件
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:00
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class CustomLogEvent extends ApplicationEvent {

    public CustomLogEvent(Map<String, Object> source) {
        super(source);
    }

}
