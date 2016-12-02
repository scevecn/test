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
		//�������Ͷ�λioc�����е�bean��Ҫ��ioc������ֻ����һ����class���͵�bean
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
		// 2.��Ioc���������ȡbean��ʵ��
		//�������Ͷ�λioc�����е�bean��Ҫ��ioc������ֻ����һ����class���͵�bean
		Car car =  (Car) ctx.getBean("car");
		Car car2 =  (Car) ctx.getBean("car2");
		Car car3 =  (Car) ctx.getBean("car3");

		// 3.����hello������
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	} 
	
	
	@Test
	public void testSpringConstructor() {
		// 2.��Ioc���������ȡbean��ʵ��
		//�������Ͷ�λioc�����е�bean��Ҫ��ioc������ֻ����һ����class���͵�bean
		Car car =  ctx.getBean(Car.class);
		
		// 3.����hello������
		System.out.println(car);
	} 
	
	@Test
	public void testSpringPerson() {
		// 2.��Ioc���������ȡbean��ʵ��
		//����id��λ��ioc�����е�bean
		Person bean = (Person) ctx.getBean("person");
	
		// 3.����hello������
		System.out.println(bean);
	}
	
	
	
	@Test
	public void testSpringBeanFactory() {
		// 1.����spring��ioc��������
		@SuppressWarnings("resource")
		BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.��Ioc���������ȡbean��ʵ��
		Person bean = (Person) ctx.getBean("person");
		// 3.����hello������
		System.out.println(bean);
	}
	
	@Before
	public void before(){
		// 1.����spring��ioc��������
		//ClassPathXmlApplicationContext���� ��·���¼��������ļ�
		//FileSystemXmlApplicationContext: ���ļ�ϵͳ�м��������ļ�
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
}
