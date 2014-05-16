package CS586.mda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CS586.mda.entity.ATM3;

public class ATM3Driver {
	ATM3 atm3;

	// constructor.
	public ATM3Driver(ATM3 atm3) {
		this.atm3 = atm3;
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
			atm3.create();
			String temp = openAnotherInput();
			Object[] o = reqBalanceAndPin(temp);
			int bal = Integer.parseInt(o[0].toString());
			int pin = Integer.parseInt(o[1].toString());
			atm3.card(bal, pin);
			System.out.println("Card information is initiallized.");
			break;
		case 2:
			System.out.println("Please input pin: ");
			String tpin = openAnotherInput();
			int ipin = Integer.parseInt(tpin);
			atm3.pin(ipin);
			break;
		case 3:
			System.out.println("Please input deposit money : ");
			String dep = openAnotherInput();
			int depm = Integer.parseInt(dep);
			atm3.deposit(depm);
			System.out.println("Finish deposit.");
			break;
		case 4:
			System.out.println("Please input withdraw money : ");
			String withdraw = openAnotherInput();
			int draw = Integer.parseInt(withdraw);
			atm3.withdraw(draw);
			System.out.println("Finish withdraw. Take your money please.");
			break;
		case 5:
			atm3.balance();
			break;
		case 7:
			System.out.println("Please input " + "yes"
					+ " if you want to lock : ");
			String lock = openAnotherInput();
			if (lock.equals("yes")) {
				atm3.lock();
			}
			break;
		case 8:
			System.out.println("Please input " + "yes"
					+ " if you want to unlock :");
			String unlock = openAnotherInput();
			if (unlock.equals("yes")) {
				atm3.unlock();
			}
			break;
		case 0:
			atm3.show_menu();
			break;
		default:
			break;
		}
		System.out.println("Press 0 return to menu.");

	}

	public Object[] reqBalanceAndPin(String temp) {
		Object[] o = new Object[2];
		o[0] = 1;
		o[1] = 1;

		if (temp != null && temp.split(",") != null
				&& temp.split(",").length > 1) {
			String s1 = temp.split(",")[0];
			String s2 = temp.split(",")[1];
			o[0] = Integer.parseInt(s1);
			o[1] = Integer.parseInt(s2);
		}
		return o;
	}

	public void reqInput() {
		String temp = "1";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (temp != null) {
				if (Integer.parseInt(temp) == 9) {
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
