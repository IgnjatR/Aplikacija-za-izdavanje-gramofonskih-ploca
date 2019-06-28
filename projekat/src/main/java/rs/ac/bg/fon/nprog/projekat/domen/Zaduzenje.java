/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 *
 * @author Ignjat
 */
public class Zaduzenje {
    
    
    private int sifraZaduzenja;
    private Date datum;
    private BigDecimal ukupno;
    private Zaposleni zaposleni;
    private Klijent klijent;

    public Zaduzenje(int sifraZaduzenja, Date datum, BigDecimal ukupno, Zaposleni zaposleni, Klijent klijent) {
        this.sifraZaduzenja = sifraZaduzenja;
        this.datum = datum;
        this.ukupno = ukupno;
        this.zaposleni = zaposleni;
        this.klijent = klijent;
    }

    public Zaduzenje() {
    }

   
    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public int getSifraZaduzenja() {
        return sifraZaduzenja;
    }

    public void setSifraZaduzenja(int sifraZaduzenja) {
    	if(sifraZaduzenja<0)
    		throw new RuntimeException();
        this.sifraZaduzenja = sifraZaduzenja;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public BigDecimal getUkupno() {
        return ukupno;
    }

    public void setUkupno(BigDecimal ukupno) {
        this.ukupno = ukupno;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Zaduzenje other = (Zaduzenje) obj;
        if (this.sifraZaduzenja != other.sifraZaduzenja) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  zaposleni + " " + klijent +" "+ukupno.setScale(2, RoundingMode.CEILING);
    }
    
    
    
}
