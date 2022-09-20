package theme;

import java.util.Scanner;

class Adding{
	void sum(int x,float y) {
		System.out.println("sum is "+(x+y));
	}
	void sum(float x,int y) {
		System.out.println("sum is "+(x+y));
	}
}
public class Assaignment2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Adding a =new Adding();
		System.out.println("Enter the value");
		a.sum(sc.nextInt(), sc.nextFloat());
		a.sum(sc.nextFloat(), sc.nextInt());
		

	}

}
