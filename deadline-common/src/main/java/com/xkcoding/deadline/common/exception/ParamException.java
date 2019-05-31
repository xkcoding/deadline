package com.xkcoding.deadline.common.exception;

/**
 * <p>
 * 参数异常
 * </p>
 *
 * @package: com.xkcoding.deadline.common.exception
 * @description: 参数异常
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:22
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ParamException extends RuntimeException {

    private static final long serialVersionUID = -504301542126343904L;

    public ParamException() {
    }

    public ParamException(String message) {
        super(message);
    }

    public ParamException(Throwable cause) {
        super(cause);
    }

    public ParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
