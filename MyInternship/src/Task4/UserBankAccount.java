package Task4;

public class UserBankAccount {
	
	public double balance;
		
	public UserBankAccount(double balance) {
		this.balance=balance;
		
	}
	
	 public double getBalance() {
	        return balance;
	    }
	 
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance =balance+ amount;
	            System.out.println("Deposit successful! Current balance is: " + balance);
	        } 
	    }
	 

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawal successful! Current balance is: " + balance);
	            
	        } else {
	            System.out.println("Withdrawal failed. Insufficient balance or invalid amount!");
	            
	        }
	    }

}
