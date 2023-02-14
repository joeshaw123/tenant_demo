# 工程简介
springboot+mybatis-plus插件实现多租户
# 延伸阅读
1.导入resource/db/db_test.sql到数据库
2.更改配置文件的数据库连接
3.启动项目，分别调用一下接口
127.0.0.1:8081/info/list(请求头添加tenant_id：1参数) 只查询到租户id为1的数据
127.0.0.1:8081/user/list(请求头添加tenant_id：1参数) 可以查到全部数据
127.0.0.1:8081/info/get/1111(请求头添加tenant_id：1参数) 在mapper添加注解过滤查询全部


