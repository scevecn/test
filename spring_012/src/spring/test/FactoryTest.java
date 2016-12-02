package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Car;

public class FactoryTest {

	ConfigurableApplicationContext ctx;

	@Before
	public void getApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
	}

	@Test
	public void test01() {
		Car bean = (Car) ctx.getBean("car");
		System.out.println(bean);
		
		//¹Ø±ÕiocÈÝÆ÷
//		ctx.close();
	}
	
	
	@Test
	public void test02() {
		Car bean = (Car) ctx.getBean("car2");
		System.out.println(bean);
		
		//¹Ø±ÕiocÈÝÆ÷
//		ctx.close();
	}
}
