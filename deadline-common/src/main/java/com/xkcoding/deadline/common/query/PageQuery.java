package com.xkcoding.deadline.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分页查询条件
 * </p>
 *
 * @package: com.xkcoding.deadline.common.query
 * @description: 分页查询条件
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:29
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "查询条件")
public class PageQuery {
    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private Integer current;

    /**
     * 每页的数量
     */
    @ApiModelProperty(value = "每页的数量")
    private Integer size;

    /**
     * 排序的字段名
     */
    @ApiModelProperty(hidden = true)
    private String ascs;

    /**
     * 排序方式
     */
    @ApiModelProperty(hidden = true)
    private String descs;
}
