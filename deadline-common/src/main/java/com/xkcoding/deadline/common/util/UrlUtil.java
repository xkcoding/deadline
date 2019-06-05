package com.xkcoding.deadline.common.util;

import org.springframework.web.util.UriUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

/**
 * <p>
 * URL处理工具类
 * </p>
 *
 * @package: com.xkcoding.deadline.common.util
 * @description: URL处理工具类
 * @author: yangkai.shen
 * @date: Created in 2019-06-05 18:15
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class UrlUtil extends UriUtils {

    /**
     * url 编码，同js decodeURIComponent
     *
     * @param source  url
     * @param charset 字符集
     * @return 编码后的url
     */
    public static String encodeURL(String source, Charset charset) {
        return UrlUtil.encode(source, charset.name());
    }

    /**
     * url 解码
     *
     * @param source  url
     * @param charset 字符集
     * @return 解码url
     */
    public static String decodeURL(String source, Charset charset) {
        return UrlUtil.decode(source, charset.name());
    }

    /**
     * 获取url路径
     *
     * @param uriStr 路径
     * @return url路径
     */
    public static String getPath(String uriStr) {
        URI uri;

        try {
            uri = new URI(uriStr);
        } catch (URISyntaxException var3) {
            throw new RuntimeException(var3);
        }

        return uri.getPath();
    }

}
