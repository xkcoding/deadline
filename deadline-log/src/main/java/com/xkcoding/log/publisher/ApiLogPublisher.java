package com.xkcoding.log.publisher;

import com.xkcoding.deadline.common.constants.CommonConstant;
import com.xkcoding.deadline.common.util.SpringUtil;
import com.xkcoding.deadline.common.util.WebUtil;
import com.xkcoding.log.annotations.ApiLog;
import com.xkcoding.log.constant.EventConstant;
import com.xkcoding.log.event.ApiLogEvent;
import com.xkcoding.log.model.LogApi;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * API操作日志信息事件发送
 * </p>
 *
 * @package: com.xkcoding.log.publisher
 * @description: API操作日志信息事件发送
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:53
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ApiLogPublisher {

    public static void publishEvent(String methodName, String methodClass, ApiLog apiLog, long time) {
        HttpServletRequest request = WebUtil.getRequest();
        LogApi logApi = new LogApi();
        logApi.setType(CommonConstant.LOG_NORMAL_TYPE);
        logApi.setTitle(apiLog.value());
        logApi.setTime(String.valueOf(time));
        logApi.setMethodClass(methodClass);
        logApi.setMethodName(methodName);
        Map<String, Object> event = new HashMap<>(16);
        event.put(EventConstant.EVENT_LOG, logApi);
        event.put(EventConstant.EVENT_REQUEST, request);
        SpringUtil.publishEvent(new ApiLogEvent(event));
    }

}
