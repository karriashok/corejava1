package conceptbased;

import java.util.Scanner;

class ElectronicDevice{
	String name;
	Scanner sc = new Scanner(System.in);
	void device() {
		System.out.println("Enter the mobile name");
		name=sc.next();
	}
	void company() {
		System.out.println("selected mobile is "+name);
	}
}
class device extends ElectronicDevice{
	int a;
	void cost() {
		System.out.println("Enter the cost");
		a=sc.nextInt();
	}
	void device1() {
	
		System.out.println("cost of the mobile is "+a);
	}
}

public class SinglelevelInheritance {

	public static void main(String[] args) {
		device d=new device();
		d.device();
		d.company();
		d.cost();
		d.device1();
		
	}

}
