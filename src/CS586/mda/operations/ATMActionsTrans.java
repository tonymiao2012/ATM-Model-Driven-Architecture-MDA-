package CS586.mda.operations;

public abstract class ATMActionsTrans {
	public abstract void store_pin();

	public abstract void store_balance();

	public void correct_pin_message() {
		System.out.println("Correct Pin !");
	}

	public void promt_for_PIN() {
		//System.out.println("Please input your PIN !");
	}

	public void Overdraw() {
		System.out.println("Can not withdraw, you don't have enough money !");
	}

	public void incorrect_pin_message() {
		System.out.println("Not correct PIN !");
	}

	public void too_many_attempts_message() {
		System.out.println("You attempt over the limit!");
	}

	public void display_lock_message() {
		System.out.println("You card in ATM is locked !");
	}

	public void display_unlock_message() {
		System.out.println("You card in ATM is unlocked !");
	}

	public abstract void display_menu();

	public abstract void MakeDeposit();

	public abstract void MakeWithDraw();

	public abstract void Penalty();

	public abstract void eject_card();

	public abstract void DisplayBalance();
}
