package ½Ç½À1;

class customer {
	String name;
	String phone;
	int point;
	public customer(String name ,String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
	}
	public String toString() {
		return String.format("(%s, %s, %d)",name,phone,point);
	}
}