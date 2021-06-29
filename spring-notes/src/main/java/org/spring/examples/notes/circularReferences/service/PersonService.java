package org.spring.examples.notes.circularReferences.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-03-23
 */
@Component
public class PersonService {

	@Autowired
	private UserService userService;

	public PersonService(){
		System.out.println("personService 实例化");
	}
}
