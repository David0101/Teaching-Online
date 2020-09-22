package com.jim.common.core.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-22 12:02
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SocketModule {
    /**
     * 请求的模块号
     * @return
     */
    short module();
}
