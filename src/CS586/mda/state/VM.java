package CS586.mda.state;

import java.util.ArrayList;
import java.util.List;

import CS586.mda.state.solidState.CheckPin;
import CS586.mda.state.solidState.Idle;
import CS586.mda.state.solidState.Locked;
import CS586.mda.state.solidState.OverDraw;
import CS586.mda.state.solidState.Ready;

public class VM {

	/**State Information:
	 * idle -> 1 checkPin -> 2 ready -> 3 overDraw -> 4 locked -> 5
	 */
	List<State> states = new ArrayList<State>();

	State currentState;

	int atmId;

	/**
	 * initialize the state to idle
	 */
	public VM(int atmId) {
		this.atmId = atmId;
		registerStates(new Idle(1));
		registerStates(new CheckPin(2));
		registerStates(new Ready(3));
		registerStates(new OverDraw(4));
		registerStates(new Locked(5));
		changeVMState(1);

	}

	public void registerStates(State s) {
		states.add(s);
		s.setVm(this);
	}

	/**
	 * change by VM id
	 * 
	 * @param id
	 */
	public void changeVMState(int id) {
		for (State s : states) {
			if (s.getId() == id) {
				currentState = s;
				break;
			}
		}
		currentState.setOperation(atmId);
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void create() {
		currentState.create();
	}

	public void card() {
		currentState.card();
	}

	/**
	 * incorrectPinMessage doesn't go anywhere, just stay the current state and
	 * show message.
	 */
	public void IncorectPin() {
		currentState.incorrectPinMessage();
	}

	public void correctPinBelowMin() {
		currentState.correctPinBelowMin();
	}

	public void correctPinAboveMin() {
		currentState.correctPinAboveMin();
	}

	public void exit() {
		currentState.exit();
	}

	public void balance() {
		currentState.showBalance();
	}

	public void depositBelowMinBalance() {
		currentState.depositBelowMin();
	}

	public void depostiAboveMinBalance() {
		currentState.deopositAboveMin();
	}

	public void lock() {
		currentState.lock();
	}

	public void unlock() {
		currentState.unlock();
	}

	public void withdrawAboveMinBalance() {
		currentState.withDrawAboveMin();
	}

	public void withdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		currentState.withDrawBelowMin();
	}

	public void tooManyAttempt() {
		currentState.tooManyAttmenpMessage();
		currentState.exit();
	}

	public void menu() {
		currentState.displayMenu();
	}
}