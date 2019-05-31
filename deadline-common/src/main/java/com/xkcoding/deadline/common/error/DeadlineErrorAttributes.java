package com.xkcoding.deadline.common.error;

import cn.hutool.core.bean.BeanUtil;
import com.xkcoding.deadline.common.api.CommonResultCode;
import com.xkcoding.deadline.common.api.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * <p>
 * 全局异常处理
 * </p>
 *
 * @package: com.xkcoding.deadline.common.error
 * @description: 全局异常处理
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:42
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
public class DeadlineErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        String requestUri = this.getAttr(webRequest, "javax.servlet.error.request_uri");
        Integer status = this.getAttr(webRequest, "javax.servlet.error.status_code");
        Throwable error = getError(webRequest);
        R result;
        if (error == null) {
            log.error("URL:{} error status:{}", requestUri, status);
            result = R.fail(CommonResultCode.FAILURE, "系统未知异常[HttpStatus]:" + status);
        } else {
            log.error(String.format("URL: %s 状态码: %d", requestUri, status), error);
            result = R.fail(status, error.getMessage());
        }
        //TODO: 错误日志记录
        return BeanUtil.beanToMap(result);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    private <T> T getAttr(WebRequest webRequest, String name) {
        return (T) webRequest.getAttribute(name, RequestAttributes.SCOPE_REQUEST);
    }

}
