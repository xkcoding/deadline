package com.xkcoding.deadline.common.exception;

import com.xkcoding.deadline.common.api.CommonResultCode;
import com.xkcoding.deadline.common.api.IResultCode;
import lombok.Getter;

/**
 * <p>
 * 通用业务异常
 * </p>
 *
 * @package: com.xkcoding.deadline.common.exception
 * @description: 通用业务异常
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:22
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 2359767895161832954L;

    @Getter
    private final IResultCode resultCode;
    @Getter
    private final Object data;

    public ServiceException(String message) {
        super(message);
        this.resultCode = CommonResultCode.INTERNAL_SERVER_ERROR;
        data = null;
    }

    public ServiceException(IResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
        data = null;
    }

    public ServiceException(IResultCode resultCode, Object data) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
        this.data = data;
    }

    public ServiceException(IResultCode resultCode, Throwable cause) {
        super(cause);
        this.resultCode = resultCode;
        data = null;
    }

    /**
     * 提高性能
     *
     * @return Throwable
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public Throwable doFillInStackTrace() {
        return super.fillInStackTrace();
    }

}
