package CS586.mda.factoryModel;

import CS586.mda.operations.implement.ATM2ActionsLocker;
import CS586.mda.operations.implement.ATM2ActionsTrans;

public class SolidFactory2 extends AbstractFactory {

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		super.atmtran = new ATM2ActionsTrans();
		super.atmlock = new ATM2ActionsLocker();
	}
}
