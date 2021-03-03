package org.spring.examples.notes.service;

import org.springframework.stereotype.Service;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-03-01
 */
@Service
public class UserService {

	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
