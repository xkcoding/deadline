package com.xkcoding.log.service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 认证接口
 * </p>
 *
 * @package: com.xkcoding.log.service
 * @description: 认证接口
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:11
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface SecurityService {
    /**
     * 获取当前用户姓名
     *
     * @param request request
     * @return 当前用户名
     */
    String getCurrentUserName(HttpServletRequest request);
}
