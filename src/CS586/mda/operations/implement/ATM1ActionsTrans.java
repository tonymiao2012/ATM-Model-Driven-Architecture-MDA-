package CS586.mda.operations.implement;

import CS586.mda.dataStore.DataStore;
import CS586.mda.operations.ATMActionsTrans;

public class ATM1ActionsTrans extends ATMActionsTrans{
	
	@Override
	public void store_pin() {
		// TODO Auto-generated method stub
		//Store pin from temp data store to pin in data store
	}

	@Override
	public void store_balance() {
		// TODO Auto-generated method stub
		//Store balance from temp data store to pin in data store.
	}
	
	@Override
	public void display_menu() {
		// TODO Auto-generated method stub
		System.out.println("ATM 1 :");
		System.out.println("MENU :");
		System.out.print("1. card(int, String) ");
		System.out.print("2. pin(String) ");
		System.out.print("3. deposit(int) ");
		System.out.print("4. withdraw(int) ");
		System.out.print("5. balance() ");
		System.out.print("6. exit() ");
		System.out.print("7. lock(String) ");
		System.out.print("8. unlock(String) ");
		System.out.println("9. Quit the demo program");
	}

	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		int balance = (Integer)DataStore.atm1Datastore.get(DataStore.BALANCE);
		int deposit = (Integer)DataStore.atm1Datastore.get(DataStore.DEPOSIT);
		DataStore.atm1Datastore.put(DataStore.BALANCE, balance + deposit);
	}

	@Override
	public void MakeWithDraw() {
		// TODO Auto-generated method stub
		
		int balance = (Integer)DataStore.atm1Datastore.get(DataStore.BALANCE);
		int withDraw = (Integer)DataStore.atm1Datastore.get(DataStore.WITHDRAWN);
		int mini = (Integer)DataStore.atm1Datastore.get(DataStore.MINI);
		
		if(balance - withDraw < mini){
			int penalty = (Integer)DataStore.atm1Datastore.get(DataStore.PENALTY);
			balance = balance - withDraw - penalty;
		}else{
			balance = balance - withDraw;
		}
		DataStore.atm1Datastore.put(DataStore.BALANCE, balance);
	}

	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int penalty = (Integer)DataStore.atm1Datastore.get(DataStore.PENALTY);
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
		int balance = (Integer)DataStore.atm1Datastore.get(DataStore.BALANCE);
		System.out.println("Your balance is " + balance);
	}
}
