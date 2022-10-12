package ourchoice;
import java.util.Scanner;

class Sum{
	void add(int x,int y) {
		System.out.println("Integer sum="+(x+y));
		
	}
	void add(float x,float y) {
		System.out.println("Decimal sum="+(x+y));
		
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the value");
		Sum s = new Sum();
		System.out.println();
		s.add(cs.nextInt(), cs.nextInt());
		s.add(cs.nextFloat(),cs.nextFloat() );

	}

}
