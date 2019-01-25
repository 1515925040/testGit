package com.dyq.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:27
 */
@ConfigurationProperties(prefix = "jdbc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JDBCPro {
        private String driverClassName;
        private String url;
        private String username;
        private String password;
}
