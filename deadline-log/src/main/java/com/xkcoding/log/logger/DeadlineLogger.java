package com.xkcoding.log.logger;

import com.xkcoding.log.publisher.CustomLogPublisher;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 自定义日志工具类
 * </p>
 *
 * @package: com.xkcoding.log.logger
 * @description: 自定义日志工具类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:16
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
public class DeadlineLogger {

    public void info(String id, String data) {
        CustomLogPublisher.publishEvent("info", id, data);
    }

    public void debug(String id, String data) {
        CustomLogPublisher.publishEvent("debug", id, data);
    }

    public void warn(String id, String data) {
        CustomLogPublisher.publishEvent("warn", id, data);
    }

    public void error(String id, String data) {
        CustomLogPublisher.publishEvent("error", id, data);
    }


}
