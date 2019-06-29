
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Klasa koja predstavlja klijenta radnje.
 * 
 * @author Ignjat Rajak
 * @version 1.0
 *
 */
public class StavkaZaduzenja {

	/**
	 * Zaduzenje kome stavka pripada kao Zaduzenje.
	 */
	private Zaduzenje zaduzenje;

	/**
	 * Zaposleni koji je kreirao zaduzenje kao Zaposleni.
	 */
	private Zaposleni zaposleni;

	/**
	 * Klijent koji je zaduzio kao Klijent.
	 */
	private Klijent klijent;

	/**
	 * Redni broj stavke kao int.
	 */
	private int redniBroj;

	/**
	 * Kolicina narudzbe kao int.
	 */
	private int kolicina;

	/**
	 * vrednost stavke zaduzenja kao BigDecimal.
	 */
	private BigDecimal vrednost;

	/**
	 * Ploca koja se zaduzuje kao Ploca.
	 */
	private Ploca ploca;

	/**
	 * Inicijalizuje stavku zaduzenja i postavlja zaduzenje, zaposleni, klijent,
	 * redniBroj, kolicina, vrednost i ploca na unete vrednosti.
	 * 
	 * @param zaduzenje
	 *            Zaduzenje kojem stavka pripada
	 * @param zaposleni
	 *            Zaposleni koji je kreirao zaduzenje
	 * @param klijent
	 *            Klijent koji se zaduzuje
	 * @param redniBroj
	 *            Redni broj stavke zaduzenja
	 * @param kolicina
	 *            Kolicina narudzbe
	 * @param vrednost
	 *            Vrednost stavke zaduzenja
	 * @param ploca
	 *            Ploca koja se zaduzuje
	 */
	public StavkaZaduzenja(Zaduzenje zaduzenje, Zaposleni zaposleni, Klijent klijent, int redniBroj, int kolicina,
			BigDecimal vrednost, Ploca ploca) {
		this.zaduzenje = zaduzenje;
		this.zaposleni = zaposleni;
		this.klijent = klijent;
		this.redniBroj = redniBroj;
		this.kolicina = kolicina;
		this.vrednost = vrednost;
		this.ploca = ploca;
	}

	/**
	 * Inicijalizuje stavku zaduzenja
	 */
	public StavkaZaduzenja() {
	}

	/**
	 * Metoda koja vraca plocu koja se zaduzuje.
	 * 
	 * @return ploca kao Ploca
	 */
	public Ploca getPloca() {
		return ploca;
	}

	/**
	 * Metoda postavlja novu plocu koja se zaduzuje.
	 * 
	 * @param ploca
	 *            nova vrednost za ploca
	 * 
	 */
	public void setPloca(Ploca ploca) {
		this.ploca = ploca;
	}

	/**
	 * Metoda koja vraca zaduzenje kojem stavka pripada.
	 * 
	 * @return zaduzenje kao Zaduzenje
	 */
	public Zaduzenje getZaduzenje() {
		return zaduzenje;
	}

	/**
	 * Metoda postavlja novo zaduzenje kojem stavka pripada.
	 * 
	 * @param zaduzenje
	 *            nova vrednost za zaduzenje
	 * 
	 */
	public void setZaduzenje(Zaduzenje zaduzenje) {
		this.zaduzenje = zaduzenje;
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

	/**
	 * Metoda koja vraca klijenta koji se zaduzuje.
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
	 * Metoda koja vraca redni broj stavke zaduzenja
	 * 
	 * @return redniBroj kao int
	 */
	public int getRedniBroj() {
		return redniBroj;
	}

	/**
	 * Metoda postavlja novi redni broj ploce.
	 * 
	 * @param redniBroj
	 *            nova vrednost za redniBroj
	 * @throws java.lang.RuntimeException
	 *             ako je uneti redniBroj manji od 0
	 */
	public void setRedniBroj(int redniBroj) {
		if (redniBroj < 0)
			throw new RuntimeException();
		this.redniBroj = redniBroj;
	}

	/**
	 * Metoda koja vraca kolicinu narudzbe
	 * 
	 * @return kolicina kao int
	 */
	public int getKolicina() {
		return kolicina;
	}

	/**
	 * Metoda postavlja novu kolicinu narudzbe.
	 * 
	 * @param kolicina
	 *            nova vrednost za kolicina
	 * 
	 */
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	/**
	 * Metoda koja vraca vrednost narudzbe
	 * 
	 * @return vrednost kao BigDecimal
	 */
	public BigDecimal getVrednost() {
		return vrednost;
	}

	/**
	 * Metoda postavlja novu vrednost narudzbe.
	 * 
	 * @param vrednost
	 *            nova vrednost za vrednost
	 * 
	 */
	public void setVrednost(BigDecimal vrednost) {
		this.vrednost = vrednost;
	}

	@Override
	public String toString() {
		return "Sifra zaduzenje=" + zaduzenje.getSifraZaduzenja() + ", kolicina=" + kolicina + ", vrednost=" + vrednost
				+ ", ploca=" + ploca;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		return hash;
	}

	/**
	 * Poredi dve stavke zaduzenja po njihovom zaposlenom, klijentu i zaduzenju.
	 * 
	 * @return true ako su zaposleni, klijent i zaduzenje isti, false ako to
	 *         nije slucaj.
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
		final StavkaZaduzenja other = (StavkaZaduzenja) obj;
		if (!Objects.equals(this.zaduzenje, other.zaduzenje)) {
			return false;
		}
		if (!Objects.equals(this.zaposleni, other.zaposleni)) {
			return false;
		}
		if (!Objects.equals(this.klijent, other.klijent)) {
			return false;
		}
		return true;
	}

}
