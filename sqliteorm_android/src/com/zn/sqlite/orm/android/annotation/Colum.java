package com.zn.sqlite.orm.android.annotation;

import java.lang.annotation.*;

/**
 * 代表列的描述
 * Created by zn on 15-5-14.
 * 支持primary key
 * 目前不支持unique,check,foreign key 约束
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Colum {
    /**
     * 列名
     * @return　string of the colum name,如果没有指定列名,则使用字段名作为列名
     */
    String name() default "";

    /**
     *
     * @return
     */
    String type() default SqliteDataType.TEXT;

    /**
     * 是否是主键，默认为false.Sqlite只要是主键,默认就能自增,也可以指定值
     * @return
     */
    boolean primaryKey() default false;


    /**
     * 默认值
     * @return
     */
    //String defaultValue() default "";


    /**
     * 是否不能为null
     * @return 默认返回为false,代表可以为空,如果为true,表示不能为null.
     */
    //boolean notNull() default false;
    }
