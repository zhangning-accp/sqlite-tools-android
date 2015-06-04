package com.zn.sqlite.orm.android.annotation;

import java.lang.annotation.*;

/**
 * 表描述
 * Created by zn on 15-5-14.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    /**
     * 表名
     * @return string of table name
     */
    String name();
}
