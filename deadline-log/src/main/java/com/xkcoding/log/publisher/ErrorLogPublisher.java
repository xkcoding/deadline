package com.xkcoding.log.publisher;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.xkcoding.deadline.common.util.SpringUtil;
import com.xkcoding.deadline.common.util.WebUtil;
import com.xkcoding.log.constant.EventConstant;
import com.xkcoding.log.event.ErrorLogEvent;
import com.xkcoding.log.model.LogError;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 异常日志信息事件发送
 * </p>
 *
 * @package: com.xkcoding.scaffold.log.publisher
 * @description: 异常日志信息事件发送
 * @author: yangkai.shen
 * @date: Created in 2019-03-08 11:22
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ErrorLogPublisher {

    public static void publishEvent(Throwable error, String requestUri) {
        HttpServletRequest request = WebUtil.getRequest();
        LogError logError = new LogError();
        logError.setRequestUri(requestUri);
        if (!ObjectUtils.isEmpty(error)) {
            logError.setStackTrace(ExceptionUtil.stacktraceToString(error));
            logError.setExceptionName(error.getClass().getName());
            logError.setMessage(error.getMessage());
            StackTraceElement[] elements = error.getStackTrace();
            if (!ObjectUtils.isEmpty(elements)) {
                StackTraceElement element = elements[0];
                logError.setMethodName(element.getMethodName());
                logError.setMethodClass(element.getClassName());
                logError.setFileName(element.getFileName());
                logError.setLineNumber(element.getLineNumber());
            }
        }
        Map<String, Object> event = new HashMap<>(16);
        event.put(EventConstant.EVENT_LOG, logError);
        event.put(EventConstant.EVENT_REQUEST, request);
        SpringUtil.publishEvent(new ErrorLogEvent(event));
    }

}
