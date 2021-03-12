package assignments;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account_Details acc = new Account_Details("Gabriel Dahaman", "1234567890", 200, 12000, 100, 300);
		acc.display();
		
	}

}


class Account{
	String customer_name, account_no;
	
	public Account(String customer_name, String account_no) {
		this.customer_name = customer_name;
		this.account_no = account_no;
	}
	
	public void display() {
		System.out.println("Customer name: "+customer_name+ " Account number: "+account_no);
	}
}

class Saving_Account extends Account{
	double min_bal, saving_bal;
	
	public Saving_Account(String customer_name, String account_no, double min_bal, double saving_bal){
		super(customer_name, account_no);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}
	
	public void display() {
		System.out.println("Customer name: "+customer_name+ " Account number: "+account_no + " Minimum balance: "+min_bal+ " Saving balance: "+saving_bal);
		
	}
}

class Account_Details extends Saving_Account{
	double deposits, withdrawals;
	
	public Account_Details(String customer_name, String account_no, double min_bal, double saving_bal, double deposits, double withdrawals){
		super(customer_name, account_no, min_bal, saving_bal);
		this.deposits = deposits;
		this.withdrawals = withdrawals;
	}
		public void display() {
			super.display();
			System.out.println("Deposits: "+deposits+ " Withdrawals: "+withdrawals);
	}
}