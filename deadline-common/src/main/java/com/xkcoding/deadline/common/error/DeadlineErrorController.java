package com.xkcoding.deadline.common.error;

import com.xkcoding.deadline.common.util.JacksonUtil;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <p>
 * 更改默认html请求异常为ajax
 * </p>
 *
 * @package: com.xkcoding.deadline.common.error
 * @description: 更改默认html请求异常为ajax
 * @author: yangkai.shen
 * @date: Created in 2019-05-31 15:42
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class DeadlineErrorController extends BasicErrorController {

    public DeadlineErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes, errorProperties);
    }

    @Override
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> body = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
        HttpStatus status = getStatus(request);
        response.setStatus(status.value());
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setObjectMapper(JacksonUtil.getInstance());
        view.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        return new ModelAndView(view, body);
    }

}
