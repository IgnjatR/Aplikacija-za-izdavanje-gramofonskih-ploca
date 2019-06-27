/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju;

import java.io.Serializable;

/**
 *
 * @author Ignjat
 */
public class ServerskiOdgovor implements Serializable {
     private int operacija;
    private String poruka;
    private Object odgovor;
    private boolean uspesno_neuspesno;
    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(int operacija, String poruka, Object odgovor,boolean login) {
        this.operacija = operacija;
        this.poruka = poruka;
        this.odgovor = odgovor;
        this.uspesno_neuspesno=login;
        
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public boolean isUspesno_neuspesno() {
        return uspesno_neuspesno;
    }

    public void setUspesno_neuspesno(boolean uspesno_neuspesno) {
        this.uspesno_neuspesno = uspesno_neuspesno;
    }
    
}
