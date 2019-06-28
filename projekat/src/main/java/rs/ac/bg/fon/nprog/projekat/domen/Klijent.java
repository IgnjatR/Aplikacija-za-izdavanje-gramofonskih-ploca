/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
	

	

	public Klijent(int idKlijenta, String ime, String prezime, String telefon, String adresa, String email) {
		this.idKlijenta = idKlijenta;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.adresa = adresa;
		this.email = email;
	}

	public Klijent() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdKlijenta() {
		return idKlijenta;
	}

	public void setIdKlijenta(int idKlijenta) {
		if (idKlijenta<0)
			throw new RuntimeException("Id mora biti veci od 0");
		this.idKlijenta = idKlijenta;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}

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
