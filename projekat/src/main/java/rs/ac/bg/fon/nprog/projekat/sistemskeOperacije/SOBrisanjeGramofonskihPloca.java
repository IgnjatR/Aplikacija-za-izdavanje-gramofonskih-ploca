/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import  rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import  rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;
import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;

/**
 *
 * @author Ignjat
 */
public class SOBrisanjeGramofonskihPloca {

    public SOBrisanjeGramofonskihPloca() {
    }
    
    public ServerskiOdgovor izbrisi(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();

        System.out.println("Usaoooooooooooooooooooooooo");
        Ploca ploca = (Ploca) kz.getParametar();
        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.IZBRISI_PLOCU);
        rsb.otvoriKonekciju();

        
        so.setUspesno_neuspesno(rsb.izbrisiPlocu(ploca));

        rsb.zatvoriKonekciju();

        return so;
    }
    
}
