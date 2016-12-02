package spring.bean;

/**
 * Bean
 * @author chenchuan
 *
 */
public class HelloWorld {
	
	private String name ;
	
	
	public void setName2(String name) {
		System.out.println("run setName2");
		this.name = name;
	}

	public void sayHello(){
		System.out.println("run sayHello");
		System.out.println("Hello :" + this.name);
	}
}
