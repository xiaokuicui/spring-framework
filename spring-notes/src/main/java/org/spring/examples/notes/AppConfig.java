package org.spring.examples.notes;

import org.spring.examples.notes.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-03-01
 */
@ComponentScan(basePackages = "org.spring.notes")
public class AppConfig {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = (UserService) configApplicationContext.getBean("userService");
//		System.out.println(userService);

		ClassPathXmlApplicationContext xmlApplicationContext =
				new ClassPathXmlApplicationContext("spring-config.xml");
		UserService userService1 = (UserService) xmlApplicationContext.getBean("userService");
		System.out.println(userService1);

	}
}
