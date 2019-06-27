/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.sistemskeOperacije;

import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;
import rs.ac.bg.fon.nprog.projekat.baza.RadSaBazom;
import rs.ac.bg.fon.nprog.projekat.domen.Nalog;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.ServerskiOdgovor;

/**
 *
 * @author Ignjat
 */
public class SOPrijaviZaposlenog {

    public SOPrijaviZaposlenog() {
    }
    
    
    public  ServerskiOdgovor prijaviZaposlenog(KlijentskiZahtev kz){
    
        RadSaBazom rsb=new RadSaBazom();
    
      System.out.println("Usaoooooooooooooooooooooooo");
            Nalog nalog=(Nalog) kz.getParametar();
             ServerskiOdgovor so=new ServerskiOdgovor();
                so.setOperacija(Operacije.LOG_IN);
            rsb.otvoriKonekciju();
            
             nalog=rsb.proveriNalog(nalog.getUsername(), nalog.getPassword());
            if (nalog==null)
                so.setUspesno_neuspesno(false);
            else{
            so.setUspesno_neuspesno(true);
            so.setOdgovor(nalog);
            }
            
            
            
            
            
        rsb.zatvoriKonekciju();

            return so;
    }
    
    
    
}
