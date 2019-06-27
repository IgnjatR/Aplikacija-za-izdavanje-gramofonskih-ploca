/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import  rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import  rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import  rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import  rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import  rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;
import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;


/**
 *
 * @author Ignjat
 */
public class SOBrisanjeZaduzenja {

    public SOBrisanjeZaduzenja() {
    }
    
    public ServerskiOdgovor izbrisiZaduzenje(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();

        System.out.println("Usaoooooooooooooooooooooooo");
        Zaduzenje zaduzenje = (Zaduzenje) kz.getParametar();
        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.IZBRISI_ZADUZENJE);
        rsb.otvoriKonekciju();

        
        so.setUspesno_neuspesno(rsb.izbrisiZaduzenje(zaduzenje));

        rsb.zatvoriKonekciju();

        return so;
    }
    
}
