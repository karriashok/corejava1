package corejava;

public class Employee2 {
	
		
		String name;
		int salary;
		 int basicsalary, HRA;
		int DA;
		 
		 public void read() {
			 System.out.println("Enter employe name :"+name);
			 System.out.println("enter employe salary:"+salary);
			 System.out.println("enter the basicsalary of employe:"+HRA);
			 System.out.println("ennter the DA:"+DA);
			 
		 }
		 public static void main(String args[]) {
			 Employee2 person=new Employee2();
			 person.name = "rajesh";
			 person.salary = 40000;
			 person.HRA = 5000; 
			 person.DA = 3000;
			 person.read();
		 }
}
