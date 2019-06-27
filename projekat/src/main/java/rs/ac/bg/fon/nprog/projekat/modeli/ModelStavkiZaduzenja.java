/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.modeli;

import rs.ac.bg.fon.nprog.projekat.domen.StavkaZaduzenja;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ignjat
 */
public class ModelStavkiZaduzenja extends AbstractTableModel {

    ArrayList<StavkaZaduzenja> stavke;
    String[] kolone = {"Ploca", "Broj Komada","Cena"};

    public ModelStavkiZaduzenja(ArrayList<StavkaZaduzenja> zaduzenja) {
        this.stavke = zaduzenja;
    }

    public ModelStavkiZaduzenja() {
        stavke=new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return stavke.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaZaduzenja stavka = stavke.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return stavka.getPloca();
            case 1:
                return stavka.getKolicina();
            case 2:
                return stavka.getVrednost();
            default:
                return "Greska";

        }

    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    

    public ArrayList<StavkaZaduzenja> getStavke() {
        return stavke;
    }

    public void setStavke(ArrayList<StavkaZaduzenja> stavke) {
        this.stavke = stavke;
    } 
    public void dodajStavku(StavkaZaduzenja stavke) {
        this.stavke.add(stavke);
    }
    
    public String[] getKolone() {
        return kolone;
    }

    public void setKolone(String[] kolone) {
        this.kolone = kolone;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public StavkaZaduzenja vratiStavku(int row){
    
        return stavke.get(row); }
    public void izbrisiStavku(int row){
        stavke.remove(row);
        
    
    }
    
   
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return false;

    }

//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//
//        StavkaZaduzenja stavka = stavke.get(rowIndex);
//
//        switch (columnIndex) {
//
//            case 0:
//                stavka.getPloca());
//                return;
//            case 1:
//                stavka.getKlijent().setIdKlijenta(Integer.parseInt((String) aValue));
//                return;
//
//          
//
//        }
//    }

}
