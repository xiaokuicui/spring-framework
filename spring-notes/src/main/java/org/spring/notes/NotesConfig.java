package org.spring.notes;

import org.spring.notes.service.UserService;
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
public class NotesConfig {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext =
				new AnnotationConfigApplicationContext(NotesConfig.class);
//		UserService userService = (UserService) configApplicationContext.getBean("userService");
//		System.out.println(userService);

		ClassPathXmlApplicationContext xmlApplicationContext =
				new ClassPathXmlApplicationContext("spring-config.xml");
		UserService userService1 = (UserService) xmlApplicationContext.getBean("userService");
		System.out.println(userService1);

	}
}
