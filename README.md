# beetlsql-HikariCP

beetlsql 比jpa速度快  查询支持函数式形式
HikarCP据说是现在最快的数据连接池 

使用

## HikarCP

1.依赖

  HikariCP依赖
  jdbc依赖
  mysql连接依赖

2.配置

    1.在properties中配置
      数据库的基本连接信息
      然后数据源 datasource:type选择 Hikari

    2.在yml配置

    一样的 就是yml比properties好用

  3.配置好信息就可以直接使用了

  启动项目的时候可以看到HikariCP的信息输出

  2019-01-07 00:42:14.123  INFO 6412 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-01-07 00:42:14.211  INFO 6412 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.

## Beetlsql使用

1.依赖
  <dependency>
	<groupId>com.ibeetl</groupId>
	<artifactId>beetlsql</artifactId>
	<version>${beetlsql.version}</version>
  </dependency>

2.Beetlsql配置

  用javaconfig配置

3.写slq.md文件使用其sql

4.执行sql操作控制台有sql信息查看
  很方便