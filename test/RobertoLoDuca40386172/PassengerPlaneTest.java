/**
 * 
 */
package RobertoLoDuca40386172;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Roberto Lo Duca 40386172
 *
 */
class PassengerPlaneTest {
	
	// set vars	
	/**
	 * min length 3 and max 15
	 */
	String typeLowInvalid, typeLowValid, typeMidValid, typeMaxValid, typeMaxInvalid;
	
	/**
	 * range 25 and 50
	 */
	int wingspanLowInvalid, wingspanLowValid, wingspanMidValid, wingspanMaxValid, wingspanMaxInvalid;
	PassengerPlane plane;
	IllegalArgumentException illegalArgumentException1, illegalArgumentException2;
		
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		plane = new PassengerPlane();
		
		typeLowInvalid = "N".repeat(2);
		typeLowValid = "V".repeat(3);
		typeMidValid = "V".repeat(9);
		typeMaxValid = "V".repeat(15);
		typeMaxInvalid = "V".repeat(16);
		
		wingspanLowInvalid = 24;
		wingspanLowValid = 25;
		wingspanMidValid = 37;
		wingspanMaxValid = 50;
		wingspanMaxInvalid = 51;
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.PassengerPlane#PassengerPlane()}.
	 */
	@Test
	void testPassengerPlaneDefaultConstructor() {
		PassengerPlane plane = new PassengerPlane();
		assertNotNull(plane);
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.PassengerPlane#PassengerPlane(java.lang.String, int, RobertoLoDuca40386172.Power, RobertoLoDuca40386172.CountryCode)}.
	 */
	@Test
	void testPassengerPlaneConstructorWithArgsValid() {
		plane = new PassengerPlane(typeMidValid, wingspanMidValid, Power.PROP, CountryCode.UK);
		assertEquals(typeMidValid, plane.getType());
		assertEquals(wingspanMidValid, plane.getWingspan());
		assertEquals(Power.PROP, plane.getPower());
		assertEquals(CountryCode.UK, plane.getCountryCode());
	}
	
	/**
	 * Test method for {@link RobertoLoDuca40386172.PassengerPlane#PassengerPlane(java.lang.String, int, RobertoLoDuca40386172.Power, RobertoLoDuca40386172.CountryCode)}.
	 */
	@Test
	void testPassengerPlaneConstructorWithArgsInvalid() {
		illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
			plane = new PassengerPlane(typeLowInvalid, wingspanMidValid, Power.PROP, CountryCode.UK);
		});
		
		illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
			plane = new PassengerPlane(typeMidValid, wingspanLowInvalid, Power.PROP, CountryCode.UK);
		});
		System.err.printf("%s\n%s\n", illegalArgumentException1, illegalArgumentException2);
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.PassengerPlane#setCountryCode(RobertoLoDuca40386172.CountryCode)}.
	 */
	@Test
	void testGetSetCountryCode() {
		plane.setCountryCode(CountryCode.UK);
		assertEquals(CountryCode.UK, plane.getCountryCode());
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.Aircraft#setType(java.lang.String)}.
	 */
	@Test
	void testGetSetTypeValid() {
		plane.setType(typeLowValid);
		assertEquals(typeLowValid, plane.getType());
		plane.setType(typeMidValid);
		assertEquals(typeMidValid, plane.getType());
		plane.setType(typeMaxValid);
		assertEquals(typeMaxValid, plane.getType());
	}
	
	/**
	 * Test method for {@link RobertoLoDuca40386172.Aircraft#setType(java.lang.String)}.
	 */
	@Test
	void testGetSetTypeInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			plane.setType(typeLowInvalid);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			plane.setType(typeMaxInvalid);
		});
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.Aircraft#setWingspan(int)}.
	 */
	@Test
	void testGetSetWingspanValid() {
		plane.setWingspan(wingspanLowValid);
		assertEquals(wingspanLowValid, plane.getWingspan());
		plane.setWingspan(wingspanMidValid);
		assertEquals(wingspanMidValid, plane.getWingspan());
		plane.setWingspan(wingspanMaxValid);
		assertEquals(wingspanMaxValid, plane.getWingspan());
	}
	
	/**
	 * Test method for {@link RobertoLoDuca40386172.Aircraft#setWingspan(int)}.
	 */
	@Test
	void testGetSetWingspanInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			plane.setWingspan(wingspanLowInvalid);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			plane.setWingspan(wingspanMaxInvalid);
		});
	}

	/**
	 * Test method for {@link RobertoLoDuca40386172.Aircraft#setPower(RobertoLoDuca40386172.Power)}.
	 */
	@Test
	void testGetSetPower() {
		plane.setPower(Power.PROP);
		assertEquals(Power.PROP, plane.getPower());
	}
}
