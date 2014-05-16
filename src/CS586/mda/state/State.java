package CS586.mda.state;

import CS586.mda.operations.Operations;

public abstract class State {
	protected int id;

	protected Operations operation;
	protected VM vm;

	public State(int id) {
		this.id = id;
	}

	public VM getVm() {
		return vm;
	}

	public void setVm(VM vm) {
		this.vm = vm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Operations getOperation() {
		return operation;
	}

	public void setOperation(Operations operation) {
		this.operation = operation;
	}

	public void setOperation(int atmId) {
		this.operation = new Operations(atmId);
	}

	public abstract void create();

	public abstract void card();

	public abstract void correctPinAboveMin();

	public abstract void correctPinBelowMin();

	public abstract void deopositAboveMin();

	public abstract void depositBelowMin();

	public abstract void withDrawBelowMin();

	public abstract void withDrawAboveMin();

	public abstract void displayMenu();

	public abstract void lock();

	public abstract void unlock();

	public abstract void exit();

	public abstract void showBalance();

	public abstract void incorrectPinMessage();

	public abstract void tooManyAttmenpMessage();
}