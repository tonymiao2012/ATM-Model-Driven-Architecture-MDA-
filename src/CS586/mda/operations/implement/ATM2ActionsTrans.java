package CS586.mda.operations.implement;

import CS586.mda.dataStore.DataStore;
import CS586.mda.operations.ATMActionsTrans;

public class ATM2ActionsTrans extends ATMActionsTrans {
	@Override
	public void store_pin() {
		// TODO Auto-generated method stub
		// Store temp data to RAM
	}

	@Override
	public void store_balance() {
		// TODO Auto-generated method stub
		// Store temp data to RAM
	}

	@Override
	public void display_menu() {
		// TODO Auto-generated method stub
		System.out.println("ATM 2 :");
		System.out.println("MENU :");
		System.out.print("1. card(float, int) ");
		System.out.print("2. pin(int) ");
		System.out.print("3. deposit(float) ");
		System.out.print("4. withdraw(float) ");
		System.out.print("5. balance() ");
		System.out.print("6. exit() ");
		System.out.println("9. Quit the demo program");
	}

	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		float balance = (Float) DataStore.atm2Datastore.get(DataStore.BALANCE);
		float deposit = (Float) DataStore.atm2Datastore.get(DataStore.DEPOSIT);
		DataStore.atm2Datastore.put(DataStore.BALANCE, balance + deposit);
	}

	@Override
	public void MakeWithDraw() {
		// TODO Auto-generated method stub
		float balance = (Float) DataStore.atm2Datastore.get(DataStore.BALANCE);
		float withDraw = (Float) DataStore.atm2Datastore
				.get(DataStore.WITHDRAWN);
		int mini = (Integer) DataStore.atm2Datastore.get(DataStore.MINI);

		if (balance - withDraw < mini) {
			int penalty = (Integer) DataStore.atm2Datastore
					.get(DataStore.PENALTY);
			balance = balance - withDraw - penalty;
		} else {
			balance = balance - withDraw;
		}
		DataStore.atm2Datastore.put(DataStore.BALANCE, balance);
	}

	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int penalty = (Integer) DataStore.atm2Datastore.get(DataStore.PENALTY);
		System.out.println("Penalty is :" + penalty);
	}

	@Override
	public void eject_card() {
		// TODO Auto-generated method stub
		System.out.println("Your transaction is end.");
	}

	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		float balance = (Float) DataStore.atm2Datastore.get(DataStore.BALANCE);
		System.out.println("Your balance is " + balance);
	}
}
