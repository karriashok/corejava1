package corejava;

	class BankDetails{
		long acc_no;
		int pin;
		double account_balance;
		static String bank_name;
		String branch;
		float referral_code;
		
		
	}

	public class Variables {

		public static void main(String[] args) {
			BankDetails obj= new BankDetails();
			obj.acc_no=154645887;
			obj.pin=1251;
			obj.account_balance=2800.80;
			obj.bank_name="state bank of india";
			obj.branch="local branch khammam";
			obj.referral_code=5240.55f;
			
			System.out.println("the acc no is= "+obj.acc_no);
			System.out.println("the bank pin is= "+obj.pin);
			System.out.println("account balance is= "+obj.account_balance);
			System.out.println("the bank name is= "+ obj.bank_name);
			System.out.println("refferral code is= "+ obj.referral_code);
			
}
}