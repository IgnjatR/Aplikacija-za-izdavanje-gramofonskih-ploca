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
    
    private int idPloce;
    private String autor;
    private Date datumIzdavanja;
    private int brojPesama;
    private BigDecimal cenaIzdavanja;
    private String naziv;

    public Ploca() {
    }

    public Ploca(int idPloce, String autor, Date datumIzdavanja, int brojPesama, BigDecimal cenaIzdavanja, String naziv) {
        this.idPloce = idPloce;
        this.autor = autor;
        this.datumIzdavanja = datumIzdavanja;
        this.brojPesama = brojPesama;
        this.cenaIzdavanja = cenaIzdavanja;
        this.naziv = naziv;
    }
    
   
    public BigDecimal getCenaIzdavanja() {
        return cenaIzdavanja;
    }

    public void setCenaIzdavanja(BigDecimal cenaIzdavanja) {
        this.cenaIzdavanja = cenaIzdavanja;
    }

    public int getIdPloce() {
        return idPloce;
    }

    public void setIdPloce(int idPloce) {
        this.idPloce = idPloce;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public int getBrojPesama() {
        return brojPesama;
    }

    public void setBrojPesama(int brojPesama) {
        this.brojPesama = brojPesama;
    }

    @Override
    public String toString() {
        return autor + "-"  + naziv ;
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
        final Ploca other = (Ploca) obj;
        if (this.idPloce != other.idPloce) {
            return false;
        }
        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
}
