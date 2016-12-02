package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Person;

public class AutowireTest {

	private ApplicationContext ctx;

	@Before
	public void getApplicationContext(){
		ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
	}
	
	@Test
	public void test1(){
		Person bean = (Person)ctx.getBean("person");
		System.out.println(bean);
	}
	
	@Test
	public void test2(){
		Person bean = (Person)ctx.getBean("person2");
		System.out.println(bean);
	}
	
	@Test
	public void test3(){
		Person bean = (Person)ctx.getBean("person3");
		System.out.println(bean);
	}
}
