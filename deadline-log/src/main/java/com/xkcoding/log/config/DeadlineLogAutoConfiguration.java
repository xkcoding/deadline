package com.xkcoding.log.config;

import com.xkcoding.log.aspectj.ApiLogAspect;
import com.xkcoding.log.event.ApiLogListener;
import com.xkcoding.log.event.CustomLogListener;
import com.xkcoding.log.event.ErrorLogListener;
import com.xkcoding.log.logger.DeadlineLogger;
import com.xkcoding.log.props.DeadlineLogProperties;
import com.xkcoding.log.service.LogService;
import com.xkcoding.log.service.SecurityService;
import com.xkcoding.log.service.impl.DefaultLogServiceImpl;
import com.xkcoding.log.service.impl.DefaultSecurityServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 日志工具自动配置
 * </p>
 *
 * @package: com.xkcoding.log.config
 * @description: 日志工具自动配置
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:20
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
@EnableConfigurationProperties(DeadlineLogProperties.class)
public class DeadlineLogAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LogService logService() {
        return new DefaultLogServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean
    public SecurityService securityService() {
        return new DefaultSecurityServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(value = "deadline.log.enabled", havingValue = "true")
    public ApiLogAspect apiLogAspect() {
        return new ApiLogAspect();
    }

    @Bean
    public DeadlineLogger deadlineLogger() {
        return new DeadlineLogger();
    }

    @Bean
    public ApiLogListener apiLogListener() {
        return new ApiLogListener(logService(), securityService());
    }

    @Bean
    public ErrorLogListener errorEventListener() {
        return new ErrorLogListener(logService(), securityService());
    }

    @Bean
    public CustomLogListener customLogListener() {
        return new CustomLogListener(logService(), securityService());
    }

}
