package com.xkcoding.log.aspectj;

import com.xkcoding.log.annotations.ApiLog;
import com.xkcoding.log.publisher.ApiLogPublisher;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * <p>
 * 操作日志使用spring event异步入库
 * </p>
 *
 * @package: com.xkcoding.log.aspectj
 * @description: 操作日志使用spring event异步入库
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:50
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
@Aspect
public class ApiLogAspect {

    @Around("@annotation(apiLog)")
    public Object around(ProceedingJoinPoint point, ApiLog apiLog) throws Throwable {
        //获取类名
        String className = point.getTarget().getClass().getName();
        //获取方法
        String methodName = point.getSignature().getName();
        // 发送异步日志事件
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        //记录日志
        ApiLogPublisher.publishEvent(methodName, className, apiLog, time);
        return result;
    }

}
