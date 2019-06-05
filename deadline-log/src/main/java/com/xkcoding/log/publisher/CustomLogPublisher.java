package com.xkcoding.log.publisher;

import com.xkcoding.deadline.common.util.SpringUtil;
import com.xkcoding.deadline.common.util.WebUtil;
import com.xkcoding.log.constant.EventConstant;
import com.xkcoding.log.event.CustomLogEvent;
import com.xkcoding.log.model.LogCustom;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 自定义日志信息事件发送
 * </p>
 *
 * @package: com.xkcoding.log.publisher
 * @description: 自定义日志信息事件发送
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:53
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class CustomLogPublisher {

    public static void publishEvent(String level, String id, String data) {
        HttpServletRequest request = WebUtil.getRequest();
        LogCustom logCustom = new LogCustom();
        logCustom.setLogLevel(level);
        logCustom.setLogId(id);
        logCustom.setLogData(data);
        Map<String, Object> event = new HashMap<>(16);
        event.put(EventConstant.EVENT_LOG, logCustom);
        event.put(EventConstant.EVENT_REQUEST, request);
        SpringUtil.publishEvent(new CustomLogEvent(event));
    }

}
