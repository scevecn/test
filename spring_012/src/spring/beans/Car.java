package spring.beans;

public class Car {
	/**
	 * Ʒ��
	 */
	private String brand;
	/**
	 * �۸�
	 */
	private double price;

	public Car() {
		super();
		System.out.println("Car construtor ...���췽��");
	}

	public void init() {
		System.out.println("Car init() ...���ڳ�ʼ��");
	}

	public void destory() {
		System.out.println(this + " destory() ...��������");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Car setBrand() ... ����Ʒ��");
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Car setPrice() ... ���ü۸�");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
