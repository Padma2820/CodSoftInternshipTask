package Task4;

import java.util.Scanner;

public class ATM {
	 public UserBankAccount userBankAccount;
	 
	 public ATM(UserBankAccount userBankAccount) {
		 this.userBankAccount = userBankAccount;
		 
	 }

	 public void display() {
	        System.out.println("Welcome to the ATM!");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit Money");
	        System.out.println("3. Withdraw Money");
	        System.out.println("4. Exit");
	    }
	 
	 public void checkBalance() {
		 System.out.println("Your balance is: "+userBankAccount.getBalance());
		
	}
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 public void action(int option) {
		 switch (option) {
		case 1: {
			
			checkBalance();
			break;
		}
		case 2 : {
			System.out.print("Enter the amount you want to deposit: ");
			double depositMoney = scanner.nextDouble();
			
			userBankAccount.deposit(depositMoney);
			break;
			
		}
		case 3 : {
			System.out.print("Enter the amount you want to withdraw: ");
			double withdrawMoney = scanner.nextDouble();
			userBankAccount.withdraw(withdrawMoney);
			break;
			
		}
		case 4 : {
			System.out.println("Succesfully Exited..");
			break;
		}
		default:
			 System.out.println("Invalid option! Please try again.");
		}
		
	}
}

