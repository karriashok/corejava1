package ourchoice;
class car{
	void cost() {
		System.out.println("No Cost");
	}
	void milage() {
		System.out.println("No Milage");
	}
}
class Audi extends car{
	void cost() {
		System.out.println("Audi cost is 50 lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 10 km");
	}
}
class Bmw extends Audi{
	void cost() {
		System.out.println("Bmw cost is 40 lakhs");
	}
	void milage() {
		System.out.println("Bmw Milage is 15 km");
	
	}
}
class CarFactory{
	car getCar(String name) {
		if (name.equals("Audi"))
		return new Audi();
		else if (name.equals("Bmw"))
		return new Bmw();
		else
		return null;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		car x=cf.getCar("Bmw");
		x.cost();
		x.milage();
		

	}

}
