package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Address;
import spring.beans.Car;
import spring.beans.Person;

public class SpelTest {


	private ApplicationContext ctx;

	@Before
	public void getApplicationContext(){
		ctx = new ClassPathXmlApplicationContext("beans-spel.xml");
	}
	
	@Test
	public void test1(){
		Address address = (Address)ctx.getBean("address");
		System.out.println(address);
		
		Car car = (Car)ctx.getBean("car");
		System.out.println(car);
		
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
	}
	
}
