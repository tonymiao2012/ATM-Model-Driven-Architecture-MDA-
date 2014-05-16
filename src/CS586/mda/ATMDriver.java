package CS586.mda;

import java.util.Scanner;

import CS586.mda.entity.ATM1;
import CS586.mda.entity.ATM2;
import CS586.mda.entity.ATM3;

public class ATMDriver {
	
	/**
	 * Main entrance for running program.
	 * 
	 * @author zixiong miao
	 * 
	 */
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to use ATM.");
		System.out.println("Author: Zixiong Miao.");
		System.out.println("Please input ATM number you want to login: ");
		s = new Scanner(System.in);
		int in = s.nextInt();
		switch (in) {
		case 1:
			ATM1 a1 = new ATM1();
			ATM1Driver d1 = new ATM1Driver(a1);
			d1.reqInput();
			break;
		case 2:
			ATM2 a2 = new ATM2();
			ATM2Driver d2 = new ATM2Driver(a2);
			d2.reqInput();
			break;
		case 3:
			ATM3 a3 = new ATM3();
			ATM3Driver d3 = new ATM3Driver(a3);
			d3.reqInput();
			break;
		default:
			System.out.println("Please input number:1, 2 or 3. Try next time. Thanks");
			break;
		}

	}

}
