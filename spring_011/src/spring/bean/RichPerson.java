package spring.bean;

import java.util.List;

/**
 * Bean
 * 
 * @author chenchuan
 *
 */
public class RichPerson {

	private String name;
	
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RichPerson() {
		super();
	}

	public RichPerson(String name, List<Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "RichPerson [name=" + name + ", cars=" + cars + "]";
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}






	
}
