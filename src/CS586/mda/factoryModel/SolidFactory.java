package CS586.mda.factoryModel;

import CS586.mda.operations.implement.ATM1ActionsLocker;
import CS586.mda.operations.implement.ATM1ActionsTrans;


public class SolidFactory extends AbstractFactory {

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		super.atmtran = new ATM1ActionsTrans();
		super.atmlock = new ATM1ActionsLocker();

	}
}
