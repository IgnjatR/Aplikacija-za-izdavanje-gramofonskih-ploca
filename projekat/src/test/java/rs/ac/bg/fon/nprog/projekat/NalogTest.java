package rs.ac.bg.fon.nprog.projekat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import rs.ac.bg.fon.nprog.projekat.domen.Nalog;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;

public class NalogTest {
	private Nalog n;
	
	@Before
	public void setUp() throws Exception {
		n=new Nalog();
	}

	@After
	public void tearDown() throws Exception {
		n=null;
	}

	@Test
	public void testSetUsername() {
		n.setUsername("username");
		assertEquals("username", n.getUsername());
	}

	@Test
	public void testSetSifraNaloga() {
		n.setSifraNaloga(1);
		assertEquals(1, n.getSifraNaloga());
	}

	@Test(expected = RuntimeException.class)

	public void testSetSifraNalogaFalse() {
		n.setSifraNaloga(-11);
	}

	@Test
	public void testSetPassword() {
		n.setPassword("password");
		assertEquals("password", n.getPassword());
	}

	@Test
	public void testSetZaposleni() {
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		assertTrue(z.equals(n.getZaposleni()));
	}

	@Test
	public void testEqualsObjectTrue() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		Nalog n2 = new Nalog();
		Zaposleni z2 = new Zaposleni();
		z2.setIdZaposlenog(1);
		z2.setJmbg("12121212");
		n2.setZaposleni(z2);
		n2.setUsername("username");
		n2.setSifraNaloga(1);
		n2.setPassword("password");

		assertTrue(n.equals(n2));

	}

	@Test
	public void testEqualsObjectTrue2() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		Nalog n2 = new Nalog();

		n2.setUsername("username2");
		n2.setSifraNaloga(1);
		n2.setPassword("password");
		Zaposleni z2 = new Zaposleni();
		z2.setIdZaposlenog(1);
		z2.setJmbg("12121212");
		n2.setZaposleni(z2);

		assertTrue(n.equals(n2));

	}

	@Test
	public void testEqualsObjectTrue3() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		Nalog n2 = new Nalog();

		n2.setUsername("username");
		n2.setSifraNaloga(1);
		n2.setPassword("password2");
		Zaposleni z2 = new Zaposleni();
		z2.setIdZaposlenog(1);
		z2.setJmbg("12121212");
		n2.setZaposleni(z2);

		assertTrue(n.equals(n2));

	}

	@Test
	public void testEqualsObjectTrue4() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		Nalog n2 = new Nalog();

		n2.setUsername("username");
		n2.setSifraNaloga(1);
		n2.setPassword("password");
		Zaposleni z2 = new Zaposleni();
		z2.setIdZaposlenog(11);
		z2.setJmbg("12121212111111");
		n2.setZaposleni(z2);

		assertTrue(n.equals(n2));

	}

	@Test
	public void testEqualsObjectFalse() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);

		Nalog n2 = new Nalog();

		n2.setUsername("username");
		n2.setSifraNaloga(12);
		n2.setPassword("password");
		Zaposleni z2 = new Zaposleni();
		z2.setIdZaposlenog(1);
		z2.setJmbg("12121212");
		n2.setZaposleni(z2);

		assertFalse(n.equals(n2));

	}

	@Test
	public void testToString() {
		n.setUsername("username");
		n.setSifraNaloga(1);
		n.setPassword("password");
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		n.setZaposleni(z);
		
		
		assertEquals("Nalog{username=username}",n.toString());
	}

}
