/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;
import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;

/**
 *
 * @author Ignjat
 */
public class SOPretragaZaduzenja {

    public SOPretragaZaduzenja() {
    }
    
    public ServerskiOdgovor vratiZaduzenja(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();
        Klijent kl=(Klijent) kz.getParametar();
        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.PRONADJI_ZADUZENJE);
        rsb.otvoriKonekciju();

        
       so.setOdgovor( rsb.pronadjiZaduzenja(kl));

        rsb.zatvoriKonekciju();

        return so;
    }
    
}
