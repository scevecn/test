package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.Car;
import spring.bean.DataSource;
import spring.bean.Person;
import spring.bean.RegalPerson;
import spring.bean.RichPerson;

public class BeanTest {
	public ApplicationContext ctx;

	@Test
	public void testSpringConstructor8(){
		RichPerson bean = (RichPerson)ctx.getBean("richPerson3");
		System.out.println(bean);
	}
	@Test
	public void testSpringConstructor7(){
		RichPerson bean = (RichPerson)ctx.getBean("richPerson2");
		System.out.println(bean);
	}
	
	@Test
	public void testSpringConstructor6(){
		DataSource bean = ctx.getBean(DataSource.class);
		System.out.println(bean);
	}
	
	@Test
	public void testSpringConstructor5(){
		RegalPerson bean = (RegalPerson)ctx.getBean("regalPerson");
		System.out.println(bean);
	}
	
	@Test
	public void testSpringConstructor4() {
		//利用类型定位ioc容器中的bean，要求ioc容器中只能有一个该class类型的bean
		RichPerson bean =  (RichPerson) ctx.getBean("richPerson");
		System.out.println(bean);
	} 
	
	@Test
	public void testSpringConstructor3() {
		
		Person bean =  (Person) ctx.getBean("person");
		System.out.println(bean);
		
		Person bean2 =  (Person) ctx.getBean("person2");
		System.out.println(bean2);
	} 
	
	@Test
	public void testSpringConstructor2() {
		// 2.从Ioc容器对象获取bean的实例
		//利用类型定位ioc容器中的bean，要求ioc容器中只能有一个该class类型的bean
		Car car =  (Car) ctx.getBean("car");
		Car car2 =  (Car) ctx.getBean("car2");
		Car car3 =  (Car) ctx.getBean("car3");

		// 3.调用hello方法。
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	} 
	
	
	@Test
	public void testSpringConstructor() {
		// 2.从Ioc容器对象获取bean的实例
		//利用类型定位ioc容器中的bean，要求ioc容器中只能有一个该class类型的bean
		Car car =  ctx.getBean(Car.class);
		
		// 3.调用hello方法。
		System.out.println(car);
	} 
	
	@Test
	public void testSpringPerson() {
		// 2.从Ioc容器对象获取bean的实例
		//利用id定位到ioc容器中的bean
		Person bean = (Person) ctx.getBean("person");
	
		// 3.调用hello方法。
		System.out.println(bean);
	}
	
	
	
	@Test
	public void testSpringBeanFactory() {
		// 1.创建spring的ioc容器对象
		@SuppressWarnings("resource")
		BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从Ioc容器对象获取bean的实例
		Person bean = (Person) ctx.getBean("person");
		// 3.调用hello方法。
		System.out.println(bean);
	}
	
	@Before
	public void before(){
		// 1.创建spring的ioc容器对象
		//ClassPathXmlApplicationContext：从 类路径下加载配置文件
		//FileSystemXmlApplicationContext: 从文件系统中加载配置文件
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
}
