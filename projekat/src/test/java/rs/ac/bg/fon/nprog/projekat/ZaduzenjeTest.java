package rs.ac.bg.fon.nprog.projekat;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;

public class ZaduzenjeTest {

	private Zaduzenje z;

	@Before
	public void setUp() throws Exception {
		z = new Zaduzenje();
	}

	@After
	public void tearDown() throws Exception {
		z = null;
	}

	@Test
	public void testSetKlijent() {

		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		assertTrue(k.equals(z.getKlijent()));
	}

	@Test
	public void testSetSifraZaduzenja() {
		z.setSifraZaduzenja(1);
		assertEquals(1, z.getSifraZaduzenja());
	}

	@Test(expected = RuntimeException.class)
	public void testSetSifraZaduzenjaFalse() {
		z.setSifraZaduzenja(-1);
	}

	@Test
	public void testSetDatum() {
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		assertTrue(d.equals(z.getDatum()));

	}

	@Test
	public void testSetUkupno() {
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		assertTrue(b.equals(z.getUkupno()));
	}

	@Test
	public void testSetZaposleni() {
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);
		assertTrue(zp.equals(z.getZaposleni()));
	}

	@Test
	public void testEqualsObjectTrue() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(1);
		Date d2 = new Date(2019, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(100);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(1);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertTrue(z.equals(z2));
	}

	@Test
	public void testEqualsObjectTrue2() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(11);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(1);
		Date d2 = new Date(2019, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(100);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(1);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertTrue(z.equals(z2));
	}

	@Test
	public void testEqualsObjectTrue3() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(1);
		Date d2 = new Date(2009, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(100);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(1);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertTrue(z.equals(z2));
	}

	@Test
	public void testEqualsObjectTrue4() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(1);
		Date d2 = new Date(2019, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(10000);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(1);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertTrue(z.equals(z2));
	}

	@Test
	public void testEqualsObjectTrue5() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(1);
		Date d2 = new Date(2019, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(100);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(11);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertTrue(z.equals(z2));
	}

	@Test
	public void testEqualsObjectFalse() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		z.setZaposleni(zp);

		Zaduzenje z2 = new Zaduzenje();

		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		z2.setKlijent(k2);
		z2.setSifraZaduzenja(12);
		Date d2 = new Date(2019, 6, 28);
		z2.setDatum(d2);
		BigDecimal b2 = new BigDecimal(100);
		z2.setUkupno(b2);
		Zaposleni zp2 = new Zaposleni();
		zp2.setIdZaposlenog(1);
		zp2.setJmbg("12121212");
		z2.setZaposleni(zp2);
		assertFalse(z.equals(z2));
	}

	@Test
	public void testToString() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		k.setIme("Ignjat");
		k.setPrezime("Rajak");
		z.setKlijent(k);
		z.setSifraZaduzenja(1);
		Date d = new Date(2019, 6, 28);
		z.setDatum(d);
		BigDecimal b = new BigDecimal(100);
		z.setUkupno(b);
		Zaposleni zp = new Zaposleni();
		zp.setIdZaposlenog(1);
		zp.setJmbg("12121212");
		zp.setImeZaposlenog("Pera");
		zp.setPrezimeZaposlenog("Peric");
		z.setZaposleni(zp);

		assertEquals("Pera Peric Ignjat Rajak 100.00", z.toString());
	}

}
