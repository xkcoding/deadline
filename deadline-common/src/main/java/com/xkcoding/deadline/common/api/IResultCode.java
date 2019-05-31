package com.xkcoding.deadline.common.api;

import java.io.Serializable;

/**
 * <p>
 * 业务代码接口
 * </p>
 *
 * @package: com.xkcoding.deadline.common.api
 * @description: 业务代码接口
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface IResultCode extends Serializable {

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

}
