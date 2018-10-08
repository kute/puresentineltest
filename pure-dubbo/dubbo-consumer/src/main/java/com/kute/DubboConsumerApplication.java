package com.kute;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.kute.controller.ConsumerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication(scanBasePackageClasses = ConsumerController.class)
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
