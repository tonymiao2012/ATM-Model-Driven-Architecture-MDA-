package CS586.mda.state.solidState;

import CS586.mda.state.State;

public class Locked extends State {

	public Locked(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectPinMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPinAboveMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPinBelowMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deopositAboveMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositBelowMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDrawBelowMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDrawAboveMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		operation.show_unlock_message();
		vm.changeVMState(2);
	}

	@Override
	public void tooManyAttmenpMessage() {
		// TODO Auto-generated method stub
		
	}
	
}
