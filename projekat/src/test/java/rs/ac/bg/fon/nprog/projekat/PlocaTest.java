package rs.ac.bg.fon.nprog.projekat;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.nprog.projekat.domen.Ploca;

public class PlocaTest {

	private Ploca p;

	@Before
	public void setUp() throws Exception {
		p = new Ploca();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void testSetCenaIzdavanja() {
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);
		assertTrue(b.equals(p.getCenaIzdavanja()));

	}

	@Test
	public void testSetIdPloce() {
		p.setIdPloce(1);
		assertEquals(1, p.getIdPloce());

	}

	@Test(expected = RuntimeException.class)
	public void testSetIdPloceFalse() {
		p.setIdPloce(-1);

	}

	@Test
	public void testSetAutor() {
		p.setAutor("Autor");
		assertEquals("Autor", p.getAutor());
	}

	@Test
	public void testSetDatumIzdavanja() {
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		assertTrue(d.equals(p.getDatumIzdavanja()));

	}

	@Test
	public void testSetBrojPesama() {
		p.setBrojPesama(12);
		assertEquals(12, p.getBrojPesama());
	}

	@Test
	public void testEqualsObjectTrue() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(12);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectTrue2() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv1");
		p2.setBrojPesama(12);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectTrue3() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(121);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectTrue4() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(12);
		Date d2 = new Date(2009, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectTrue5() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(12);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor2");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectTrue6() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(12);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(1);
		BigDecimal b2 = new BigDecimal(1000);
		p2.setCenaIzdavanja(b2);

		assertTrue(p.equals(p2));

	}

	@Test
	public void testEqualsObjectFalse() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);

		Ploca p2 = new Ploca();

		p2.setNaziv("naziv");
		p2.setBrojPesama(12);
		Date d2 = new Date(2019, 6, 28);
		p2.setDatumIzdavanja(d2);
		p2.setAutor("Autor");
		p2.setIdPloce(10);
		BigDecimal b2 = new BigDecimal(100);
		p2.setCenaIzdavanja(b2);

		assertFalse(p.equals(p2));

	}

	@Test
	public void testSetNaziv() {
		p.setNaziv("naziv");
		assertEquals("naziv", p.getNaziv());
	}

	@Test
	public void testToString() {
		p.setNaziv("naziv");
		p.setBrojPesama(12);
		Date d = new Date(2019, 6, 28);
		p.setDatumIzdavanja(d);
		p.setAutor("Autor");
		p.setIdPloce(1);
		BigDecimal b = new BigDecimal(100);
		p.setCenaIzdavanja(b);
		
		assertEquals("Autor-naziv", p.toString());
	}
}
