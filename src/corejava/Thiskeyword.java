package corejava;

	class emp{
		int id ;
		static String companyname;
		long num;
		

	emp(int id,long num){
		this("genpact");
		this.id=id;
		
		this.num=num;
		this.show();
	}
	emp(String companyname){
		this.companyname = companyname;
	}
		
	void show() {
		
		System.out.println("id is "+id);
		System.out.println("company name is "+companyname);
		System.out.println("num is "+num);
		
	}
		
	}

	public class Thiskeyword {

		public static void main(String[] args) {
			emp obj = new emp(12,56546654);
			emp obj1 = new emp(125,55489898);
			

		}
}
