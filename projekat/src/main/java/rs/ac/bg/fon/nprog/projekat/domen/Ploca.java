/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ignjat
 */
public class Ploca {

	/**
	 * ID ploce kao int.
	 */
	private int idPloce;

	/**
	 * Autor ploce kao String.
	 */
	private String autor;

	/**
	 * Datum izdavanja ploce kao Date.
	 */
	private Date datumIzdavanja;

	/**
	 * Broj pesama na ploci kao int.
	 */
	private int brojPesama;

	/**
	 * Cena izdavanja ploce kao BigDecimal.
	 */
	private BigDecimal cenaIzdavanja;

	/**
	 * Naziv ploce kao String.
	 */
	private String naziv;

	/**
	 * Inicijalizuje plocu
	 */
	public Ploca() {
	}

	/**
	 * Inicijalizuje plocu i postavlja idPloce, autor, datumIzdavanja,
	 * brojPesama, cenaIzdavanja i naziv na unete vrednosti.
	 * 
	 * @param idPloce
	 *            ID ploce
	 * @param autor
	 *            Autor ploce
	 * @param datumIzdavanja
	 *            Datum izdavanja ploce
	 * @param brojPesama
	 *            Broj pesama na ploci
	 * @param cenaIzdavanja
	 *            Cena izdavanja ploce
	 * @param naziv
	 *            Naziv ploce
	 */
	public Ploca(int idPloce, String autor, Date datumIzdavanja, int brojPesama, BigDecimal cenaIzdavanja,
			String naziv) {
		this.idPloce = idPloce;
		this.autor = autor;
		this.datumIzdavanja = datumIzdavanja;
		this.brojPesama = brojPesama;
		this.cenaIzdavanja = cenaIzdavanja;
		this.naziv = naziv;
	}

	/**
	 * Metoda koja vraca cenu izdavanja ploce.
	 * 
	 * @return cenaIzdavanja kao BigDecimal
	 */
	public BigDecimal getCenaIzdavanja() {
		return cenaIzdavanja;
	}

	/**
	 * Metoda postavlja novu cenu izdavanja ploce.
	 * 
	 * @param cenaIzdavanja
	 *            nova vrednost za cenaIzdavanja
	 * 
	 */
	public void setCenaIzdavanja(BigDecimal cenaIzdavanja) {
		this.cenaIzdavanja = cenaIzdavanja;
	}

	/**
	 * Metoda koja vraca ID ploce.
	 * 
	 * @return idPloce kao int
	 */
	public int getIdPloce() {
		return idPloce;
	}

	/**
	 * Metoda postavlja novi ID ploce.
	 * 
	 * @param idPloce
	 *            nova vrednost za idPloce
	 * @throws java.lang.RuntimeException
	 *             ako je uneti ID manji od 0
	 */
	public void setIdPloce(int idPloce) {
		if (idPloce < 0)
			throw new RuntimeException();
		this.idPloce = idPloce;
	}

	/**
	 * Metoda koja vraca autora ploce.
	 * 
	 * @return autor kao String
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metoda postavlja novog autora ploce.
	 * 
	 * @param autor
	 *            nova vrednost za autor
	 * 
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metoda koja vraca datum izdavanja ploce.
	 * 
	 * @return datumIzdavanja kao Date
	 */
	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	/**
	 * Metoda postavlja novi datum izdavanja ploce.
	 * 
	 * @param datumIzdavanja
	 *            nova vrednost za datumIzdavanja
	 * 
	 */
	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	/**
	 * Metoda koja vraca broj pesama na ploci.
	 * 
	 * @return brojPesama kao int
	 */
	public int getBrojPesama() {
		return brojPesama;
	}

	/**
	 * Metoda postavlja novi broj pesama na ploci.
	 * 
	 * @param brojPesama
	 *            nova vrednost za brojPesama
	 * 
	 */
	public void setBrojPesama(int brojPesama) {
		this.brojPesama = brojPesama;
	}

	@Override
	public String toString() {
		return autor + "-" + naziv;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}

	/**
	 * Poredi dve ploce po njihovom ID (idPloce).
	 * 
	 * @return true ako su oba idPloce ista, false ako to nije slucaj.
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
		final Ploca other = (Ploca) obj;
		if (this.idPloce != other.idPloce) {
			return false;
		}
		return true;
	}

	/**
	 * Metoda koja vraca naziv ploce.
	 * 
	 * @return naziv kao String
	 */
	public String getNaziv() {
		return naziv;
	}

	/**
	 * Metoda postavlja novi naziv ploce.
	 * 
	 * @param naziv
	 *            nova vrednost za naziv
	 * 
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
