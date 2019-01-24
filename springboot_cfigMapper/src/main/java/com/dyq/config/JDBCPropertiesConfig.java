package com.dyq.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:41
 */
@Configuration
public class JDBCPropertiesConfig {


    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }
}
