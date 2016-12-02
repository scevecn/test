package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Car;

public class CycleTest {

	ConfigurableApplicationContext ctx;

	@Before
	public void getApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");
	}

	@Test
	public void test01() {
		Car bean = (Car) ctx.getBean("car");
		System.out.println(bean);
		
		bean = (Car) ctx.getBean("car2");
		//¹Ø±ÕiocÈÝÆ÷
		ctx.close();
	}
}
