/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;
import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;

/**
 *
 * @author Ignjat
 */
public class SOVratiSvePloce {

    public SOVratiSvePloce() {
    }
   
    public ServerskiOdgovor vratiPloce(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();

        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.VRATI_SVE_PLOCE);
        rsb.otvoriKonekciju();

        
       so.setOdgovor( rsb.vratiPloce());

        rsb.zatvoriKonekciju();

        return so;
    }
}
