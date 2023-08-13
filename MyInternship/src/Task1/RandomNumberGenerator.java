package Task1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
	public static void totalScore() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess the number between 1 to 100");

		boolean play = true;
		while(play) {
			int max_range = 100;
            Random random = new Random();
			int random_number = random.nextInt(max_range) + 1;
			int maxAttempts = 5;
			int attempt = 0;
			int totalScore = 0;
            while (attempt < maxAttempts) {
                int user = scanner.nextInt();
				attempt++;
				if (user == random_number) {
					totalScore += maxAttempts - attempt + 1;
					System.out.print("You have guessed the number!!!!");
					System.out.println("Your score is :"+" "+attempt);
					break;

				} else if (user > random_number) {
					System.out.println("Your number is too high..Please try again!!");

				} else {
					System.out.println("Your number is too low..Please try again!!");
				}
			
			
			if (attempt == maxAttempts) {
				System.out.println("You have reached the maximum limit");
				System.out.println("Sorry your score is "+" "+0);
			}
            }
			
			System.out.println("Do you want to play again?");
			String replyString = scanner.next();
			play = replyString.equalsIgnoreCase("yes");
			if(play==true) {
				System.out.print("Guess the number between 1 to 100");
			}
		}
		
			System.out.println("Thank you!!");
	}
	

	public static void main(String[] args) {
		totalScore();

	}

}
