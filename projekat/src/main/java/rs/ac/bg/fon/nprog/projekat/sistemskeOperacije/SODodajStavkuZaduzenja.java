/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.StavkaZaduzenja;
import java.util.ArrayList;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;
import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;

/**
 *
 * @author Ignjat
 */
public class SODodajStavkuZaduzenja {

    public SODodajStavkuZaduzenja() {
    }
    
    public ServerskiOdgovor dodajStavkuZaduzenja(KlijentskiZahtev kz) {

        RadSaBazom rsb = new RadSaBazom();

        ArrayList<StavkaZaduzenja> stavke =  (ArrayList<StavkaZaduzenja>) kz.getParametar();
        System.out.println(stavke);
        ServerskiOdgovor so = new ServerskiOdgovor();
        so.setOperacija(Operacije.DODAJ_STAVKU_ZADUZENJA);
        rsb.otvoriKonekciju();

        for (StavkaZaduzenja stavka:stavke){
            
            so.setUspesno_neuspesno(rsb.dodajStavkuZaduzenja(stavka));
        }
        rsb.zatvoriKonekciju();
        

        return so;
    }
}
