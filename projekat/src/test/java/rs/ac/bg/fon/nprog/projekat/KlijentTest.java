package rs.ac.bg.fon.nprog.projekat;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class KlijentTest extends TestCase {

	private Klijent k;

	@Before
	public void setUp() throws Exception {
		k = new Klijent();
	}

	@After
	public void tearDown() throws Exception {
		k = null;
	}

	public void testSetEmail() {
		k.setEmail("ignjatrajak@gmail.com");
		assertEquals("ignjatrajak@gmail.com", k.getEmail());

	}

	public void testSetIdKlijenta() {
		k.setIdKlijenta(1);
		assertEquals(1, k.getIdKlijenta());
	}

	@Test(expected = RuntimeException.class)
	public void testSetIdKlijentaFalse() {
		k.setIdKlijenta(-11);
	}

	public void testSetIme() {
		k.setIme("Ignjat");
		assertEquals("Ignjat", k.getIme());
	}

	public void testSetPrezime() {
		k.setPrezime("Rajak");
		assertEquals("Rajak", k.getPrezime());
	}

	public void testSetAdresa() {
		k.setAdresa("Neka adresa");
		assertEquals("Neka adresa", k.getAdresa());
	}

	public void testSetTelefon() {
		k.setTelefon("0122365897");
		assertEquals("0122365897", k.getTelefon());
	}

	public void testEqualsObjectTrue() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365897");

		assertTrue(k.equals(k2));

	}

	public void testEqualsObjectFalse() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak1@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365897");

		assertTrue(k.equals(k2));

	}

	public void testEqualsObjectFalse2() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(11);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365897");

		assertFalse(k.equals(k2));

	}

	public void testEqualsObjectFalse3() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjatt");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365897");

		assertTrue(k.equals(k2));

	}

	public void testEqualsObjectFalse4() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajakk");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365897");

		assertTrue(k.equals(k2));

	}

	public void testEqualsObjectFalse5() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa druga");
		k2.setTelefon("0122365897");

		assertTrue(k.equals(k2));

	}

	public void testEqualsObjectFalse6() {

		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		Klijent k2 = new Klijent();

		k2.setEmail("ignjatrajak@gmail.com");
		k2.setIdKlijenta(1);
		k2.setIme("Ignjat");
		k2.setPrezime("Rajak");
		k2.setAdresa("Neka adresa");
		k2.setTelefon("0122365899");

		assertTrue(k.equals(k2));

	}

	public void testToString() {
		k.setEmail("ignjatrajak@gmail.com");
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		k.setAdresa("Neka adresa");
		k.setTelefon("0122365897");

		assertEquals("Ignjat Rajak", k.toString());
	}

}
