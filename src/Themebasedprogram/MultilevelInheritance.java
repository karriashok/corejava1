package Themebasedprogram;
class Electronics {
	void cost() {
		System.out.println("No cost ");
	}
	void warranty() {
		System.out.println("No warranty");
	}
}
class Mobile extends Electronics {
	void selectcompany() {
		System.out.println("selected mobile is vivo");
	}
}
class vivo extends Mobile{

	void costofmobile() {
		System.out.println("cost of the mobile is 20000");
	}
	void warrantygiven() {
System.out.println("with 2 years warranty");
	}

}
public class MultilevelInheritance {

	public static void main(String[] args) {
		vivo v =new vivo ();
		v.cost();
		v.warranty();
		v.selectcompany();
		v.costofmobile();
		v.warrantygiven();
			
		}

	}


