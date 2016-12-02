package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Address;
import spring.beans.Person;

public class RelationTest {
	private ApplicationContext ctx ;
	
	@Before
	public void getApplicationContext(){
		ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
	}
	
	@Test
	public void test1(){
		
		Address address = (Address)ctx.getBean("address2");
		System.out.println(address);
		
		address = (Address)ctx.getBean("address3");
		System.out.println(address);
		
		
		address = (Address)ctx.getBean("address4");
		System.out.println(address);
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
		
		person = (Person)ctx.getBean("person2");
		System.out.println(person);
		
		
		person = (Person)ctx.getBean("person3");
		System.out.println(person);
		
		person = (Person)ctx.getBean("person4");
		System.out.println(person);
	}
}
