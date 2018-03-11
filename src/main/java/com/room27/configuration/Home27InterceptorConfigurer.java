package com.room27.configuration;

import com.room27.interceptor.Home27UserRealmInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 27room
 * @date 2018/03/11 17:19
 */
@SpringBootConfiguration
public class Home27InterceptorConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Home27UserRealmInterceptor());
        super.addInterceptors(registry);
    }
}
