package com.example.HikariCP.config;
import org.beetl.sql.core.*;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.BeetlSqlScannerConfigurer;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author wys
 * created in 16:46 2019/1/4
 */
@Configuration
public class BeetlsqlConfig {

    @Bean
    public BeetlSqlScannerConfigurer sqlScannerConfigurer(){
        BeetlSqlScannerConfigurer beetlSqlScannerConfigurer = new BeetlSqlScannerConfigurer();
        beetlSqlScannerConfigurer.setBasePackage("com.example.HikariCP.dao");
        beetlSqlScannerConfigurer.setSqlManagerFactoryBeanName("sqlManagerFactoryBean");
        return beetlSqlScannerConfigurer;
    }

    @Bean
    public SqlManagerFactoryBean sqlManagerFactoryBean(DataSource dataSource) {
        SqlManagerFactoryBean sqlManagerFactoryBean = new SqlManagerFactoryBean();
        BeetlSqlDataSource beetlSqlDataSource = new BeetlSqlDataSource();
        beetlSqlDataSource.setMasterSource(dataSource);
        sqlManagerFactoryBean.setCs(beetlSqlDataSource);
        sqlManagerFactoryBean.setDbStyle(new MySqlStyle());
        sqlManagerFactoryBean.setSqlLoader(new ClasspathLoader("/sql"));
        sqlManagerFactoryBean.setNc(new UnderlinedNameConversion());
        sqlManagerFactoryBean.setInterceptors(new Interceptor[]{ new DebugInterceptor() });
        return sqlManagerFactoryBean;
    }

}
