package com.kevin.repository.framework.interaction;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kevin on 2018/11/29.
 * descript：定义baseUrl 一般用于定义服务器域名 domain
 */

@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface Server {
    String value() default "";
}
