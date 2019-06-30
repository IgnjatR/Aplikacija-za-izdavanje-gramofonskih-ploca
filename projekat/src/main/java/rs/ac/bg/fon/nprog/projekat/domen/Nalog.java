
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;

/**
 * Klasa koja predstavlja nalog zaposlenog.
 * 
 * @author Ignjat Rajak
 * @version 1.0
 *
 */
public class Nalog {

	/**
	 * Sifra naloga kao int.
	 */
	private int sifraNaloga;

	/**
	 * Sifra naloga kao String.
	 */
	private String password;

	/**
	 * Korisnicko ime naloga kao String.
	 */
	private String username;

	/**
	 * Zaposleni povezan sa nalogom kao Zaposleni.
	 */
	private Zaposleni zaposleni;

	/**
	 * Inicijalizuje nalog i postavlja sifraNaloga, password i username na unete
	 * vrednosti.
	 * 
	 * @param idKlijenta
	 *            ID klijenta
	 * @param ime
	 *            ime klijenta
	 * @param prezime
	 *            prezime klijenta
	 * 
	 */
	public Nalog(int sifraNaloga, String passeord, String username) {
		this.sifraNaloga = sifraNaloga;
		this.password = passeord;
		this.username = username;
	}

	/**
	 * Metoda koja vraca username naloga .
	 * 
	 * @return username kao String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Metoda postavlja novi username naloga.
	 * 
	 * @param username
	 *            nova vrednost za username naloga
	 * 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Metoda koja vraca sifru naloga naloga .
	 * 
	 * @return sifraNaloga kao int
	 */
	public int getSifraNaloga() {
		return sifraNaloga;
	}

	/**
	 * Metoda postavlja novu sifru naloga.
	 * 
	 * @param sifraNaloga
	 *            nova vrednost za sifru naloga
	 * @throws java.lang.RuntimeException
	 *             ako je uneta sifraNaloga manja od 0
	 */
	public void setSifraNaloga(int sifraNaloga) {
		if (sifraNaloga < 0)
			throw new RuntimeException("Sifra naloga mora biti veca od 0");
		this.sifraNaloga = sifraNaloga;
	}

	/**
	 * Metoda koja vraca password naloga .
	 * 
	 * @return password kao String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Metoda postavlja novi password naloga.
	 * 
	 * @param password
	 *            nova vrednost za password naloga
	 * 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Nalog{" + "username=" + username + '}';
	}

	/**
	 * Poredi dva Naloga po njihovoj sifri (sifraNaloga).
	 * 
	 * @return true ako su obe sifraNaloga ista, false ako to nije slucaj.
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
		final Nalog other = (Nalog) obj;
		if (this.sifraNaloga != other.sifraNaloga) {
			return false;
		}
		return true;
	}

	/**
	 * Metoda koja vraca zaposlenog koji je povezan sa nalogom.
	 * 
	 * @return zaposleni kao Zaposleni
	 */
	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	/**
	 * Metoda postavlja novog zaposlenog koji je povezan sa nalogom.
	 * 
	 * @param zaposleni
	 *            nova vrednost za zaposlenog 
	 * 
	 */
	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	/**
	 * Inicijalizuje nalog i postavlja password i username na unete vrednosti
	 * pozivanjem set metoda.
	 * 
	 * 
	 * @param ime
	 *            ime klijenta
	 * @param prezime
	 *            prezime klijenta
	 * 
	 */
	public Nalog(String password, String username) {
		this.password = password;
		this.username = username;
	}

	/**
	 * Inicijalizuje nalog
	 */
	public Nalog() {
	}

}
