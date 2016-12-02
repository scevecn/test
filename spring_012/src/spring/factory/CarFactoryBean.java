package spring.factory;

import org.springframework.beans.factory.FactoryBean;

import spring.beans.Car;

/**
 * factoryBean
 * 
 * @author chenchuan
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand(brand);
		car.setPrice(10.1);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
