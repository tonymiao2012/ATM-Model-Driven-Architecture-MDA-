package CS586.mda.entity;

import CS586.mda.dataStore.DataStore;
import CS586.mda.metaModel.MDA_Model;

public class ATM1 extends ATM {

	public int minimum = 1000;
	public int penalty = 10;
	public int attempt = 2;

	MDA_Model m = new MDA_Model(1);

	int tempBalance;
	String tempPin;

	public void create() {
		m.create();
	}

	public void card(int x, String y) {

		tempBalance = x;
		tempPin = y;

		DataStore.atm1Datastore.put(DataStore.BALANCE, x);
		DataStore.atm1Datastore.put(DataStore.PIN, tempPin);
		DataStore.atm1Datastore.put(DataStore.MINI, minimum);
		DataStore.atm1Datastore.put(DataStore.PENALTY, penalty);
		m.card();
	}

	public void deposit(int d) {
		// store d in temporary data store;
		// m->deposit();

		DataStore.atm1Datastore.put(DataStore.DEPOSIT, d);
		if (tempBalance + d < minimum) {
			m.depositBelowMinBalance();
		} else {
			m.depositAboveMinBalance();
		}
	}

	public void withdraw(int w) {
		// store w in temporary data store;
		DataStore.atm1Datastore.put(DataStore.WITHDRAWN, w);
		if ((tempBalance - w) < 0) {
			System.out.println("Not enough balance !");
			return;
		}
		if (tempBalance - w < minimum)
			m.withdrawBelowMinBalance();
		else
			m.withdrawAboveMinBalance();
	}

	public void pin(String x) {
		// System.out.println("Please input pin: ");
		if (tempPin.equals(x)) {
			attempt = 3;
			if (tempBalance < 1000)
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
			System.out
					.println("Correct PIN. You can deposit/withdraw now.");
		} else {
			m.incorrectPin(attempt--);

		}
	}

	public void exit() {
		m.exit();
	}

	public void balance() {
		m.balance();
	}

	public void show_menu() {
		m.menu();
	}

	public void lock(String x) {
		if (tempPin.equals(x))
			m.lock();
		else
			System.out.println("Error Pin !");
	}

	public void unlock(String x) {
		if (tempPin.equals(x)) {
			attempt = 3;
			m.unlock();
			if (tempBalance < 1000)
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
		} else {
			m.incorrectPin(attempt--);
		}

	}
}
