package CS586.mda.state.solidState;

import CS586.mda.state.State;

public class Idle extends State {

	public Idle(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
		operation.display_menu();
		System.out.println("Please input card information.");
		vm.changeVMState(2);
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		operation.prompt_pin();
		vm.changeVMState(2);
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
	public void incorrectPinMessage() {
		// TODO Auto-generated method stub
		//operation.show_incorrect_message();
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPinAboveMin() {
		// TODO Auto-generated method stub
		//vm.changeVMState(3);
	}

	@Override
	public void correctPinBelowMin() {
		// TODO Auto-generated method stub
		//vm.changeVMState(4);
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
		
	}

	@Override
	public void tooManyAttmenpMessage() {
		// TODO Auto-generated method stub
		
	}
	
}