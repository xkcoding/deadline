package com.xkcoding.deadline.controller;

import com.xkcoding.deadline.common.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试 Controller
 * </p>
 *
 * @package: com.xkcoding.deadline.controller
 * @description: 测试 Controller
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 14:39
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
public class TestController {

    /**
     * 测试
     */
    @GetMapping("/test")
    public R<String> test() {
        return R.success("test");
    }
}
