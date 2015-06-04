package com.zn.sqlite.orm.android.test;

import com.zn.sqlite.orm.android.annotation.Colum;
import com.zn.sqlite.orm.android.annotation.SqliteDataType;
import com.zn.sqlite.orm.android.annotation.Table;

/**
 * Created by zn on 15-5-18.
 */
@Table(name = "user")
public class User {
    @Colum(name = "id",type = SqliteDataType.INTEGER,primaryKey = true)
    private int id;

    @Colum(name = "user_name",type=SqliteDataType.TEXT)
    private String name;

    @Colum(name="user_age",type=SqliteDataType.INTEGER)
    private int age;

}
