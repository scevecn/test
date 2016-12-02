package spring.factory;

import java.util.HashMap;
import java.util.Map;

import spring.beans.Car;

/**
 * ¾²Ì¬¹¤³§·½·¨
 */
public class CarStaticFactory {

	public static Map<String, Car> carMap = new HashMap<String, Car>();
	static {
		Car car = new Car();
		car.setBrand("°ÂµÏ");
		car.setPrice(100);
		carMap.put("°ÂµÏ",car );
		
		car = new Car();
		car.setBrand("°ÂÍØ");
		car.setPrice(101);
		carMap.put("°ÂÍØ",car );
	}

	public static Car getCar(String carName) {
		Car car = null;
		if(carMap.containsKey(carName)){
			car = carMap.get(carName);
		}
		return car;
	}
}
