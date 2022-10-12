package corejava;

	class Employees{
		
		int id ;
		String name ;
		float salary;
		long phnno;
		Employees(int i,String n,float s){
			
			id = i;
			name = n;
			salary = s;
			
		}
		Employees (Employees s){

			id =  s.id;
			name = s.name;
			salary = s.salary;
			phnno = s.phnno;
			
		}
		void displayInformation() {
			
			
			System.out.println(id+" "+name+" "+salary+" "+phnno);
		}
		
		
	}

	public class ParameterizedConstructor {

		public static void main(String[] args) {
			Employees m = new Employees(111,"intel",12121);
			Employees m1 = new Employees(m);
		
		m.displayInformation();
		m1.displayInformation();

		}

}
