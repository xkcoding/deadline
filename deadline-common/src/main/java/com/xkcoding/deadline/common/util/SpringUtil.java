package com.xkcoding.deadline.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

/**
 * <p>
 * spring 工具类
 * </p>
 *
 * @package: com.xkcoding.deadline.common.util
 * @description: spring 工具类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:57
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringUtil.context = context;
    }

    public static <T> T getBean(Class<T> clazz) {
        if (clazz == null) {
            return null;
        }
        return context.getBean(clazz);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String beanId) {
        if (beanId == null) {
            return null;
        }
        return (T) context.getBean(beanId);
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        if (null == beanName || "".equals(beanName.trim())) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        return (T) context.getBean(beanName, clazz);
    }

    public static ApplicationContext getContext() {
        if (context == null) {
            return null;
        }
        return context;
    }

    public static void publishEvent(ApplicationEvent event) {
        if (context == null) {
            return;
        }
        try {
            context.publishEvent(event);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

}
