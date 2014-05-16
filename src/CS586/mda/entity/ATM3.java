package CS586.mda.entity;

import CS586.mda.dataStore.DataStore;
import CS586.mda.metaModel.MDA_Model;

public class ATM3 extends ATM {

	MDA_Model m = new MDA_Model(3);

	public int balance;
	public int pin;
	public int minimum = 500;
	public int penalty = 0;

	public void create() {
		m.create();
	}

	public void card(int x, int y) {
		// store x in temporary data store;
		// store y in temporary data store;
		balance = x;
		pin = y;
		DataStore.atm3Datastore.put(DataStore.BALANCE, x);
		DataStore.atm3Datastore.put(DataStore.PIN, y);
		DataStore.atm3Datastore.put(DataStore.MINI, minimum);
		DataStore.atm1Datastore.put(DataStore.PENALTY, penalty);

		m.card();
	}

	public void deposit(int d) {
		// store d in temporary data store;
		// m->deposit();

		DataStore.atm3Datastore.put(DataStore.DEPOSIT, d);

		if (balance + d < 100)
			m.depositBelowMinBalance();
		else
			m.depositAboveMinBalance();
	}

	public void withdraw(int w) {
		// store w in tempor
		// ary data store;
		// if ((b-w) > 0) m->withdraw();

		DataStore.atm3Datastore.put(DataStore.WITHDRAWN, w);

		if (balance - w < minimum)
			m.withdrawBelowMinBalance();
		else
			m.withdrawAboveMinBalance();
	}

	public void pin(int x) {
		if (pin == x) {
			if (balance < minimum)
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
		System.out.println("Correct PIN. You can deposit/withdraw now.");
		} else
			m.incorrectPin(0);
	}

	public void exit() {
		m.exit();
	}

	public void balance() {
		m.balance();
	}

	public void lock() {
		m.lock();
	}

	public void unlock() {
		m.unlock();
		if (balance < minimum)
			m.CorrectPinBelowMin();
		else
			m.CorrectPinAboveMin();
	}

	public void show_menu() {
		m.menu();
	}

}
