/**
 * 
 */
package RobertoLoDuca40386172;

/**
 * This class generate Aircraft objects for the Passenger Plane Aircraft
 * @author Roberto Lo Duca 40386172
 *
 */
public class PassengerPlane extends Aircraft {
	
	/**
	 * Allowable codes UK, FR and US only
	 */
	private CountryCode countryCode;

	/**
	 * Default constructor
	 */
	public PassengerPlane() {
	}

	/**
	 * Constructor with args
	 * @param type - min length {@value #MIN_TYPE_TEXT} and max {@value #MAX_TYPE_TEXT}
	 * @param wingspan - ange {@value #MIN_WINGSPAN} and {@value #MAX_WINGSPAN}
	 * @param power - Allowable values Fixed, Prop, Rotor
	 * @param countryCode - Two-letter code representing where the Passenger Plane is registered
	 * @throws IllegalArgumentException
	 */
	public PassengerPlane(String type, int wingspan, Power power, CountryCode countryCode) throws IllegalArgumentException {
		super(type, wingspan, power);
		this.countryCode = countryCode;
	}

	/**
	 * @return the countryCode
	 */
	public CountryCode getCountryCode() {
		return countryCode;
	}

	/**
	 * Two-letter code representing where the Passenger Plane is registered
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}
	
	/**
	 * output to screen (console) all data for each Aircraft instance
	 */
	public void showAll() {
		System.out.println(
				"TYPE     : " + type + "\n" +
				"WINGSPAN : " + wingspan + "\n" +
				"POWER    : " + power + "\n" +
				"COUNTRY  : " + countryCode + "\n"
				);
	}
	
	/**
	 * It is a requirement of all Aircraft
	 * generates and returns a string: PP-CODE-POWER-WINGSPAN-TYPE
	 */
	@Override
	public void ping() {
		System.out.printf("PP-%s-%s-%s-%s\n", countryCode, power, wingspan, type);
	}
}
