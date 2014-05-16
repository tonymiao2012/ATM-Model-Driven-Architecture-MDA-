package CS586.mda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CS586.mda.entity.ATM2;

public class ATM2Driver {
	ATM2 atm2;

	public ATM2Driver(ATM2 atm2) {
		this.atm2 = atm2;
	}

	public void reqInput() {
		String temp = "1";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (temp != null) {
				if (Integer.parseInt(temp) == 9) {
					break;
				}
				int decisionId = 0;

				try {
					decisionId = Integer.parseInt(temp);
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println("Please input operation number.");
					decisionId = 0;
				}
				inputCheck(decisionId);
				temp = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Bye !");
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

	public void inputCheck(int x) {
		switch (x) {
		case 1:
			atm2.create();
			String temp = reqAnotherInput();
			Object[] o = reqBalanceAndPin(temp);
			float bal = Float.parseFloat(o[0].toString());
			atm2.CARD(bal, Integer.parseInt(o[1].toString()));
			System.out.println("Card information is initiallized.");
			break;
		case 2:
			System.out.println("Please input pin: ");
			String tpin = reqAnotherInput();
			atm2.PIN(Integer.parseInt(tpin));
			break;
		case 3:
			System.out.println("Input deposit money : ");
			String dep = reqAnotherInput();
			float depm = Float.parseFloat(dep);
			atm2.DEPOSIT(depm);
			System.out.println("Finish deposit");
			break;
		case 4:
			System.out.println("Input withdraw money : ");
			String withdraw = reqAnotherInput();
			float with = Float.parseFloat(withdraw);
			atm2.WITHDRAW(with);
			System.out.println("Finish withdraw. Take your money please.");
			break;
		case 5:
			atm2.BALANCE();
			break;
		case 0:
			atm2.MENU();
			break;
		default:
			break;
		}
		System.out
				.println("Press 0 return to menu. ");

	}

	public String reqAnotherInput() {
		
		String s = new String();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	public Object[] reqBalanceAndPin(String temp) {
		Object[] o = new Object[2];
		o[0] = 1;
		o[1] = "x";

		if (temp != null && temp.split(",") != null) {
			String s1 = temp.split(",")[0];
			String s2 = temp.split(",")[1];
			o[0] = Float.parseFloat(s1);
			o[1] = s2;
		}
		return o;
	}

}
