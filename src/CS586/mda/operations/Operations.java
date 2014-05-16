package CS586.mda.operations;

import CS586.mda.factoryModel.AbstractFactory;
import CS586.mda.factoryModel.factorySetUp;

public class Operations {

	ATMActionsTrans atmtran;
	ATMActionsLocker atmlock;
	
	AbstractFactory afactory;
	
	public AbstractFactory produceSolidActions(int atmId){
		this.afactory = factorySetUp.setUp(atmId);
		afactory.produce();
		return afactory;
	}
	
	public Operations(int atmId){
		if(afactory == null){
			atmtran = produceSolidActions(atmId).atmtran;
			atmlock = produceSolidActions(atmId).atmlock;
		}else{
			atmtran = afactory.atmtran;
			atmlock = afactory.atmlock;
		}
	}
	
	public void lock(){
		atmlock.lock();
	}
	
	public void unlock(){
		atmlock.unlock();
	}
	
	public void DisplayBalance(){
		atmtran.DisplayBalance();
	}
	
	public void show_correct_pin_message(){
		atmtran.correct_pin_message();
	}
	
	public void prompt_pin(){
		atmtran.promt_for_PIN();
	}
	
	public void display_menu(){
		atmtran.display_menu();
	}
	
	public void show_incorrect_message(){
		atmtran.incorrect_pin_message();
	}
	
	public void too_many_attempt_PIN_message(){
		atmtran.too_many_attempts_message();
	}
	
	public void show_over_message(){
		atmtran.eject_card();
	}
	
	public void show_over_draw(){
		atmtran.Overdraw();
	}
	
	public void deposit(){
		atmtran.MakeDeposit();
	}
	
	public void show_lock_message(){
		atmtran.display_lock_message();
	}
	
	public void show_unlock_message(){
		atmtran.display_unlock_message();
	}
	
	public void withDraw(){
		atmtran.MakeWithDraw();
	}

}
