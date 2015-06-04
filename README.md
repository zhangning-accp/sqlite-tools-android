# sqlite-tools-android
sqlit-tools是对android进行sqlit操作的一个封装类。目前版本为V0.1,此版本提供如下功能.</br>
1. 通过书写实体类，在实体类上就注解，程序生成表结构.</br>
2. 通过书写sql语句，返回map或list结构表示单条记录或多条记录.</br>
sqlit-tools-android V0.1不能做的事：</br>
1. 不提供多表关系与实体类进行映射的功能，sqlit-tools并不是一个orm框架.</br>
2. 不提供修改表结构功能，如果想要实现，只能自行书写ddl语句.</br>
3. 不提供将查询结果直接转换成实体类的功能.</br>

代码简述:</br>
包说明:</br>
annotation:注解包</br>
    |--Colum:列注解定义</br>
    |--Table:表注解定义</br>
    |--SqliteDataType:列数据类型的常量类</br>
engine:执行引擎</br>
    |--DBHelper:工具类,提供建表,dml,dql操作方法.</br>

test:测试包</br>
MyActivity:demo</br>
说明:大家导入到自己工程里时,只需要annotation和engine即可.其它的类可以不要.</br>
注意,该工具只能在android下运行,它不能够在纯javase下使用.
