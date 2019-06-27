/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.kontroler;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.domen.Nalog;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;
import rs.ac.bg.fon.nprog.projekat.forme.LoginForma;
import rs.ac.bg.fon.nprog.projekat.forme.PocetnaForma;
import rs.ac.bg.fon.nprog.projekat.forme.PretragaPloca;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import rs.ac.bg.fon.nprog.projekat.operacije.Operacije;
import rs.ac.bg.fon.nprog.projekat.sistemskeOperacije.*;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.*;

/**
 *
 * @author Ignjat
 */
public class Kontroler {

	private static Kontroler instance;
	private PocetnaForma pocetnaForma;
	private LoginForma loginForma;
	private PretragaPloca pretragaForma;
	private Nalog prijavljeniZaposleni;
	private ImageIcon icon;
	private int idPoslednjegUnetogZaduzenja;

	public int getIdPoslednjegUnetogZaduzenja() {
		return idPoslednjegUnetogZaduzenja;
	}

	public void setIdPoslednjegUnetogZaduzenja(int idPoslednjegUnetogZaduzenja) {
		this.idPoslednjegUnetogZaduzenja = idPoslednjegUnetogZaduzenja;
	}

	private Kontroler() {
		icon = new ImageIcon("src/main/java/rs/ac/bg/fon/nprog/projekat/images/success.png");

	}

	public static Kontroler getInstance() {

		if (instance == null) {
			instance = new Kontroler();
		}
		return instance;

	}

	public PocetnaForma getPocetnaForma() {
		return pocetnaForma;
	}

	// public void setPocetnaForma(PocetnaForma pocetnaForma) {
	// this.pocetnaForma = pocetnaForma;
	// }
	public LoginForma getLoginForma() {
		return loginForma;
	}

	public void setLoginForma(LoginForma loginForma) {
		this.loginForma = loginForma;
	}

	public void otvoriPocetnu() {
		pocetnaForma = new PocetnaForma();
		pocetnaForma.setVisible(true);

	}

	public void zatvoriLogin() {

		loginForma.setVisible(false);

	}

