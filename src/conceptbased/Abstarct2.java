package conceptbased;
abstract class car{
	abstract void cost();
	abstract void milage();
	void start() {
		System.out.println("start with key");
	}
}
class Audi extends car{
	void cost() {
		System.out.println("Audi cost is 50 lakhs");	
	}
	void milage() {
		System.out.println("Audi milage is 10km");	
	}
}
class Bmw extends Audi{
	void cost() {
		System.out.println("Bmw cost is 40 lakhs");
		
	}
	void milage() {
		System.out.println("Bmw milage is 15km");
		
	}
}
public class Abstarct2 {

	public static void main(String[] args) {
		car c;
		c=new Audi();
		c.start();
		c.cost();
		c.milage();
		c=new Bmw();
		c.start();
		c.cost();
		c.milage();

	}

}
