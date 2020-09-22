package com.jim.common.core.annotion;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-22 12:10
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 请求命令
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SocketCommand {

    /**
     * 请求的命令号
     * @return
     */
    short cmd();

}