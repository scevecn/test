package spring.beans;

public class Address {

	private String sheng;

	private String shi;

	@Override
	public String toString() {
		return "Address [sheng=" + sheng + ", shi=" + shi + "]";
	}

	public String getSheng() {
		return sheng;
	}

	public void setSheng(String sheng) {
		this.sheng = sheng;
	}

	public String getShi() {
		return shi;
	}

	public void setShi(String shi) {
		this.shi = shi;
	}

}
