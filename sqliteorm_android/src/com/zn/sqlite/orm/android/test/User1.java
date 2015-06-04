package com.zn.sqlite.orm.android.test;

import com.zn.sqlite.orm.android.annotation.Colum;
import com.zn.sqlite.orm.android.annotation.SqliteDataType;
import com.zn.sqlite.orm.android.annotation.Table;

/**
 * Created by zn on 15-5-18.
 */

public class User1 {
    @Colum(name = "id",type = SqliteDataType.INTEGER,primaryKey = true)
    private int id;

    @Colum(type=SqliteDataType.TEXT)
    private String name;

    @Colum(name="user_age",type=SqliteDataType.INTEGER)
    private int age;

}
