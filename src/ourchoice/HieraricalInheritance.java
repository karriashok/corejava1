package ourchoice;

class mobile{
	void cost() {
		System.out.println("No Cost");
	}
	void warranty() {
		System.out.println("No warranty");
	}
}
class vivo extends mobile{
	void cost() {
		System.out.println("cost of vivo mobile 10000");
	}
	void warranty() {
		System.out.println("warranty 2 years");
	}
}
class oneplus extends mobile{
	void cost() {
		System.out.println("cost of oneplus mobile 20000");
	}
	void warranty() {
		System.out.println("warranty 1.5 years");
	}
}
public class HieraricalInheritance {

	public static void main(String[] args) {
		mobile m =new mobile();
		m.cost();
		m.warranty();
		m=new vivo();
		m.cost();
		m.warranty();
		m=new oneplus();
		m.cost();
		m.warranty();
	}
}
		
		
		
		
		
		
		
		
		
		
		