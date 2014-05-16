package CS586.mda.metaModel;

import CS586.mda.state.VM;

public class MDA_Model implements MDA_Event{

	/**
	 * set the current ATM id
	 */
	int atmId;
	
	public MDA_Model(int id){
		atmId = id;
		vm = new VM(id);
	}
	
	VM vm;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		vm.create();
	}
	
	@Override
	public void card() {
		// TODO Auto-generated method stub
		vm.card();
	}

	@Override
	public void incorrectPin(int max) {
		// TODO Auto-generated method stub
		if(max > 0)
			vm.IncorectPin();
		else
			vm.tooManyAttempt();
	}

	@Override
	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		vm.correctPinBelowMin();
	}

	@Override
	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		vm.correctPinAboveMin();
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		vm.exit();
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		vm.balance();
	}


	@Override
	public void lock() {
		// TODO Auto-generated method stub
		vm.lock();
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		vm.unlock();
	}

	@Override
	public void depositBelowMinBalance() {
		// TODO Auto-generated method stub
		vm.depositBelowMinBalance();
	}

	@Override
	public void depositAboveMinBalance() {
		// TODO Auto-generated method stub
		vm.depostiAboveMinBalance();
	}

	@Override
	public void withdrawAboveMinBalance() {
		// TODO Auto-generated method stub
		vm.withdrawAboveMinBalance();
	}

	@Override
	public void withdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		vm.withdrawBelowMinBalance();
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		vm.menu();
	}
	
}