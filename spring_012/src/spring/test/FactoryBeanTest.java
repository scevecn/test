package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Car;

public class FactoryBeanTest {

	ConfigurableApplicationContext ctx;

	@Before
	public void getApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");
	}

	@Test
	public void test01() {
		Car bean = (Car) ctx.getBean("factoryBean");
		System.out.println(bean);
		
		//¹Ø±ÕiocÈÝÆ÷
//		ctx.close();
	}
}
