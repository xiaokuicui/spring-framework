package org.spring.examples.notes.circularReferences;

import org.spring.examples.notes.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description :循环引用测试
 * spring 容器初始化 bean 步骤:
 * 1. 实例化 spring 容器(ApplicationContext)
 * 2. 调用 bean 工厂后置处理器扫描类
 * 3. 循环解析扫描出来的类信息
 * 4. 实例化一个 BeanDefinition 对象来存储解析出来的信息
 * 5. 把实例化好的 beanDefinition 对象 put 到 beanDefinitionMap 当中缓存起来
 * 6. 再次调用 bean 工厂的后置处理器
 * 7. 实例化 bean 之前 spring 要做验证，需要遍历所有扫描出来的类，依次判断这个bean是否Lazy，是否prototype，是否abstract等等
 * 8. 如果验证完成, spring 在实例化一个bean之前需要推断构造方法，因为spring实例化对象是通过构造方法反射，故而需要知道用哪个构造方法；
 * 9. 推断完构造方法之后,spring调用构造方法反射实例化一个对象,对象已经实例化出来,但这并不是一个完整的 bean,因为对象属性还没有注入
 * 10. 缓存注解信息 解析合并后的 bd 对象
 * 11. 判断是否支持循环依赖，如果支持则提前把一个工厂存入 singletonFactories——map
 * 12. 判断是否需要完成属性的注入
 * 13. 如果需要完成属性注入，则开始注入属性
 * 14. 判断 bean 的类型回调Aware接口
 * 15. 调用生命周期回调接口
 * 16. 如果需要代理则完成代理--aop
 * 17. put 到单例池容器——bean完成——存在 spring 容器当中
 * 18. 销毁这个对象
 * 其中  8-17 是 bean 的生命周期
 * @author : xiaokui
 * @date : 2021-03-23
 */
public class Test {

	public static void main(String[] args) {
		// 实例化 spring 容器
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		// 关闭循环依赖
		//ac.setAllowCircularReferences(false);
		ac.refresh();
//		System.out.println(ac.getBean(PersonService.class));
//		System.out.println(ac.getBean(UserService.class));
	}
}
