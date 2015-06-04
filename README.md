# sqlite-tools-android
sqlit-tools是对android进行sqlit操作的一个封装类。目前版本为V0.1,此版本提供如下功能.</br>
1. 通过书写实体类，在实体类上就注解，程序生成表结构.</br>
2. 通过书写sql语句，返回map或list结构表示单条记录或多条记录.</br>
sqlit-tools-android V0.1不能做的事：</br>
1. 不提供多表关系与实体类进行映射的功能，sqlit-tools并不是一个orm框架.</br>
2. 不提供修改表结构功能，如果想要实现，只能自行书写ddl语句.</br>
3. 不提供将查询结果直接转换成实体类的功能.</br>
