package org.spring.examples.notes.circularReferences.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-03-23
 */
@Component
public class ManagerService implements ApplicationContextAware {

	@Autowired
	private UserService userService;

	/**
	 * 构造方法
	 */
	public ManagerService(){
		System.out.println("ManagerService 实例化");
	}

	/**
	 * 生命周期初始化回调方法
	 */
	@PostConstruct
	public void init(){
		System.out.println("call ManagerService lifecycle init callback");
	}

	/**
	 * ApplicationContextAware 回调方法
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call aware callback");
	}
}
