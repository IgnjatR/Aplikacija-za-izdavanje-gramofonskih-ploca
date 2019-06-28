package rs.ac.bg.fon.nprog.projekat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;

public class ZaposleniTest {

	private Zaposleni z;

	@Before
	public void setUp() throws Exception {
		z = new Zaposleni();
	}

	@After
	public void tearDown() throws Exception {
		z = null;
	}

	@Test
	public void testSetIdZaposlenog() {
		z.setIdZaposlenog(1);
		assertEquals(1, z.getIdZaposlenog());

	}

	@Test(expected = RuntimeException.class)

	public void testSetIdZaposlenogFalse() {
		z.setIdZaposlenog(-1);

	}

	@Test
	public void testSetJmbg() {
		z.setJmbg("1458758965");
		assertEquals("1458758965", z.getJmbg());

	}

	@Test
	public void testSetImeZaposlenog() {
		z.setImeZaposlenog("Ignjat");
		assertEquals("Ignjat", z.getImeZaposlenog());
	}

	@Test
	public void testSetPrezimeZaposlenog() {
		z.setPrezimeZaposlenog("Rajak");
		assertEquals("Rajak", z.getPrezimeZaposlenog());
	}

	@Test
	public void testSetEmailZ() {

		z.setEmailZ("mail@mail.com");
		assertEquals("mail@mail.com", z.getEmailZ());
	}

	@Test
	public void testEqualsObjectTrue() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(1);
		z2.setJmbg("1458758965");
		z2.setImeZaposlenog("Ignjat");
		z2.setPrezimeZaposlenog("Rajak");
		z2.setEmailZ("mail@mail.com");

		assertTrue(z.equals(z2));

	}

	@Test
	public void testEqualsObjectTrue2() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(1);
		z2.setJmbg("1458758965");
		z2.setImeZaposlenog("Ignjatt");
		z2.setPrezimeZaposlenog("Rajak");
		z2.setEmailZ("mail@mail.com");

		assertTrue(z.equals(z2));

	}

	@Test
	public void testEqualsObjectTrue3() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(1);
		z2.setJmbg("1458758965");
		z2.setImeZaposlenog("Ignjat");
		z2.setPrezimeZaposlenog("Rajakk");
		z2.setEmailZ("mail@mail.com");

		assertTrue(z.equals(z2));

	}

	@Test
	public void testEqualsObjectTrue4() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(1);
		z2.setJmbg("1458758965");
		z2.setImeZaposlenog("Ignjat");
		z2.setPrezimeZaposlenog("Rajak");
		z2.setEmailZ("mail2@mail.com");

		assertTrue(z.equals(z2));

	}

	@Test
	public void testEqualsObjectFalse() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(11);
		z2.setJmbg("1458758965");
		z2.setImeZaposlenog("Ignjat");
		z2.setPrezimeZaposlenog("Rajak");
		z2.setEmailZ("mail2@mail.com");

		assertFalse(z.equals(z2));

	}

	@Test
	public void testEqualsObjectFalse2() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");

		Zaposleni z2 = new Zaposleni();

		z2.setIdZaposlenog(1);
		z2.setJmbg("14587589655");
		z2.setImeZaposlenog("Ignjat");
		z2.setPrezimeZaposlenog("Rajak");
		z2.setEmailZ("mail2@mail.com");

		assertFalse(z.equals(z2));

	}

	@Test
	public void testToString() {
		z.setIdZaposlenog(1);
		z.setJmbg("1458758965");
		z.setImeZaposlenog("Ignjat");
		z.setPrezimeZaposlenog("Rajak");
		z.setEmailZ("mail@mail.com");
		assertEquals("Ignjat Rajak", z.toString());
	}

}
