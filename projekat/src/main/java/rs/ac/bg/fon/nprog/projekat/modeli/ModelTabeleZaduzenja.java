/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.modeli;

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
public class ModelTabeleZaduzenja extends AbstractTableModel {

    ArrayList<Zaduzenje> zaduzenja;
    String[] kolone = {"Sifra zaduzenja", "ID klijenta", "ID zaposlenog", "Datum", "Ukupna vrednost zaduzenja"};

    public ModelTabeleZaduzenja(ArrayList<Zaduzenje> zaduzenja) {
        this.zaduzenja = zaduzenja;
    }

    @Override
    public int getRowCount() {
        return zaduzenja.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zaduzenje zad = zaduzenja.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return zad.getSifraZaduzenja();
            case 1:
                return zad.getKlijent().getIdKlijenta();
            case 2:
                return zad.getZaposleni().getIdZaposlenog();
            case 3:
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                return format.format(zad.getDatum());
            case 4:
                return zad.getUkupno().setScale(2, RoundingMode.CEILING);
            default:
                return "Greska";

        }

    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public ArrayList<Zaduzenje> getZaduzenja() {
        return zaduzenja;
    }

    public void setZaduzenja(ArrayList<Zaduzenje> zaduzenja) {
        this.zaduzenja = zaduzenja;
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

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return false;
        }
        return true;

    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Zaduzenje zad = zaduzenja.get(rowIndex);

        switch (columnIndex) {

            case 0:
                zad.setSifraZaduzenja(Integer.parseInt((String) aValue));
                return;
            case 1:
                zad.getKlijent().setIdKlijenta(Integer.parseInt((String) aValue));
                return;

            case 2:
                zad.getZaposleni().setIdZaposlenog((int) aValue);
                return;

            case 3: {
                try {
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                    Date datum = format.parse((String) aValue);
                    zad.setDatum(datum);
                } catch (ParseException ex) {
                    Logger.getLogger(ModelTabeleZaduzenja.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return;

            case 4:
                zad.setUkupno(new BigDecimal(Double.parseDouble((String) aValue)));
                return;

        }
    }

}
