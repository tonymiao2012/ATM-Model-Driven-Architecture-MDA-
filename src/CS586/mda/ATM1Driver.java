package CS586.mda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CS586.mda.entity.ATM1;

public class ATM1Driver {

	ATM1 atm1;

	// constructor.
	public ATM1Driver(ATM1 atm1) {
		this.atm1 = atm1;
	}

	public String openAnotherInput() {

		String t = new String();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			t = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	public void inputCheck(int x) {
		switch (x) {
		case 1:
			atm1.create();
			String temp = openAnotherInput();
			Object[] o = reqBalanceAndPin(temp);
			int bal = Integer.parseInt(o[0].toString());
			atm1.card(bal, o[1].toString());
			System.out.println("Card information is initiallized.");
			break;
		case 2:
			System.out.println("Please input pin: ");
			String tpin = openAnotherInput();
			atm1.pin(tpin);
			break;
		case 3:
			System.out.println("Please input deposit money : ");
			String dep = openAnotherInput();
			int depm = Integer.parseInt(dep);
			atm1.deposit(depm);
			System.out.println("Finish deposit.");
			break;
		case 4:
			System.out.println("Please input withdraw money : ");
			String withdraw = openAnotherInput();
			int draw = Integer.parseInt(withdraw);
			atm1.withdraw(draw);
			System.out.println("Finish withdraw. Take your money please.");
			break;
		case 5:
			atm1.balance();
			break;
		case 7:
			System.out.println("Please input Pin if you want to lock : ");
			String lock = openAnotherInput();
			atm1.lock(lock);
			break;
		case 8:
			System.out.println("Please input Pin if you want to unlock :");
			String unlock = openAnotherInput();
			atm1.unlock(unlock);
			break;
		case 0:
			atm1.show_menu();
			break;
		default:
			break;
		}
		System.out.println("Press 0 return to menu.");

	}

	public Object[] reqBalanceAndPin(String temp) {
		Object[] o = new Object[2];
		o[0] = 1;
		o[1] = "x";

		if (temp != null && temp.split(",") != null
				&& temp.split(",").length > 1) {
			String s1 = temp.split(",")[0];
			String s2 = temp.split(",")[1];
			o[0] = Integer.parseInt(s1);
			o[1] = s2;
		}
		return o;
	}

	public void reqInput() {
		//default operation is 1. 
		String temp = "1";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (temp != null) {
				//if ("q".equals(temp)) {
				if(Integer.parseInt(temp) == 9){
					break;
				}
				int operationId = 0;

				try {
					operationId = Integer.parseInt(temp);
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println("Please input operation number!");
					operationId = 0;
				}
				inputCheck(operationId);
				temp = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Thank you !");
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
