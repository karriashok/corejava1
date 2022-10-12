package corejava;


	class employee{
		int id;
	double salary;
	String name;
	employee(int id,double salary,String name){
	    	this.id=id;
	    	this.salary=salary;
	    	this.name=name;
	    
	    }
	    void display() {
	    	System.out.println("id is "+  id  +" salary is "+salary+"name is "+name);
	    }
		
	}

	public class Constructor {

		public static void main(String[] args) {
			employee obj = new employee(1245,2500,"nivi");
			obj.display();
		
			


		}

}
