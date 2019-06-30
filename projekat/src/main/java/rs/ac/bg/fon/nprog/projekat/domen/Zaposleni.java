package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa koja predstavlja zaposlenog u radnji.
 * 
 * @author Ignjat Rajak
 * @version 1.0
 *
 */
public class Zaposleni {

	/**
	 * ID zaposlenog kao int.
	 */
	private int idZaposlenog;

	/**
	 * JMBG zaposlenog kao String.
	 */
	private String jmbg;

	/**
	 * Ime zaposlenog kao String.
	 */
	private String imeZaposlenog;

	/**
	 * Prezime zaposlenog kao String.
	 */
	private String prezimeZaposlenog;

	/**
	 * Email zaposlenog kao String.
	 */
	private String emailZ;

	/**
	 * Inicijalizuje zaposlenog i postavlja idZaposlenog, jmbg, imeZaposlenog,
	 * prezimeZaposlenog, i emailZ na unete vrednosti.
	 * 
	 * @param idZaposlenog
	 *            ID zaposlenog
	 * @param jmbg
	 *            JMBG zaposlenog
	 * @param imeZaposlenog
	 *            Ime zaposlenog
	 * @param prezimeZaposlenog
	 *            Prezime zaposlenog
	 * @param emailZ
	 *            Email zaposlenog
	 * 
	 */

	public Zaposleni(int idZaposlenog, String jmbg, String imeZaposlenog, String prezimeZaposlenog, String emailZ) {
		this.idZaposlenog = idZaposlenog;
		this.jmbg = jmbg;
		this.imeZaposlenog = imeZaposlenog;
		this.prezimeZaposlenog = prezimeZaposlenog;
		this.emailZ = emailZ;
	}

	/**
	 * Inicijalizuje zaposlenog
	 */
	public Zaposleni() {
	}

	/**
	 * Metoda koja vraca ID zaposlenog.
	 * 
	 * @return idZaposlenog kao int
	 */
	public int getIdZaposlenog() {
		return idZaposlenog;
	}

	/**
	 * Metoda postavlja novi ID zaposlenog.
	 * 
	 * @param idZaposlenog
	 *            nova vrednost za ID zaposlenog
	 * @throws java.lang.RuntimeException
	 *             ako je uneti ID manji od 0
	 */
	public void setIdZaposlenog(int idZaposlenog) {
		if (idZaposlenog < 0)
			throw new RuntimeException();
		this.idZaposlenog = idZaposlenog;
	}

	/**
	 * Metoda koja vraca JMBG zaposlenog.
	 * 
	 * @return jmbg kao String
	 */
	public String getJmbg() {
		return jmbg;
	}

	/**
	 * Metoda postavlja novi JMBG zaposlenog.
	 * 
	 * @param jmbg
	 *            nova vrednost za JMBG zaposlenog
	 * 
	 */
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	/**
	 * Metoda koja vraca ime zaposlenog.
	 * 
	 * @return imeZaposlenog kao String
	 */
	public String getImeZaposlenog() {
		return imeZaposlenog;
	}

	/**
	 * Metoda postavlja novo ime zaposlenog.
	 * 
	 * @param imeZaposlenog
	 *            nova vrednost za ime zaposlenog
	 * 
	 */
	public void setImeZaposlenog(String imeZaposlenog) {
		this.imeZaposlenog = imeZaposlenog;
	}

	/**
	 * Metoda koja vraca prezime zaposlenog.
	 * 
	 * @return prezimeZaposlenog kao String
	 */
	public String getPrezimeZaposlenog() {
		return prezimeZaposlenog;
	}

	/**
	 * Metoda postavlja novo prezime zaposlenog.
	 * 
	 * @param prezimeZaposlenog
	 *            nova vrednost za prezime zaposlenog
	 * 
	 */
	public void setPrezimeZaposlenog(String prezimeZaposlenog) {
		this.prezimeZaposlenog = prezimeZaposlenog;
	}

	/**
	 * Metoda koja vraca email zaposlenog.
	 * 
	 * @return emailZ kao String
	 */
	public String getEmailZ() {
		return emailZ;
	}

	/**
	 * Metoda postavlja novi email zaposlenog.
	 * 
	 * @param emailZ
	 *            nova vrednost za email zaposlenog
	 * 
	 */
	public void setEmailZ(String emailZ) {
		this.emailZ = emailZ;
	}

	@Override
	public String toString() {
		return imeZaposlenog + " " + prezimeZaposlenog;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		return hash;
	}

	/**
	 * Poredi dva Zaposlena po njihovom ID (idKlijenta) i JMBG (jmbg).
	 * 
	 * @return true ako su oba idKlijenta ista i ako su oba jmbg ista, false ako
	 *         to nije slucaj.
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
		final Zaposleni other = (Zaposleni) obj;
		if (!Objects.equals(this.idZaposlenog, other.idZaposlenog)) {
			return false;
		}
		if (!Objects.equals(this.jmbg, other.jmbg)) {
			return false;
		}
		return true;
	}

}
