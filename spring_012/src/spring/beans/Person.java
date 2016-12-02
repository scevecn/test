package spring.beans;

public class Person {

	private String name;

	private int age;

	private Car car;

	private Address address;
	
	/**
	 * ����ʹ��address�е�shi����
	 */
	private String city;
	
	
	/**
	 * ��Ϣ��ֵȡ����Car��price���ԵĴ�С
	 */
	private String info;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", address=" + address + ", city=" + city
				+ ", info=" + info + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
