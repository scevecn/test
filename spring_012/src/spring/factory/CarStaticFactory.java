package spring.factory;

import java.util.HashMap;
import java.util.Map;

import spring.beans.Car;

/**
 * ��̬��������
 */
public class CarStaticFactory {

	public static Map<String, Car> carMap = new HashMap<String, Car>();
	static {
		Car car = new Car();
		car.setBrand("�µ�");
		car.setPrice(100);
		carMap.put("�µ�",car );
		
		car = new Car();
		car.setBrand("����");
		car.setPrice(101);
		carMap.put("����",car );
	}

	public static Car getCar(String carName) {
		Car car = null;
		if(carMap.containsKey(carName)){
			car = carMap.get(carName);
		}
		return car;
	}
}
