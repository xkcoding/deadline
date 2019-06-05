package com.xkcoding.log.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * 日志配置
 * </p>
 *
 * @package: com.xkcoding.log.props
 * @description: 日志配置
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:17
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@ConfigurationProperties("deadline.log")
public class DeadlineLogProperties {
    /**
     * 是否启用操作日志，默认值：false
     */
    private boolean enabled = false;
}
