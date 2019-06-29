package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * Klasa koja predstavlja zaduzenje klijenta.
 * 
 * @author Ignjat Rajak
 * @version 1.0
 *
 */
public class Zaduzenje {

	/**
	 * Sifra zaduzenja kao int.
	 */
	private int sifraZaduzenja;

	/**
	 * Datum zaduzenja kao Date.
	 */
	private Date datum;

	/**
	 * Ukupna vrednost zaduzenja kao BigDecimal.
	 */
	private BigDecimal ukupno;

	/**
	 * Zaposleni koji je kreirao zaduzenje kao Zaposleni.
	 */
	private Zaposleni zaposleni;

	/**
	 * Klijent koji se zaduzio kao Klijent.
	 */
	private Klijent klijent;

	/**
	 * Inicijalizuje zaduzenje i postavlja sifraZaduzenja, datum, ukupno,
	 * zaposleni, i klijent na unete vrednosti.
	 * 
	 * @param sifraZaduzenja
	 *            Sifra zaduzenja
	 * @param datum
	 *            Datum kreiranja zaduzenja
	 * @param ukupno
	 *            Ukupna vrednsot zaduzenja
	 * @param zaposleni
	 *            Zaposleno koji je kreirao zaduzenje
	 * @param klijent
	 *            Klijent koji se zaduzio
	 * 
	 */
	public Zaduzenje(int sifraZaduzenja, Date datum, BigDecimal ukupno, Zaposleni zaposleni, Klijent klijent) {
		this.sifraZaduzenja = sifraZaduzenja;
		this.datum = datum;
		this.ukupno = ukupno;
		this.zaposleni = zaposleni;
		this.klijent = klijent;
	}

	/**
	 * Inicijalizuje zaduzenje
	 */
	public Zaduzenje() {
	}

	/**
	 * Metoda koja vraca klijenta koji se zaduzio.
	 * 
	 * @return klijent kao Klijent
	 */
	public Klijent getKlijent() {
		return klijent;
	}

	/**
	 * Metoda postavlja novog klijenta koji se zaduzuje.
	 * 
	 * @param klijent
	 *            nova vrednost za klijent
	 * 
	 */
	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

	/**
	 * Metoda koja vraca sifru zaduzenja.
	 * 
	 * @return sifraZaduzenja kao int
	 */
	public int getSifraZaduzenja() {
		return sifraZaduzenja;
	}

	/**
	 * Metoda postavlja novu sifru zaduzenja.
	 * 
	 * @param sifraZaduzenja
	 *            nova vrednost za sifraZaduzenja
	 * @throws java.lang.RuntimeException
	 *             ako je uneta sifraZaduzenja manja od 0
	 */
	public void setSifraZaduzenja(int sifraZaduzenja) {
		if (sifraZaduzenja < 0)
			throw new RuntimeException();
		this.sifraZaduzenja = sifraZaduzenja;
	}

	/**
	 * Metoda koja vraca datum kreiranja zaduzenja.
	 * 
	 * @return datum kao Date
	 */
	public Date getDatum() {
		return datum;
	}

	/**
	 * Metoda postavlja novi datum kreiranja zaduzenja.
	 * 
	 * @param datum
	 *            nova vrednost za datum
	 * 
	 */
	public void setDatum(Date datum) {
		this.datum = datum;
	}

	/**
	 * Metoda koja vraca ukupnu vrednost zaduzenja.
	 * 
	 * @return ukupno kao BigDecimal
	 */
	public BigDecimal getUkupno() {
		return ukupno;
	}

	/**
	 * Metoda postavlja novu ukupnu vrednost zaduzenja.
	 * 
	 * @param ukupno
	 *            nova vrednost za ukupno
	 * 
	 */
	public void setUkupno(BigDecimal ukupno) {
		this.ukupno = ukupno;
	}

	/**
	 * Metoda koja vraca zaposlenog koji je kreirao zaduzenje.
	 * 
	 * @return zaposleni kao Zaposleni
	 */
	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	/**
	 * Metoda postavlja novog zaposlenog koji je kreirao zaduzenje.
	 * 
	 * @param zaposleni
	 *            nova vrednost za zaposleni
	 * 
	 */
	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		return hash;
	}

	/**
	 * Poredi dva zaduzenja po njihovoj sifri (sifraZaduzenja).
	 * 
	 * @return true ako su obe sifraZaduzenja iste, false ako to nije slucaj.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Zaduzenje other = (Zaduzenje) obj;
		if (this.sifraZaduzenja != other.sifraZaduzenja) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return zaposleni + " " + klijent + " " + ukupno.setScale(2, RoundingMode.CEILING);
	}

}
