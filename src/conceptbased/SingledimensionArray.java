package conceptbased;

import java.util.Scanner;

public class SingledimensionArray {

		public static void main(String[] args) {
			int a[];
			a=new int[6];
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<6;i++) {
			System.out.println("Enter the array value");
			a[i]=sc.nextInt();
			}
			int sum=0;
		for (int i=0;i<6;i++) {
			sum =sum+a[i];
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("sum="+sum);
		}
}
		

