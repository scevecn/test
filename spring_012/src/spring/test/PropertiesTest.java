package spring.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {


	private ApplicationContext ctx;

	@Before
	public void getApplicationContext(){
		ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
	}
	
	@Test
	public void test1(){
		DataSource bean = (DataSource)ctx.getBean("dataSource");
		try {
			System.out.println(bean.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		bean = (DataSource)ctx.getBean("dataSource2");
		try {
			System.out.println(bean.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
