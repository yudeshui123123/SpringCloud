package com.jtkj.springcloudmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //这表示你将当前服务注册到Eureka上
/*@ComponentScan(basePackages = "com.jtkj.springcloudmember.api.controller")*/
public class SpringcloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMemberApplication.class, args);
    }

}
