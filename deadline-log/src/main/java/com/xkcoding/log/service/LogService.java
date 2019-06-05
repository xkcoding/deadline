package com.xkcoding.log.service;

import com.xkcoding.deadline.common.api.R;
import com.xkcoding.log.model.LogApi;
import com.xkcoding.log.model.LogCustom;
import com.xkcoding.log.model.LogError;

/**
 * <p>
 * 日志接口
 * </p>
 *
 * @package: com.xkcoding.log.service
 * @description: 日志接口
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:11
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface LogService {
    /**
     * 保存操作日志
     *
     * @param logApi 操作日志实体
     * @return 是否保存成功
     */
    R<Boolean> saveApiLog(LogApi logApi);

    /**
     * 保存错误日志
     *
     * @param logError 错误日志实体
     * @return 是否保存成功
     */
    R<Boolean> saveErrorLog(LogError logError);

    /**
     * 保存自定义日志
     *
     * @param logCustom 自定义日志实体
     * @return 是否保存成功
     */
    R<Boolean> saveCustomLog(LogCustom logCustom);

}
