package collections;

public class Lab implements Dog {

	public static void main(String[] args) {
		Lab l=new Lab();
		l.bark();
		Dog.eat();
		l.sleep();
	}
		public void bark() {
			System.out.println("Dog is barks loudly");
		}

	}


