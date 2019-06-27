/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Ignjat
 */
public class StavkaZaduzenja  {
    
    private Zaduzenje zaduzenje;
    private Zaposleni zaposleni;
    private Klijent klijent;
    private int redniBroj;
    private int kolicina;
    private BigDecimal vrednost;
    private Ploca ploca;

    public StavkaZaduzenja(Zaduzenje zaduzenje, Zaposleni zaposleni, Klijent klijent, int redniBroj, int kolicina, BigDecimal vrednost, Ploca ploca) {
        this.zaduzenje = zaduzenje;
        this.zaposleni = zaposleni;
        this.klijent = klijent;
        this.redniBroj = redniBroj;
        this.kolicina = kolicina;
        this.vrednost = vrednost;
        this.ploca = ploca;
    }

    public StavkaZaduzenja() {
    }

    

    public Ploca getPloca() {
        return ploca;
    }

    public void setPloca(Ploca ploca) {
        this.ploca = ploca;
    }

    public Zaduzenje getZaduzenje() {
        return zaduzenje;
    }

    public void setZaduzenje(Zaduzenje zaduzenje) {
        this.zaduzenje = zaduzenje;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getVrednost() {
        return vrednost;
    }

    public void setVrednost(BigDecimal vrednost) {
        this.vrednost = vrednost;
    }

    @Override
    public String toString() {
        return "StavkaZaduzenja{" + "zaduzenje=" + zaduzenje + ", zaposleni=" + zaposleni + ", klijent=" + klijent + ", redniBroj=" + redniBroj + ", kolicina=" + kolicina + ", vrednost=" + vrednost + ", ploca=" + ploca + '}';
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
