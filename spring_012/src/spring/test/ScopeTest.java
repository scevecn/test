package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Car;

public class ScopeTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void getApplicationContext(){
		ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
	}
	
	@Test
	public void test1(){
		Car car = (Car)ctx.getBean("car");
		Car car2 = (Car)ctx.getBean("car");
		
		System.out.println("Ä¬ÈÏÇé¿ö£º" + (car == car2));
		
		
		car = (Car)ctx.getBean("car2");
		car2 = (Car)ctx.getBean("car2");
		System.out.println("prototype£º" + (car == car2));
		
		
		car = (Car)ctx.getBean("car3");
		car2 = (Car)ctx.getBean("car3");
		System.out.println("singleton£º" + (car == car2));
	}
}
