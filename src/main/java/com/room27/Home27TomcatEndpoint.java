package com.room27;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 27room
 * @date 2018/03/11 17:51
 */
public class Home27TomcatEndpoint extends SpringBootServletInitializer{
    //设置启动类,tomcat入口
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Home27ApplicationEndpoint.class);
    }
}
