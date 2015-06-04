package com.zn.sqlite.orm.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zn.sqlite.orm.android.engine.DBHelper;
import com.zn.sqlite.orm.android.test.User;
import com.zn.sqlite.orm.android.test.User1;

import java.util.List;
import java.util.Map;

public class MyActivity extends Activity {
    private TextView textView;

    private static final String DATA_BASE_NAME = "zn_test.db";
    private static final int DATA_BASE_VERSION = 1;


    private DBHelper helper;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView = (TextView) findViewById(R.id.text_view_show);
        helper = new DBHelper(this,DATA_BASE_NAME,DATA_BASE_VERSION);

    }
    public void createDB(View view){
        textView.append("建库成功！");
        helper.generateTable(User.class);
        Toast.makeText(this,"createDB",Toast.LENGTH_SHORT).show();
    }
    public void selectOne(View view){
        String sql = "select * from user";
        Map map = helper.selectOne(sql);
        textView.setText(map.toString());

        Toast.makeText(this,"selectOne",Toast.LENGTH_SHORT).show();
    }
    public void select(View view){
        String sql = "select * from user";
        List list = helper.select(sql);
        textView.setText(list.toString());

        Toast.makeText(this,"select",Toast.LENGTH_SHORT).show();
    }
    public void add(View view){
        String sql = "insert into user(user_name,user_age) values(?,?)";
        helper.execDMLSQL(sql, "zn", "20");

        Toast.makeText(this,"add",Toast.LENGTH_SHORT).show();
    }
    public void delete(View view){
        String sql = "delete user";
        helper.delete(sql);
        Toast.makeText(this,"delete",Toast.LENGTH_SHORT).show();
    }
    public void update(View view){
        String sql = "update user set user_name=? where id = 1";
        helper.execDMLSQL(sql,"zn_home");
        Toast.makeText(this,"update",Toast.LENGTH_SHORT).show();
    }
    public void createTables(View view){
        helper.generateTable(User.class,User1.class);
        Toast.makeText(this,"createTables",Toast.LENGTH_SHORT).show();
    }
    public void dropDB(View view){
        String sql = "drop database " + DATA_BASE_NAME;
        helper.execDMLSQL(sql);
        Toast.makeText(this,"dropDB",Toast.LENGTH_SHORT).show();
    }
    public void dropTables(View view){
        String sql = "drop table user";
        helper.execDMLSQL(sql);
        Toast.makeText(this,"dropTables",Toast.LENGTH_SHORT).show();
    }
}
