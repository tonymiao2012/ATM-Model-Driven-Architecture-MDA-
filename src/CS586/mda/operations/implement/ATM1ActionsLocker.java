package CS586.mda.operations.implement;

import CS586.mda.operations.ATMActionsLocker;

public class ATM1ActionsLocker extends ATMActionsLocker{
	@Override
	public void lock() {
		// TODO Auto-generated method stub
		System.out.println("Card in ATM1 is locked !");
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		System.out.println("Card in ATM1 is unlocked !");
	}
}
