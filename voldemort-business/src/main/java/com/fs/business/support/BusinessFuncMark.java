package com.fs.business.support;

import java.lang.annotation.*;

/**
 * @author frank
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface BusinessFuncMark {

    Class value();

}
