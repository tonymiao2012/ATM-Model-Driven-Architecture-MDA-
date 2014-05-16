package CS586.mda.dataStore;

import java.util.HashMap;
import java.util.Map;

public class DataStore {
	
	
	public static final String BALANCE = "balance";
	public static final String PIN = "pin";
	public static final String DEPOSIT = "deposit";
	public static final String WITHDRAWN = "withdrawn";
	public static final String PENALTY = "penalty";
	public static final String MINI = "mini";
	
	
	/**
	 *   balance, pin for ATM1
	 *   balance : integer
	 *   pin : String
	 */
	public final static Map<String,Object> atm1Datastore = new HashMap<String,Object>();
	

	/**
	 *   balance, pin for ATM2
	 */
	public final static Map<String,Object> atm2Datastore = new HashMap<String,Object>();
	

	/**
	 *   balance, pin for ATM3
	 */
	public final static Map<String,Integer> atm3Datastore = new HashMap<String,Integer>();
}
