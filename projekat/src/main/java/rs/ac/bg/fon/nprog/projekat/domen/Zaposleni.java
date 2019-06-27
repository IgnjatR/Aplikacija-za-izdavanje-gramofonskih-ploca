/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ignjat
 */
public class Zaposleni  {
    
    private int idZaposlenog;
    private  String jmbg;
    private String imeZaposlenog;
    private String prezimeZaposlenog;
    private String emailZ;

    public Zaposleni(int idZaposlenog, String jmbg, String imeZaposlenog, String prezimeZaposlenog, String emailZ) {
        this.idZaposlenog = idZaposlenog;
        this.jmbg = jmbg;
        this.imeZaposlenog = imeZaposlenog;
        this.prezimeZaposlenog = prezimeZaposlenog;
        this.emailZ = emailZ;
    }

    public int getIdZaposlenog() {
        return idZaposlenog;
    }

    public void setIdZaposlenog(int idZaposlenog) {
        this.idZaposlenog = idZaposlenog;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeZaposlenog() {
        return imeZaposlenog;
    }

    public void setImeZaposlenog(String imeZaposlenog) {
        this.imeZaposlenog = imeZaposlenog;
    }

    public String getPrezimeZaposlenog() {
        return prezimeZaposlenog;
    }

    public void setPrezimeZaposlenog(String prezimeZaposlenog) {
        this.prezimeZaposlenog = prezimeZaposlenog;
    }

    public String getEmailZ() {
        return emailZ;
    }

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
