package corejava;

	class bank{
		int accno;

		double accBalance;
		bank(int accno,String holderNmae,double accBalance){
			this.accno=accno;
			
			this.accBalance=accBalance;
			
		}
		void display() {
			System.out.println("acc no is "+accno);
			
			System.out.println("account balance is "+ accBalance);
		}
		
	}

	public class ConstructorBank {

		public static void main(String[] args) {
			bank obj = new bank(1235,"",54000);
			obj.display();
			
			
			

		}

}
