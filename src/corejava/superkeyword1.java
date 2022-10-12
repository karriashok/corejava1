package corejava;

	class parent{
		
		int age =40;
	}
	class child extends parent{
		int age =22;
	 void details() {
		 System.out.println("parent age is "+super.age);
		 System.out.println("child age is "+this.age);
		 
	 }
	 

	}

	public class superkeyword1 {

		public static void main(String[] args) {
			child obj = new child();
			obj.details();
			

		}

}
