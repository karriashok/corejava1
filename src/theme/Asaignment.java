package theme;
import java.util.Scanner;

class Add{
	void adding(int x,int y) {
		System.out.println("Integer sum="+(x+y));
		
	}
	void adding(float x,float y,float z) {
		System.out.println("Decimal sum="+(x+y));
		
	}
}
public class Asaignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Add s = new Add();
		System.out.println("Enter the value");
		s.adding(sc.nextInt(), sc.nextInt());
		s.adding(sc.nextFloat(),sc.nextFloat() ,sc.nextFloat());
	}

}
