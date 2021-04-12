package org.tekcamp.springtek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.tekcamp.springtek.beans.beanstalk.Beanstalk;
import org.tekcamp.springtek.beans.beanstalk.Jack;
import org.tekcamp.springtek.beans.calc.Calculator;

import java.util.Arrays;

@SpringBootApplication
public class App {

	@Value("${server.port}")
	private int portNum;

	@Value("${spring.application.name}")
	private String appName;

	@Autowired
	Calculator calc;

	@Autowired
	Beanstalk beanstalk;

	@Autowired
	Jack jack;

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

			int x = 10;
			int y = 5;
			System.out.println("Calculator:");
			System.out.println(x + " + " + y + " = " + calc.add(x,y));
			System.out.println(x + " - " + y + " = " + calc.subtract(x,y));
			System.out.println(x + " * " + y + " = " + calc.multiply(x,y));
			System.out.println(x + " / " + y + " = " + calc.divide(x,y));

			System.out.println("Beanstalk:");
			jack.showPeople();
			for (String i : jack.pairTmWithStudents().keySet()) {
				System.out.println(i + ": " + Arrays.toString(jack.pairTmWithStudents().get(i)));
			}
		};
	}

}
