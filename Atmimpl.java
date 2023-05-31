package atm;

import java.util.HashMap;
import java.util.Map;

public class Atmimpl implements AtmOperation{
	Atm atm = new Atm();
	Map<Double, String> mini= new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available balance is "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500 ==0) {
		if(withdrawAmount <= atm.getBalance()) {
			mini.put(withdrawAmount, "amount withdrawn");
			atm.setBalance(atm.getBalance()-withdrawAmount);
			System.out.println("Collect the cash "+withdrawAmount);
			viewBalance();
		}else {
			System.out.println("insufficient balance");
		}
		}else {
			System.out.println("please enter amount in multiples of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		
		mini.put(depositAmount, "amount deposited");
		atm.setBalance(atm.getBalance()+depositAmount);
		System.out.println(depositAmount +" Amount deposited successfully");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		System.out.println(mini);
	}

}
