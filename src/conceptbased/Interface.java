package conceptbased;

interface vehicles{
	void milage () ;
	void cost();
	}
abstract class car1 implements vehicles{
	void viper() {
		System.out.println("car has vipers ");
	}
}
abstract class bike implements vehicles{
	void stand() {
		System.out.println("bike has stand");
	}
}
class kia extends car1{
	
	public void milage() {
		System.out.println("kia car milage is 15km");
	}
	public void cost() {
	System.out.println("cost of the kia car = 20lakhs\n");
	}
}
class volvo extends car1{
	public void milage() {
		
	System.out.println("volvo car milage is 12km");
	}

	public void cost() {
		System.out.println("cost of the car = 25lakhs\n");
		
	}
	
}
class R15 extends bike{


	public void milage() {
		System.out.println("R15 milage is 20km");
		
	}

	
	public void cost() {
		System.out.println("cost of the bike = 2 lakhs\n");
	}
	
}
class pulsur extends bike{


	public void milage() {
		System.out.println("pulsur bike milage is 25km");
		
	}

	public void cost() {
		System.out.println("cost of the bike = 1.5 lakhs");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		car1 c;
		c=new kia();
		c.viper();
		c.milage();
		c.cost();
		c=new volvo();
		c.viper();
		c.milage();
		c.cost();
		bike b;
		b= new R15();
		b.stand();
		b.milage();
		b.cost();
		b=new pulsur();
		b.stand();
		b.milage();
		b.cost();
	}
}
