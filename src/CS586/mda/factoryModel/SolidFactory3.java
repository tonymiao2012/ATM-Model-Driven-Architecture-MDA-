package CS586.mda.factoryModel;

import CS586.mda.operations.implement.ATM3ActionsLocker;
import CS586.mda.operations.implement.ATM3ActionsTrans;

public class SolidFactory3 extends AbstractFactory {

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		super.atmlock = new ATM3ActionsLocker();
		super.atmtran = new ATM3ActionsTrans();
	}
}
