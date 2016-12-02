package spring.bean;

/**
 * Bean
 * 
 * @author chenchuan
 *
 */
public class Person {

	private String name;
	
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}




	
}
