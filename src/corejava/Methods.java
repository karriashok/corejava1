package corejava;

public class Methods {
	
		static int currentBalance = 70000;
		public static void  greeting(){
			System.out.println("welcome to the banking application");
		}
		
		public  void diposit(int amount){
			currentBalance = currentBalance+amount; 
			System.out.println("the amount is sucsesfully deposited");
			
		}
		public static void withdrawl(int amount) {
			currentBalance = currentBalance-amount;
			System.out.println("the amount is sucsesfully withdrawn");
			
		}
		public static int getCurrentBalance() {
			return currentBalance;
		}
		public static void main(String args[]) {
			Methods obj = new Methods();
				greeting();
				System.out.println("currentBalance is :"+ getCurrentBalance());
				obj.diposit(11000);
				System.out.println("currentBalance is :"+ getCurrentBalance());
				
				withdrawl(5200);
				System.out.println("currentBalance is :"+ getCurrentBalance());
				getCurrentBalance();
				
				
				
			}
			
}
