package com.dyq.config;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:10
 */
/* @Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ConfigurationProperties(value = "classpath:db.properties")
@PropertySource(value = "classpath:db.properties")
public class CfigurationPro {
   @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
*/