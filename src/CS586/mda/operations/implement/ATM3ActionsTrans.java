package CS586.mda.operations.implement;

import CS586.mda.dataStore.DataStore;
import CS586.mda.operations.ATMActionsTrans;

public class ATM3ActionsTrans extends ATMActionsTrans {

	int x;
	String y;

	@Override
	public void store_pin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void store_balance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display_menu() {
		// TODO Auto-generated method stub
		System.out.println("ATM 3 :");
		System.out.println("MENU :");
		System.out.print("1. card(int, int)");
		System.out.print("2. pin(int)");
		System.out.print("3. deposit(int)");
		System.out.print("4. withdraw(int)");
		System.out.print("5. balance()");
		System.out.print("6. exit()");
		System.out.print("7. lock()");
		System.out.print("8. unlock()");
		System.out.println("9. Quit the demo program");
	}

	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		int balance = (Integer) DataStore.atm3Datastore.get(DataStore.BALANCE);
		int deposit = (Integer) DataStore.atm3Datastore.get(DataStore.DEPOSIT);
		DataStore.atm3Datastore.put(DataStore.BALANCE, balance + deposit);
	}

	@Override
	public void MakeWithDraw() {
		// TODO Auto-generated method stub
		int balance = (Integer) DataStore.atm3Datastore.get(DataStore.BALANCE);
		int withDraw = (Integer) DataStore.atm3Datastore
				.get(DataStore.WITHDRAWN);
		int mini = (Integer) DataStore.atm3Datastore.get(DataStore.MINI);
		// if balance - withdraw < mini, there is no penalty here because ATM3's
		// penalty is 0.
		if (balance - withDraw < mini) {
			int penalty = 0;
			balance = balance - withDraw - penalty;
		} else {
			balance = balance - withDraw;
		}
		DataStore.atm3Datastore.put(DataStore.BALANCE, balance);
	}

	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int penalty = (Integer) DataStore.atm3Datastore.get(DataStore.PENALTY);
		System.out.println("Penalty is :" + penalty);
	}

	@Override
	public void eject_card() {
		// TODO Auto-generated method stub
		System.out.println("Your transaction is finished !");
	}

	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		int balance = (Integer) DataStore.atm3Datastore.get(DataStore.BALANCE);
		System.out.println("Your balance is " + balance);
	}
}
