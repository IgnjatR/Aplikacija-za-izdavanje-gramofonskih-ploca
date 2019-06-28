package rs.ac.bg.fon.nprog.projekat;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.StavkaZaduzenja;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;

public class StavkaZaduzenjaTest {

	private StavkaZaduzenja s;

	@Before
	public void setUp() throws Exception {
		s = new StavkaZaduzenja();
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testSetPloca() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		assertTrue(p.equals(s.getPloca()));

	}

	@Test
	public void testSetZaduzenje() {
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		assertTrue(z.equals(s.getZaduzenje()));

	}

	@Test
	public void testSetZaposleni() {
		Zaposleni z = new Zaposleni();
		z.setIdZaposlenog(1);
		z.setJmbg("12121212");
		s.setZaposleni(z);
		assertTrue(z.equals(s.getZaposleni()));
	}

	@Test
	public void testSetKlijent() {
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		assertTrue(k.equals(s.getKlijent()));

	}

	@Test
	public void testSetRedniBroj() {
		s.setRedniBroj(1);
		assertEquals(1, s.getRedniBroj());

	}

	@Test(expected = RuntimeException.class)

	public void testSetRedniBrojFalse() {
		s.setRedniBroj(-1);

	}

	@Test
	public void testSetKolicina() {
		s.setKolicina(1);
		assertEquals(1, s.getKolicina());

	}

	@Test
	public void testSetVrednost() {

		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);
		assertTrue(b.equals(s.getVrednost()));
	}

	@Test
	public void testEqualsObjectTrue() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(100);
		s2.setVrednost(b2);

		assertTrue(s.equals(s2));
	}

	@Test
	public void testEqualsObjectTrue2() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(11);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(100);
		s2.setVrednost(b2);

		assertTrue(s.equals(s2));
	}

	@Test

	public void testEqualsObjectTrue3() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(11);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(100);
		s2.setVrednost(b2);

		assertTrue(s.equals(s2));
	}

	@Test

	public void testEqualsObjectTrue4() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(11);
		BigDecimal b2 = new BigDecimal(100);
		s2.setVrednost(b2);

		assertTrue(s.equals(s2));
	}

	@Test

	public void testEqualsObjectTrue5() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(10000);
		s2.setVrednost(b2);

		assertTrue(s.equals(s2));
	}

	@Test

	public void testEqualsObjectFalse() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(12);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(10000);
		s2.setVrednost(b2);

		assertFalse(s.equals(s2));
	}

	@Test

	public void testEqualsObjectFalse2() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(12);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(1);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(10000);
		s2.setVrednost(b2);

		assertFalse(s.equals(s2));
	}

	@Test

	public void testEqualsObjectFalse3() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);
		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);

		StavkaZaduzenja s2 = new StavkaZaduzenja();
		Ploca p2 = new Ploca();
		p2.setIdPloce(1);
		s2.setPloca(p2);
		Zaduzenje z2 = new Zaduzenje();
		z2.setSifraZaduzenja(1);
		s2.setZaduzenje(z2);
		Zaposleni za2 = new Zaposleni();
		za2.setIdZaposlenog(1);
		za2.setJmbg("12121212");
		s2.setZaposleni(za2);
		Klijent k2 = new Klijent();
		k2.setIdKlijenta(12);
		s2.setKlijent(k2);
		s2.setRedniBroj(1);
		s2.setKolicina(1);
		BigDecimal b2 = new BigDecimal(10000);
		s2.setVrednost(b2);

		assertFalse(s.equals(s2));
	}

	@Test
	public void testToString() {
		Ploca p = new Ploca();
		p.setIdPloce(1);
		p.setNaziv("naziv");
		p.setAutor("Autor");
		s.setPloca(p);
		Zaduzenje z = new Zaduzenje();
		z.setSifraZaduzenja(1);

		s.setZaduzenje(z);
		Zaposleni za = new Zaposleni();
		za.setIdZaposlenog(1);
		za.setJmbg("12121212");
		s.setZaposleni(za);
		Klijent k = new Klijent();
		k.setIdKlijenta(1);
		s.setKlijent(k);
		s.setRedniBroj(1);
		s.setKolicina(1);
		BigDecimal b = new BigDecimal(100);
		s.setVrednost(b);
		assertEquals("Sifra zaduzenje=1, kolicina=1, vrednost=100, ploca=Autor-naziv", s.toString());
	}

}
