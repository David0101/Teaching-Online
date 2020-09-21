package com.jim.online;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-21 16:01
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OnlineServerApplication.class);
    }
}
