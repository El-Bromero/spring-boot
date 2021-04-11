package org.tekcamp.springtek;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class App {

	@Value("${server.port}")
	private int portNum;

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(App.class, args);
//		String[] beans = container.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beans));
//		int beanCount = container.getBeanDefinitionCount();
//		System.out.println(beanCount);
	}

	@Bean
	public CommandLineRunner cliRunner() {
		return args -> {
			System.out.println(appName + " running on port " + portNum);
			System.out.println("navigate to http://localhost:" + portNum + "/greet for the HelloWorld Page");
		};
	}

}
