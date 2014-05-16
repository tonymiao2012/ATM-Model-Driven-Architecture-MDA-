package CS586.mda.state.solidState;

import CS586.mda.state.State;

public class CheckPin extends State {

	public CheckPin(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		vm.changeVMState(1);
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		vm.changeVMState(2);
		operation.prompt_pin();
	}

	
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		operation.display_menu();
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		operation.show_over_message();
		// go back to idle
		vm.changeVMState(1);
	}

	@Override
	public void showBalance() {
		// TODO Auto-generated method stub
		operation.DisplayBalance();
	}


	@Override
	public void lock() {
		// TODO Auto-generated method stub
		// need to go to ready state first 
	}

	@Override
	public void incorrectPinMessage() {
		// TODO Auto-generated method stub
		operation.show_incorrect_message();
	}

	@Override
	public void correctPinAboveMin() {
		// TODO Auto-generated method stub
		// go to ready
		vm.changeVMState(3);
	}

	@Override
	public void correctPinBelowMin() {
		// TODO Auto-generated method stub
		//operation.clearConsole();
		operation.show_correct_pin_message();
		vm.changeVMState(4);
	}

	@Override
	public void deopositAboveMin() {
		// TODO Auto-generated method stub
		vm.changeVMState(3);
	}

	@Override
	public void depositBelowMin() {
		// TODO Auto-generated method stub
		vm.changeVMState(4);
	}

	@Override
	public void withDrawBelowMin() {
		// TODO Auto-generated method stub
		vm.changeVMState(4);
	}

	@Override
	public void withDrawAboveMin() {
		// TODO Auto-generated method stub
		vm.changeVMState(3);
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tooManyAttmenpMessage() {
		// TODO Auto-generated method stub
		operation.too_many_attempt_PIN_message();
	}
}