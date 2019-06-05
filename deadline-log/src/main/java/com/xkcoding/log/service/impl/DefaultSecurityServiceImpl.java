package com.xkcoding.log.service.impl;

import com.xkcoding.deadline.common.constants.CommonConstant;
import com.xkcoding.log.service.SecurityService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 默认认证接口
 * </p>
 *
 * @package: com.xkcoding.log.service.impl
 * @description: 默认认证接口
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:13
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class DefaultSecurityServiceImpl implements SecurityService {

    /**
     * 获取当前用户姓名
     *
     * @param request request
     * @return 当前用户名
     */
    @Override
    public String getCurrentUserName(HttpServletRequest request) {
        return CommonConstant.ANONYMOUS_USER_NAME;
    }
}
