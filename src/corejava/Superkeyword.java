package corejava;

	class father{
		
		int age =40;
		father(){
			System.out.println("parent age is"+age);
		}
	}
	class son extends father{
		int age =22;
	 son()

	 {	
		 super();
		 System.out.println("child age is "+this.age);
		 
	 }
	 

	}

	public class Superkeyword {

		public static void main(String[]args) {
			son obj = new son();
			
			

		}
}
