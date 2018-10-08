package com.kute;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
		new SpringApplicationBuilder(DubboProviderApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
//        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
