package com.room27;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 27home
 * @date 2018/03/10 16:54
 */
@SpringBootApplication(scanBasePackages = {"com.room27"})
public class Home27ApplicationEndpoint {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(Home27ApplicationEndpoint.class);
        //设置自定义banner
        application.setBannerMode(Mode.LOG);
        application.run(args);

    }

}
