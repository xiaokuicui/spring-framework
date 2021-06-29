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
public class UserService {

	@Autowired
	private PersonService personService;

	public UserService() {
		System.out.println("userService 实例化");
	}
}
