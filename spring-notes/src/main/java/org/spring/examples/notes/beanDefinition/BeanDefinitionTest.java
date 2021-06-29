package org.spring.examples.notes.beanDefinition;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Description :
 * 1. RootBeanDefinition 不能设置 setParentName
 *
 * @author : xiaokui
 * @date : 2021-03-18
 */
public class BeanDefinitionTest {

}

class RootBeanDefinitionTest{

	public static void main(String[] args) {
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(UserService.class);
		rootBeanDefinition.getPropertyValues().add("name","cuixiaokui");
		rootBeanDefinition.getPropertyValues().add("age","16");

		GenericApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.registerBeanDefinition("rootBeanDefinition",rootBeanDefinition);
		ac.refresh();
		System.out.println(ac.getBean(UserService.class));
		System.out.println(ac.getBean(UserService.class).getAge());
	}

}

class UserService{
	private String name;

	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
