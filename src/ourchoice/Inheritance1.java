package ourchoice;

class Fruits {
	void fruit1() {
		System.out.println("the fruit is apple");
		System.out.println("-----------------");
	}
}
class Yellow extends Fruits{
	void fruit2() {
		System.out.println("the fruit is mango");
		System.out.println("-----------------");
	}
}
class Green extends Yellow{
	void fruit3() {
		System.out.println("the fruits is grapes");
		System.out.println("-----------------");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
	Green f =new Green();
	f.fruit1();
	f.fruit2();
	f.fruit3();

	}

}
