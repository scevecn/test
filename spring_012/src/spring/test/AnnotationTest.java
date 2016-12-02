package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.annotation.User;
import spring.beans.annotation.controller.UserController;
import spring.beans.annotation.repository.UserRepository;
import spring.beans.annotation.service.UserService;

public class AnnotationTest {

	ConfigurableApplicationContext ctx;

	@Before
	public void getApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
	}

	@Test
	public void test01() {

//		User user = (User) ctx.getBean("user");
//		System.out.println(user);
		
		UserController controller =(UserController) ctx.getBean("userController");
		controller.execute();

//		UserService service = (UserService) ctx.getBean("userService");
//		service.add(null);
//		
//		UserRepository repository = (UserRepository) ctx.getBean("userRepository");
//		repository.save(null);
	}
}
