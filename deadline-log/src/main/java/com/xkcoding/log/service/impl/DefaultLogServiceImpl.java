package com.xkcoding.log.service.impl;

import com.xkcoding.deadline.common.api.R;
import com.xkcoding.log.model.LogApi;
import com.xkcoding.log.model.LogCustom;
import com.xkcoding.log.model.LogError;
import com.xkcoding.log.service.LogService;

/**
 * <p>
 * 默认日志接口实现
 * </p>
 *
 * @package: com.xkcoding.log.service.impl
 * @description: 默认日志接口实现
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:12
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class DefaultLogServiceImpl implements LogService {
    /**
     * 保存操作日志
     *
     * @param logApi 操作日志实体
     * @return 是否保存成功
     */
    @Override
    public R<Boolean> saveApiLog(LogApi logApi) {
        return R.success();
    }

    /**
     * 保存错误日志
     *
     * @param logError 错误日志实体
     * @return 是否保存成功
     */
    @Override
    public R<Boolean> saveErrorLog(LogError logError) {
        return R.success();
    }

    /**
     * 保存自定义日志
     *
     * @param logCustom 自定义日志实体
     * @return 是否保存成功
     */
    @Override
    public R<Boolean> saveCustomLog(LogCustom logCustom) {
        return R.success();
    }
}
