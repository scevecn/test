package spring.factory;

import java.util.HashMap;
import java.util.Map;

import spring.beans.Car;

/**
 * ʵ������
 * @author chenchuan
 *
 */
public class CarInstanceFactory {

	private Map<String,Car> carMap = new HashMap<String, Car>();

	public CarInstanceFactory() {
		super();
		
		Car car = new Car();
		car.setBrand("�µ�");
		car.setPrice(100);
		carMap.put("�µ�",car );
		
		car = new Car();
		car.setBrand("����");
		car.setPrice(101);
		carMap.put("����",car );
	}
	
	public  Car getCar(String carName) {
		Car car = null;
		if(carMap.containsKey(carName)){
			car = carMap.get(carName);
		}
		return car;
	}
	
	
}
