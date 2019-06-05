
package com.xkcoding.log.event;

import org.springframework.context.ApplicationEvent;

import java.util.Map;

/**
 * <p>
 * 操作日志事件
 * </p>
 *
 * @package: com.xkcoding.log.event
 * @description: 操作日志事件
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:59
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ApiLogEvent extends ApplicationEvent {

    public ApiLogEvent(Map<String, Object> source) {
        super(source);
    }

}
