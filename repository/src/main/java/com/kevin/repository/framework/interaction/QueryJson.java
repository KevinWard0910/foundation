package com.kevin.repository.framework.interaction;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kevin on 2018/11/29.
 * descript：方法查询json格式的参数
 *
 * @see com.google.gson.JsonObject
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface QueryJson {
}
