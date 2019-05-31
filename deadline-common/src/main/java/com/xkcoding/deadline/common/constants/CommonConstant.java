package com.xkcoding.deadline.common.constants;

/**
 * <p>
 * 通用常量
 * </p>
 *
 * @package: com.xkcoding.deadline.common.constants
 * @description: 通用常量
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:19
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface CommonConstant {
    /**
     * 默认当前页码
     */
    Integer DEFAULT_CURRENT_PAGE = 1;
    /**
     * 默认每页条数
     */
    Integer DEFAULT_PAGE_SIZE = 10;
    /**
     * 默认为空消息
     */
    String DEFAULT_NULL_MESSAGE = "暂无承载数据";
    /**
     * 默认成功消息
     */
    String DEFAULT_SUCCESS_MESSAGE = "操作成功";
    /**
     * 默认失败消息
     */
    String DEFAULT_FAILURE_MESSAGE = "操作失败";
    /**
     * 日志默认状态
     */
    String LOG_NORMAL_TYPE = "1";
    /**
     * 匿名用户
     */
    String ANONYMOUS_USER_NAME = "匿名用户";
    /**
     * 业务异常错误码
     */
    Integer DEADLINE_FAILURE_CODE = -1;
    /**
     * 验证码默认cookie名
     */
    String DEFAULT_CODE_COOKIE_NAME = "scaffold-code";
    /**
     * 验证码默认缓存
     */
    String DEFAULT_CODE_CACHE_NAME = "SCAFFOLD::CODE";
    /**
     * 验证码cookie超时默认为session会话状态
     */
    Integer DEFAULT_CODE_COOKIE_MAX_AGE = -1;
    /**
     * 验证码默认宽度
     */
    Integer DEFAULT_CODE_WIDTH = 108;
    /**
     * 验证码默认高度
     */
    Integer DEFAULT_CODE_HEIGHT = 40;
    /**
     * 验证码默认长度
     */
    Integer DEFAULT_CODE_LENGTH = 4;
}
