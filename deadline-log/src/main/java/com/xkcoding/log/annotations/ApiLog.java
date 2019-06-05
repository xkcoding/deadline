package com.xkcoding.log.annotations;

import java.lang.annotation.*;

/**
 * <p>
 * 日志记录注解
 * </p>
 *
 * @package: com.xkcoding.log.annotations
 * @description: 日志记录注解
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 17:48
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiLog {

    /**
     * 日志描述
     *
     * @return {String}
     */
    String value() default "日志记录";
}
