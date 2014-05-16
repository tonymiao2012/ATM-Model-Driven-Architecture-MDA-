package CS586.mda.metaModel;

public interface MDA_Event {
	void create();
	void card();
	void incorrectPin(int max); 
	void CorrectPinBelowMin(); 
	void CorrectPinAboveMin(); 
	void depositBelowMinBalance(); 
	void depositAboveMinBalance();
	void withdrawAboveMinBalance();
	void withdrawBelowMinBalance();
	void exit(); 
	void balance(); 
	void lock();
	void unlock();
	void menu();
}
