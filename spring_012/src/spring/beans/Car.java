package spring.beans;

public class Car {
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 价格
	 */
	private double price;

	public Car() {
		super();
		System.out.println("Car construtor ...构造方法");
	}

	public void init() {
		System.out.println("Car init() ...正在初始化");
	}

	public void destory() {
		System.out.println(this + " destory() ...正在销毁");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Car setBrand() ... 设置品牌");
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Car setPrice() ... 设置价格");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
