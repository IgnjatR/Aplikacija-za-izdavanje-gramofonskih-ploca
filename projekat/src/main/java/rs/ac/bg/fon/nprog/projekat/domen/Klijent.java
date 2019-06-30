
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

/**
 * Klasa koja predstavlja klijenta radnje.
 * 
 * @author Ignjat Rajak
 * @version 1.0
 *
 */
public class Klijent {

	/**
	 * ID klijenta kao int.
	 */
	private int idKlijenta;

	/**
	 * Ime klijenta kao String.
	 */
	private String ime;

	/**
	 * Prezime klijenta kao String.
	 */
	private String prezime;

	/**
	 * Telefon klijenta kao String.
	 */
	private String telefon;

	/**
	 * Adresa kao String.
	 */
	private String adresa;

	/**
	 * Email klijenta kao String.
	 */
	private String email;

	/**
	 * Inicijalizuje klijenta i postavlja idKlijenta, ime, prezime, telefon,
	 * adresa i email na unete vrednosti.
	 * 
	 * @param idKlijenta
	 *            ID klijenta
	 * @param ime
	 *            ime klijenta
	 * @param prezime
	 *            prezime klijenta
	 * @param telefon
	 *            telefon klijenta
	 * @param adresa
	 *            adresa klijenta
	 * @param email
	 *            email klijenta
	 */
	public Klijent(int idKlijenta, String ime, String prezime, String telefon, String adresa, String email) {
		this.idKlijenta = idKlijenta;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.adresa = adresa;
		this.email = email;
	}

	/**
	 * Inicijalizuje klijenta
	 */
	public Klijent() {
	}

	/**
	 * Metoda koja vraca email klijenta.
	 * 
	 * @return email kao String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Metoda postavlja novi email klijenta .
	 * 
	 * @param email
	 *            nova vrednost za email 
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metoda koja vraca ID klijenta.
	 * 
	 * @return idKlijenta kao int
	 */
	public int getIdKlijenta() {
		return idKlijenta;
	}

	/**
	 * Metoda postavlja novi ID klijenta.
	 * 
	 * @param idKlijenta
	 *            nova vrednost za ID klijenta
	 * @throws java.lang.RuntimeException
	 *             ako je uneti ID manji od 0
	 */
	public void setIdKlijenta(int idKlijenta) {
		if (idKlijenta < 0)
			throw new RuntimeException("ID klijenta mora biti veci od 0");
		this.idKlijenta = idKlijenta;
	}

	/**
	 * Metoda koja vraca ime klijenta.
	 * 
	 * @return ime kao String
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * Metoda postavlja novo ime klijenta .
	 * 
	 * @param ime
	 *            nova vrednost za ime klijenta
	 * 
	 */
	public void setIme(String ime) {
		this.ime = ime;
	}

	/**
	 * Metoda koja vraca prezime klijenta.
	 * 
	 * @return prezime kao String
	 */

	public String getPrezime() {
		return prezime;
	}

	/**
	 * Metoda postavlja novo prezime klijenta .
	 * 
	 * @param prezime
	 *            nova vrednost za prezime klijenta
	 * 
	 */
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	/**
	 * Metoda koja vraca telefon klijenta.
	 * 
	 * @return telefon kao String
	 */
	public String getTelefon() {
		return telefon;
	}

	/**
	 * Metoda postavlja novi telefon klijenta .
	 * 
	 * @param telefon
	 *            nova vrednost za telefon klijenta
	 * 
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	/**
	 * Metoda koja vraca adresu klijenta.
	 * 
	 * @return adresa kao String
	 */
	public String getAdresa() {
		return adresa;
	}

	/**
	 * Metoda postavlja novu adresu klijenta .
	 * 
	 * @param adresa
	 *            nova vrednost za adresu klijenta
	 * 
	 */
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	/**
	 * Poredi dva Klijenta po njihovom ID (idKlijenta).
	 * 
	 * @return true ako su oba idKlijenta ista, false ako to nije slucaj.
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
		final Klijent other = (Klijent) obj;
		if (this.idKlijenta != other.idKlijenta) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}

}