	public void ulogujKorisnika(KlijentskiZahtev kz) {

		ServerskiOdgovor so = null;

		if (kz.getOperacija() == Operacije.LOG_IN) {

			SOPrijaviZaposlenog prijavi = new SOPrijaviZaposlenog();

			so = prijavi.prijaviZaposlenog(kz);

		}

		if (so.isUspesno_neuspesno() == true) {
			prijavljeniZaposleni = (Nalog) so.getOdgovor();
			JOptionPane.showMessageDialog(loginForma, "Uspesno ste se prijavili", "Uspeh",
					JOptionPane.INFORMATION_MESSAGE, icon);

			otvoriPocetnu();
			zatvoriLogin();

		} else {
			JOptionPane.showMessageDialog(loginForma, "Neispravni podaci", "Greska", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void dodajPlocu(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;

		if (kz.getOperacija() == Operacije.DODAJ_PLOCU) {

			SOUnosNoveGramofonskePloce unos = new SOUnosNoveGramofonskePloce();
			so = unos.unesiPlocu(kz);

		}

		if (so.isUspesno_neuspesno() == true) {
			JOptionPane.showMessageDialog(loginForma, "Uspesno kreirana ploca", "Uspeh",
					JOptionPane.INFORMATION_MESSAGE, icon);
		} else {
			JOptionPane.showMessageDialog(loginForma, "Neuspesno kreirana ploca", "Greska", JOptionPane.ERROR_MESSAGE);
		}

	}

	public Ploca pretraziPlocu(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.PRETRAZI_PLOCE) {

			SOPretragaGramofonskihPloca pretraga = new SOPretragaGramofonskihPloca();
			so = pretraga.nadjiPlocu(kz);

		}

		if (so.getOperacija() == Operacije.DODAJ_PLOCU) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			return (Ploca) so.getOdgovor();

		}

		return null;
	}

	public PretragaPloca getPretragaForma() {
		return pretragaForma;
	}

	public void setPretragaForma(PretragaPloca pretragaForma) {
		this.pretragaForma = pretragaForma;
	}

	public void izmeniPlocu(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.IZMENI_PLOCU) {

			SOIzmenaPodatakaOGramofonskojPloci pretraga = new SOIzmenaPodatakaOGramofonskojPloci();
			so = pretraga.izmeniplocu(kz);

		}

		if (so.getOperacija() == Operacije.IZMENI_PLOCU) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			if (so.isUspesno_neuspesno() == true) {
				JOptionPane.showMessageDialog(loginForma, "Uspesno izmenjena ploca", "Uspeh",
						JOptionPane.INFORMATION_MESSAGE, icon);
			} else {
				JOptionPane.showMessageDialog(loginForma, "Neuspesno izmenjena ploca", "Greska",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void izbrisiPlocu(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.IZBRISI_PLOCU) {

			SOBrisanjeGramofonskihPloca brisanje = new SOBrisanjeGramofonskihPloca();
			so = brisanje.izbrisi(kz);

		}

		if (so.getOperacija() == Operacije.IZBRISI_PLOCU) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			if (so.isUspesno_neuspesno() == true) {
				JOptionPane.showMessageDialog(loginForma, "Uspesno izbrisana ploca", "Uspeh",
						JOptionPane.INFORMATION_MESSAGE, icon);
			} else {
				JOptionPane.showMessageDialog(loginForma, "Neuspesno izbrisana ploca", "Greska",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public ArrayList<Klijent> vratiSveKlijente() {

		KlijentskiZahtev kz = new KlijentskiZahtev();
		kz.setOperacija(Operacije.VRATI_SVE_KLIJENTE);

		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.VRATI_SVE_KLIJENTE) {

			SOVratiSveKlijente klijenti = new SOVratiSveKlijente();
			so = klijenti.vratiKlijente(kz);

		}

		if (so.getOperacija() == Operacije.VRATI_SVE_KLIJENTE) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			return (ArrayList<Klijent>) so.getOdgovor();

		}

		return null;
	}

	public ArrayList<Zaposleni> vratiSveZaposlene() {

		KlijentskiZahtev kz = new KlijentskiZahtev();
		kz.setOperacija(Operacije.VRATI_SVE_ZAPOSLENE);
		ServerskiOdgovor so = null;

		if (kz.getOperacija() == Operacije.VRATI_SVE_ZAPOSLENE) {

			SOVratiSveZaposlene zaposleni = new SOVratiSveZaposlene();
			so = zaposleni.vratiZaposlene(kz);

		}
		if (so.getOperacija() == Operacije.VRATI_SVE_ZAPOSLENE) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			return (ArrayList<Zaposleni>) so.getOdgovor();

		}

		return null;
	}

	public void kreirajZaduzenje(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.KREIRAJ_ZADUZENJE) {

			SOUnosZaduzenjaGramofonskePloce zaduzenje = new SOUnosZaduzenjaGramofonskePloce();
			so = zaduzenje.unesiZaduzenje(kz);

		}

		if (so.isUspesno_neuspesno() == true) {
			JOptionPane.showMessageDialog(loginForma, "Uspesno kreirano zaduzenje", "Uspeh",
					JOptionPane.INFORMATION_MESSAGE, icon);
		} else {
			JOptionPane.showMessageDialog(loginForma, "Neuspesno kreirano zaduzenje ", "Greska",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public ArrayList<Zaduzenje> vratiSvaZaduzenja() {

		KlijentskiZahtev kz = new KlijentskiZahtev();
		kz.setOperacija(Operacije.VRATI_SVA_ZADUZENJA);
		ServerskiOdgovor so = null;

		if (kz.getOperacija() == Operacije.VRATI_SVA_ZADUZENJA) {

			SOVratiSvaZaduzenja zaduzenje = new SOVratiSvaZaduzenja();
			so = zaduzenje.vratiZaduzenja(kz);

		}

		if (so.getOperacija() == Operacije.VRATI_SVA_ZADUZENJA) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			return (ArrayList<Zaduzenje>) so.getOdgovor();

		}

		return null;
	}

	public ArrayList<Ploca> vratiSvePloce() {

		KlijentskiZahtev kz = new KlijentskiZahtev();
		kz.setOperacija(Operacije.VRATI_SVE_PLOCE);
		ServerskiOdgovor so = null;

		if (kz.getOperacija() == Operacije.VRATI_SVE_PLOCE) {

			SOVratiSvePloce zaduzenje = new SOVratiSvePloce();
			so = zaduzenje.vratiPloce(kz);

		}

		if (so.getOperacija() == Operacije.VRATI_SVE_PLOCE) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			return (ArrayList<Ploca>) so.getOdgovor();

		}

		return null;
	}

	public void dodajStavkuZaduzenja(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.DODAJ_STAVKU_ZADUZENJA) {

			SODodajStavkuZaduzenja stavka = new SODodajStavkuZaduzenja();
			so = stavka.dodajStavkuZaduzenja(kz);

		}

		if (so.getOperacija() == Operacije.DODAJ_STAVKU_ZADUZENJA) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			if (so.isUspesno_neuspesno() == true) {
				JOptionPane.showMessageDialog(loginForma, "Uspesno dodate stavke zaduzenja", "Uspeh",
						JOptionPane.INFORMATION_MESSAGE, icon);
			} else {
				JOptionPane.showMessageDialog(loginForma, "Neuspesno dodate stavke zaduzenja ", "Greska",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public ArrayList<Zaduzenje> pronadjiZaduzenja(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.PRONADJI_ZADUZENJE) {

			SOPretragaZaduzenja zaduzenja = new SOPretragaZaduzenja();
			so = zaduzenja.vratiZaduzenja(kz);

		}

		if (so.getOperacija() == Operacije.PRONADJI_ZADUZENJE) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			System.out.println("Kontoleeeeeeeeeeeeeeeeeeer" + (ArrayList<Zaduzenje>) so.getOdgovor());
			return (ArrayList<Zaduzenje>) so.getOdgovor();

		}

		return null;

	}

	public void izbrisiZaduzenje(KlijentskiZahtev kz) {
		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.IZBRISI_ZADUZENJE) {

			SOBrisanjeZaduzenja zaduzenje = new SOBrisanjeZaduzenja();
			so = zaduzenje.izbrisiZaduzenje(kz);

		}
		if (so.getOperacija() == Operacije.IZBRISI_ZADUZENJE) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			if (so.isUspesno_neuspesno() == true) {
				JOptionPane.showMessageDialog(loginForma, "Uspesno izbrisano zaduzenje", "Uspeh",
						JOptionPane.INFORMATION_MESSAGE, icon);
			} else {
				JOptionPane.showMessageDialog(loginForma, "Neuspesno izbrisano zaduzenje", "Greska",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void izmeniZaduzenja(KlijentskiZahtev kz) {

		ServerskiOdgovor so = null;
		if (kz.getOperacija() == Operacije.IZMENI_ZADUZENJA) {

			SOIzmenaPodatakaOZaduzenju zaduzenja = new SOIzmenaPodatakaOZaduzenju();
			so = zaduzenja.izmeniZaduzenja(kz);

		}

		if (so.getOperacija() == Operacije.IZMENI_ZADUZENJA) {
			System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeee");

			if (so.isUspesno_neuspesno() == true) {
				JOptionPane.showMessageDialog(loginForma, "Uspesno izmenjena ploca", "Uspeh",
						JOptionPane.INFORMATION_MESSAGE, icon);
			} else {
				JOptionPane.showMessageDialog(loginForma, "Neuspesno izmenjena ploca", "Greska",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public Nalog getPrijavljeniZaposleni() {
		return prijavljeniZaposleni;
	}

	public void setPrijavljeniZaposleni(Nalog prijavljeniZaposleni) {
		this.prijavljeniZaposleni = prijavljeniZaposleni;
	}

	public void ploceUJSON() {

		SOPloceUJSON json = new SOPloceUJSON();
		if (json.prebaciPloceUJSON())
			JOptionPane.showMessageDialog(loginForma, "Uspesno serijalizpvane ploce u JSON format", "Uspeh",
					JOptionPane.INFORMATION_MESSAGE, icon);
		else
			JOptionPane.showMessageDialog(loginForma, "Neuspesno serijalizpvane ploce u JSON format", "Greska",
					JOptionPane.ERROR_MESSAGE);

	}

	public void JSONUPloce() {

		SOJSONUPloce json = new SOJSONUPloce();
		if (json.prebaciJSONUPloce())
			JOptionPane.showMessageDialog(loginForma, "Uspesno serijalizpvane ploce u JSON format", "Uspeh",
					JOptionPane.INFORMATION_MESSAGE, icon);
		else
			JOptionPane.showMessageDialog(loginForma, "Neuspesno serijalizpvane ploce u JSON format", "Greska",
					JOptionPane.ERROR_MESSAGE);

	}

}
