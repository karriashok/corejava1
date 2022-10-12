package corejava;

	class student33
	{
	int id ;
	String name ;
	 static String name1  = "mist";
	 	static void  change (){
	 		name1 = "mic";
	 		
	 		
	 	}
	 	
	 	student33 (int i,String n){
	 		id = i;
	 		name = n;

	 	}
		void display() {
			System.out.println(id+" "+name+" "+name1);
		}
	}

	public class Statickeyword { 
		public static void main(String args[]) {
			student33.change();
			student33 s = new student33 (111,"Ashok");
			s.display();
			
			
			
		}

}
