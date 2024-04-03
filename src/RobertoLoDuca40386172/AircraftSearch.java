/**
 * 
 */
package RobertoLoDuca40386172;

import java.util.ArrayList;

/**
 * class to support the Aircraft system for searching based on specific values
 * @author Roberto Lo Duca 40386172
 *
 */
public class AircraftSearch {

	/**
	 * Will search a given arraylist of PassengerPlane objects for an exact wingspan within a specified lower and upper range 
	 * @param planes - arraylist of planes
	 * @param wingspanMin - the wingspan lower limit
	 * @param wingspanMax - the wingspan upper limit
	 * @return the search return
	 */
	public static ArrayList<PassengerPlane> searchByWingSpan(ArrayList<PassengerPlane> planes, int wingspanMin, int wingspanMax) {
		ArrayList<PassengerPlane> results = new ArrayList<>();
		if (!planes.isEmpty()) {
			for (PassengerPlane plane : planes) {
				if (plane.getWingspan() >= wingspanMin && plane.getWingspan() <= wingspanMax) {
					results.add(plane);
				}
			}
		} else {
			System.err.println("the array is empty");
		}
		return results;
	}
	
	/**
	 * Will search a given arraylist of PassengerPlane objects for an exact given Country Code
	 * @param planes - arraylist of planes
	 * @param countryCode - the countryCode to search
	 * @return the search return
	 */
	public static ArrayList<PassengerPlane> searchByCountry(ArrayList<PassengerPlane> planes, CountryCode countryCode) {
		ArrayList<PassengerPlane> results = new ArrayList<>();
		if (!planes.isEmpty()) {
			for (PassengerPlane plane : planes) {
				if (plane.getCountryCode() == countryCode) {
					results.add(plane);
				}
			}
		} else {
			System.err.println("the array is empty");
		}
		return results;
	}
}
