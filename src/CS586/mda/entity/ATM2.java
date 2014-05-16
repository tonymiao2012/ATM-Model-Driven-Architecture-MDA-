package CS586.mda.entity;

import CS586.mda.dataStore.DataStore;
import CS586.mda.metaModel.MDA_Model;

public class ATM2 extends ATM {

	MDA_Model m = new MDA_Model(2);

	public int minimum = 500;
	public int penalty = 20;
	public int attempts2 = 1;

	public float balance;
	public int pin;

	public void create() {
		m.create();
	}

	public void CARD(float x, int y) {

		DataStore.atm2Datastore.put(DataStore.BALANCE, x);
		DataStore.atm2Datastore.put(DataStore.PIN, y);
		DataStore.atm2Datastore.put(DataStore.MINI, minimum);
		DataStore.atm2Datastore.put(DataStore.PENALTY, penalty);
		balance = x;
		pin = y;
		m.card();
	}

	public void DEPOSIT(float d) {
		// store d in temporary data store;
		DataStore.atm2Datastore.put(DataStore.DEPOSIT, d);
		if (balance + d < minimum)
			m.depositBelowMinBalance();
		else
			m.depositAboveMinBalance();
	}

	public void WITHDRAW(float w) {
		// store w in temporary data store;
		//if ((balance-w) > 0)
		//m.w;
		DataStore.atm2Datastore.put(DataStore.WITHDRAWN, w);
		if (balance - w < 0) {
			System.out.println("Not enough balance !");
			return;
		}
		if(balance < minimum){
			m.withdrawBelowMinBalance();
		}
		if (balance - w < minimum)
			m.withdrawBelowMinBalance();
		else
			m.withdrawAboveMinBalance();
	}

	public void PIN(int x) {
		if (pin == x) {
			// System.out.println("Correct PIN.");
			if (balance < minimum)
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
			System.out.println("Correct PIN. You can deposit/withdraw now.");
		} else {
			// ATM2's attemps are 2.
			m.incorrectPin(attempts2--);
		}
	}

	public void MENU() {
		m.menu();
	}

	public void BALANCE() {
		m.balance();
	}

	public void EXIT() {
		m.exit();
	}

}
