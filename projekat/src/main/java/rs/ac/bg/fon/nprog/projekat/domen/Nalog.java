/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.domen;

import java.io.Serializable;

/**
 *
 * @author Ignjat
 */
public class Nalog {
    
    
    private int sifraNaloga;
    private String password;
    private String username;
    private Zaposleni zaposleni;

    public Nalog(int sifraNaloga, String passeord, String username) {
        this.sifraNaloga = sifraNaloga;
        this.password = passeord;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSifraNaloga() {
        return sifraNaloga;
    }

    public void setSifraNaloga(int sifraNaloga) {
        this.sifraNaloga = sifraNaloga;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Nalog{" + "username=" + username + '}';
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
        final Nalog other = (Nalog) obj;
        if (this.sifraNaloga != other.sifraNaloga) {
            return false;
        }
        return true;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Nalog(String password, String username) {
        this.password = password;
        this.username = username;
    }
    
    
}
