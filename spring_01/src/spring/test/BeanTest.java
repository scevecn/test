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
		// 1.����spring��ioc��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.��Ioc���������ȡbean��ʵ��
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorld");
		// 3.����hello������
		bean.sayHello();
	}

}
