package spring.bean;

import java.util.Map;

/**
 * Bean
 * 
 * @author chenchuan
 *
 */
public class RegalPerson {

	private String name;
	
	private Map<String, Car> carMap;

	

	@Override
	public String toString() {
		return "RegalPerson [name=" + name + ", carMap=" + carMap + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Map<String, Car> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car> carMap) {
		this.carMap = carMap;
	}







	
}
