package CS586.mda.factoryModel;

public class factorySetUp {
	public static AbstractFactory setUp(int atmId){
		
		AbstractFactory af = null;
		
		switch (atmId) {
		case 1:
			af = new SolidFactory();
			break;
		case 2:
			af = new SolidFactory2();
			break;
		case 3:
			af = new SolidFactory3();
		default:
			break;
		}
		
		return af;
	}
}
