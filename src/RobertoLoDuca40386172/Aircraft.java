/**
 * 
 */
package RobertoLoDuca40386172;

/**
 * Aircraft abstract class to create different aircraft object
 * they have characteristics in common to share
 * @author 40386172 Roberto Lo Duca
 *
 */
public abstract class Aircraft {
	
	/**
	 * Limits for the Type
	 */
	public static final int MIN_TYPE_TEXT = 3, MAX_TYPE_TEXT = 15;
	
	/**
	 * Limits for the Wingspan
	 */
	public static final int MIN_WINGSPAN = 25, MAX_WINGSPAN = 50;
	
	/**
	 * min length 3 and max 15
	 */
	protected String type;
	
	/**
	 * range 25 and 50
	 */
	protected int wingspan;
	
	/**
	 * Allowable values Fixed, Prop, Rotor
	 */
	protected Power power;
	
	/**
	 * Default constructor
	 */
	public Aircraft() {
	}
	
	/**
	 * Constructor with args
	 * @param type - min length {@value #MIN_TYPE_TEXT} and max {@value #MAX_TYPE_TEXT}
	 * @param wingspan - ange {@value #MIN_WINGSPAN} and {@value #MAX_WINGSPAN}
	 * @param power - Allowable values Fixed, Prop, Rotor
	 * @throws IllegalArgumentException
	 */
	public Aircraft(String type, int wingspan, Power power) throws IllegalArgumentException {
		this.setType(type);
		this.setWingspan(wingspan);
		this.power = power;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of the Aircraft
	 * min length {@value #MIN_TYPE_TEXT} and max {@value #MAX_TYPE_TEXT}
	 * @param type the type to set
	 */
	public void setType(String type) throws IllegalArgumentException {
		if (type.length() >= MIN_TYPE_TEXT && type.length() <=  MAX_TYPE_TEXT) {
			this.type = type;
		} else {
			throw new IllegalArgumentException("Wrong value for type, choose a whole number between " + MIN_TYPE_TEXT + " and " + MAX_TYPE_TEXT + "\n");
		}
	}

	/**
	 * @return the wingspan
	 */
	public int getWingspan() {
		return wingspan;
	}

	/**
	 * The wingspan of the aircraft
	 * range {@value #MIN_WINGSPAN} and {@value #MAX_WINGSPAN}
	 * @param wingspan the wingspan to set
	 */
	public void setWingspan(int wingspan) throws IllegalArgumentException {
		if (wingspan >= MIN_WINGSPAN && wingspan <=  MAX_WINGSPAN) {
			this.wingspan = wingspan;
		} else {
			throw new IllegalArgumentException("Wrong value for type, choose a whole number between " + MIN_WINGSPAN + " and " + MAX_WINGSPAN + "\n"
					+ "error for the airplane type " + type + "\n");
		}
	}

	/**
	 * @return the power
	 */
	public Power getPower() {
		return power;
	}

	/**
	 * Power category
	 * Allowable values Fixed, Prop, Rotor
	 * @param power the power to set
	 */
	public void setPower(Power power) {
		this.power = power;
	}
	
	/**
	 * It is a requirement of all Aircraft
	 * generates and returns a string: PP-CODE-POWER-WINGSPAN-TYPE
	 */
	public abstract void ping();

}
