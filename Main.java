package atm;

import java.lang.System.Logger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Atmimpl op = new Atmimpl();
		int atmNumber = 12345;
		int atmPin=123;
		System.out.println("---ATM Machine---");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ATM number : ");
		int userNumber = input.nextInt();
		System.out.print("Enter ATM pin : ");
		int userPin = input.nextInt();
		if((atmNumber == userNumber) && (atmPin == userPin)) {
			System.out.println("Logged in succefully");
			while(true) {
				System.out.println("1.View available balance\n2.Withdraw amount \n3.Deposit amount \n4.View MiniStatement \n5.Exit");
				System.out.println("Enter a choice : ");
				int ch = input.nextInt();
				if(ch == 1) {
					op.viewBalance();
				}else if(ch == 2) {
					System.out.println("Enter amount to withdraw : ");
					double withdrawAmount = input.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}else if(ch == 3) {
					System.out.println("Enter amount to deposit : ");
					double depositAmount = input.nextDouble();
					op.depositAmount(depositAmount);
				}else if(ch == 4) {
					op.viewMiniStatement();
				}else if(ch == 5) {
					System.out.println("Collect your ATM card\n ");
				}else {
					System.out.println("Please enter correct choice");
				}
			}
		}else {
			System.out.println("Invalid credentials");
			System.exit(0);
		}
	}

}
