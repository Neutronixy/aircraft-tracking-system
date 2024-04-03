/**
 * 
 */
package RobertoLoDuca40386172;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Roberto Lo Duca 40386172
 *
 */
class AircraftSearchTest {
	
	// Test data
	PassengerPlane p1, p2, p3, p4, p5;
	ArrayList<PassengerPlane> planes;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		p1 = new PassengerPlane("Plane A", 34, Power.FIXED, CountryCode.FR);
		p2 = new PassengerPlane("Plane B", 34, Power.FIXED, CountryCode.UK);
		p3 = new PassengerPlane("Plane C", 44, Power.FIXED, CountryCode.UK);
		p4 = new PassengerPlane("Plane D", 31, Power.FIXED, CountryCode.FR);
		p5 = new PassengerPlane("Plane E", 31, Power.FIXED, CountryCode.FR);
		
		planes = new ArrayList<>();
		
		planes.add(p1);
		planes.add(p2);
		planes.add(p3);
		planes.add(p4);
		planes.add(p5);
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.AircraftSearchTest#searchByWingSpan(java.util.ArrayList, int, int)}.
	 */
	@Test
	void testSearchByWingSpan() {
		ArrayList<PassengerPlane> results = AircraftSearch.searchByWingSpan(planes, 33, 45);
		assertEquals(results.size(), 3);
		assertTrue(results.contains(p1) && results.contains(p2) && results.contains(p3));
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.AircraftSearchTest#searchByCountry(java.util.ArrayList, RobertoLoDuca40386172.CountryCode)}.
	 */
	@Test
	void testSearchByCountry() {
		ArrayList<PassengerPlane> results = AircraftSearch.searchByCountry(planes, CountryCode.FR);
		assertEquals(results.size(), 3);
		assertTrue(results.contains(p1) && results.contains(p4) && results.contains(p5));
	}

}
