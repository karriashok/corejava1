package conceptbased;
import java.util.Scanner;
class Square{
	int a;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter the value");
		a=sc.nextInt();
	}
	void sqr() {
		System.out.println("Square ="+(a*a));
	}
}
class sum extends Square{
	int b;
	void accept() {
		System.out.println("Enter b value");
		b=sc.nextInt();
	}
	void add () {
		System.out.println("Sum ="+(a+b));
	}
}
public class SinglelevelInheritance2 {

	public static void main(String[] args) {
		sum s=new sum();
		s.input();
		s.sqr();
		s.accept();
		s.add();

	}

}

