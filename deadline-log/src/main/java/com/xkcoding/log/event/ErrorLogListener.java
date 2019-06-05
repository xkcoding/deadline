package com.xkcoding.log.event;

import com.xkcoding.deadline.common.util.WebUtil;
import com.xkcoding.log.constant.EventConstant;
import com.xkcoding.log.model.LogError;
import com.xkcoding.log.service.LogService;
import com.xkcoding.log.service.SecurityService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>
 * 异步监听错误日志事件
 * </p>
 *
 * @package: com.xkcoding.log.event
 * @description: 异步监听错误日志事件
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:01
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
@AllArgsConstructor
public class ErrorLogListener {

    private final LogService logService;
    private final SecurityService securityService;

    @Async
    @Order
    @EventListener(ErrorLogEvent.class)
    @SuppressWarnings("unchecked")
    public void saveErrorLog(ErrorLogEvent event) {
        Map<String, Object> source = (Map<String, Object>) event.getSource();
        LogError logError = (LogError) source.get(EventConstant.EVENT_LOG);
        HttpServletRequest request = (HttpServletRequest) source.get(EventConstant.EVENT_REQUEST);
        logError.setUserAgent(request.getHeader(WebUtil.USER_AGENT_HEADER));
        logError.setMethod(request.getMethod());
        logError.setParams(WebUtil.getRequestParamString(request));
        logError.setCreateBy(securityService.getCurrentUserName(request));
        logError.setCreateTime(LocalDateTime.now());
        logService.saveErrorLog(logError);
    }

}
