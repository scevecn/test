package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.generic.controller.UserController;



public class GenericTest {

	ConfigurableApplicationContext ctx;

	@Before
	public void getApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans-generic.xml");
	}

	@Test
	public void test01() {
		UserController controller =(UserController) ctx.getBean("userController");
		controller.execute();
	}
}
