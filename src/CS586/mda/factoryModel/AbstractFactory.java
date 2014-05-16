package CS586.mda.factoryModel;

import CS586.mda.operations.ATMActionsLocker;
import CS586.mda.operations.ATMActionsTrans;

public abstract class AbstractFactory {

	public ATMActionsLocker atmlock;
	public ATMActionsTrans atmtran;
	
	public abstract void produce();
	
}
