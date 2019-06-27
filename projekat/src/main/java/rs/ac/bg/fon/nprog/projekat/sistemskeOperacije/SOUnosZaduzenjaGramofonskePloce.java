/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;
import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;

/**
 *
 * @author Ignjat
 */
public class SOUnosZaduzenjaGramofonskePloce {

    public SOUnosZaduzenjaGramofonskePloce() {
    }

    public ServerskiOdgovor unesiZaduzenje(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();

        Zaduzenje zaduzenje = (Zaduzenje) kz.getParametar();
        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.KREIRAJ_ZADUZENJE);
        rsb.otvoriKonekciju();


        so.setUspesno_neuspesno(rsb.dodajZaduzenje(zaduzenje));
                System.out.println("Usaoooooooooooooooooooooooo");


        rsb.zatvoriKonekciju();

        return so;
    }

}
