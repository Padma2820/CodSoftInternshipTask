package Task4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		UserBankAccount userBankAccount = new UserBankAccount(50000);
		
		ATM atm = new ATM(userBankAccount);
		atm.display();
		Scanner scanner = new Scanner(System.in);
		int enterOption = -1;
		while(enterOption!=4) {
			System.out.print("Enter your option: ");
			 enterOption = scanner.nextInt();
			atm.action(enterOption);
		}
	
	}

}
