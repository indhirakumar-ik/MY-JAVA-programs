package indhirakumar;

class lamborgini{
	private String model;
	private int price;
	
	void data(String model,int price) {
		this.setModel(model);
		this.setPrice(price);
	}
	public String model() {
		return model;
	}
	public int price() {
		return price;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}

class ik{
	private int age;
	void setter(int age) {
		this.age=age;
	}
	public  int getter() {
		return age;
	}
}

public class setterAndsetterMethod {
	public static void main(String[] args) {
		lamborgini la=new lamborgini();
		la.data("Aventador",5000000);
		la.setModel("new Avento");
		la.setPrice(2000000);
		System.out.println(la.model());
		System.out.println(la.price());
		ik i=new ik();
		i.setter(5);
		System.out.println("the number is"+i.getter());
	}
}
