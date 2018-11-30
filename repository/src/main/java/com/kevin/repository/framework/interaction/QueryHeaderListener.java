package com.kevin.repository.framework.interaction;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kevin on 2018/11/29.
 * descript：标识返回头回调
 *
 * @see com.kevin.base.utils.http.IHeaderListener
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface QueryHeaderListener {

}
