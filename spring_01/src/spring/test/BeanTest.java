package spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.HelloWorld;

public class BeanTest {

	@Test
	public void testHello() {
		HelloWorld helloWorld = new HelloWorld();

		helloWorld.setName2("cc");

		helloWorld.sayHello();
	}

	@Test
	public void testSpringHello() {
		// 1.创建spring的ioc容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从Ioc容器对象获取bean的实例
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorld");
		// 3.调用hello方法。
		bean.sayHello();
	}

}
