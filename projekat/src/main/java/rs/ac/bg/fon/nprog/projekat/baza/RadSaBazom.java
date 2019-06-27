/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.baza;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.domen.Nalog;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.StavkaZaduzenja;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;
import rs.ac.bg.fon.nprog.projekat.kontroler.Kontroler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Ignjat
 */
public class RadSaBazom {

	private Connection konekcija;

	public void otvoriKonekciju() {

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			konekcija = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ploce", "root", "");
			konekcija.setAutoCommit(false);

		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
			;
		}

	}

	public void zatvoriKonekciju() {

		try {
			konekcija.close();
		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public ArrayList<Zaposleni> vratiZaposlene() {
		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
		try {

			String upit = "Select * from zaposleni";
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int idZaposlenog = rs.getInt(1);
				String jmbg = rs.getString(2);
				String imeZaposlenog = rs.getString(3);
				String prezimeZaposlenog = rs.getString(4);
				String emailZ = rs.getString(5);
				zaposleni.add(new Zaposleni(idZaposlenog, jmbg, imeZaposlenog, prezimeZaposlenog, emailZ));
			}
			st.close();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return zaposleni;

	}

	public Nalog proveriNalog(String username, String password) {
		try {

			String upit = "Select * from nalog where username='" + username + "' and password='" + password + "'";
			System.out.println(upit);

			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);

			if (rs.next()) {
				int sifraNaloga = rs.getInt(1);
				String passwordV = rs.getString(2);
				String usernameV = rs.getString(3);
				int idZaposlenog = rs.getInt(4);
				Zaposleni zaposleni = pronadjiZaposlenog(idZaposlenog);
				Nalog nalog = new Nalog(sifraNaloga, password, username);
				nalog.setZaposleni(zaposleni);
				return nalog;

			}
			return null;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return null;

	}

	public boolean proveriPlocu(String naziv, String autor) {
		try {

			String upit = "Select * from ploca where naziv='" + naziv + "' and autor='" + autor + "'";
			System.out.println(upit);

			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);

			if (rs.next()) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;

	}

	public void sacuvajIzmene() {

		try {
			konekcija.commit();
		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public boolean dodajPlocu(Ploca ploca) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String datum = dateFormat.format(ploca.getDatumIzdavanja());
		boolean vrati;
		if (proveriPlocu(ploca.getNaziv(), ploca.getAutor())) {
			return false;
		}

		String upit = "insert into ploca(autor,brojPesama,cenaIzdavanja,datumIzdavanja,naziv) values('"
				+ ploca.getAutor() + "','" + ploca.getBrojPesama() + "','" + ploca.getCenaIzdavanja() + "','" + datum
				+ "','" + ploca.getNaziv() + "')";
		System.out.println(upit);

		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}

	}

	public boolean izmeniPlocu(Ploca ploca) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String datum = dateFormat.format(ploca.getDatumIzdavanja());

		String upit = "UPDATE ploca SET autor = '" + ploca.getAutor() + "',naziv='" + ploca.getNaziv()
				+ "',cenaIzdavanja='" + ploca.getCenaIzdavanja().toString() + "',brojPesama='"
				+ String.valueOf(ploca.getBrojPesama()) + "',datumIzdavanja='" + datum + "' WHERE idPloce ="
				+ String.valueOf(ploca.getIdPloce());
		System.out.println(upit);
		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}

	}

	public Ploca pronadjiPlocu(String naziv, String autor) {
		Ploca ploca = null;
		try {

			String upit = "Select * from ploca where naziv='" + naziv + "' and autor='" + autor + "'";
			System.out.println(upit);
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);

			while (rs.next()) {
				int idPloce = rs.getInt(1);
				String autorP = rs.getString(2);
				Date datum = rs.getDate(3);
				int broj = rs.getInt(4);
				Double cena = rs.getDouble(5);
				String nazivP = rs.getString(6);
				ploca = new Ploca(idPloce, autorP, datum, broj, new BigDecimal(cena), nazivP);
			}

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return ploca;

	}

	public boolean izbrisiPlocu(Ploca ploca) {

		String upit = "DELETE FROM ploca WHERE idPloce='" + String.valueOf(ploca.getIdPloce()) + "'";
		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}

	}

	public ArrayList<Klijent> vratiKlijente() {
		ArrayList<Klijent> klijent = new ArrayList<>();
		try {

			String upit = "Select * from klijent";
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int idKlijenta = rs.getInt(1);
				String ime = rs.getString(2);
				String prezime = rs.getString(3);
				String telefon = rs.getString(4);
				String adresa = rs.getString(5);
				String email = rs.getString(6);
				klijent.add(new Klijent(idKlijenta, ime, prezime, telefon, adresa, email));
			}
			st.close();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return klijent;
	}

	public boolean dodajZaduzenje(Zaduzenje zaduzenje) {
		System.out.println("ovdeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String datum = dateFormat.format(zaduzenje.getDatum());
		// if (proveriPlocu(zaduzenje.getNaziv(), zaduzenje.getAutor())) {
		// return false;
		// }

		String upit = "insert into zaduzenje(idKlijenta,idZaposlenog,datum,ukupno)  values('"
				+ zaduzenje.getKlijent().getIdKlijenta() + "','" + zaduzenje.getZaposleni().getIdZaposlenog() + "','"
				+ datum + "','0')";
		System.out.println(upit);

		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit, Statement.RETURN_GENERATED_KEYS);
			ResultSet x = st.getGeneratedKeys();
			if (x.next()) {
				Kontroler.getInstance().setIdPoslednjegUnetogZaduzenja(x.getInt(1));
			}
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			System.out.println("neceeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}
	}

	public ArrayList<Zaduzenje> vratiZaduzenja() {
		ArrayList<Zaduzenje> zaduzenja = new ArrayList<>();
		try {

			String upit = "Select * from zaduzenje";
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int sifraZaduzenja = rs.getInt(1);
				int idKlijenta = rs.getInt(2);
				int idZaposlenog = rs.getInt(3);
				Date datum = rs.getDate(4);
				Double ukupno = rs.getDouble(5);
				Zaposleni zaposleni = pronadjiZaposlenog(idZaposlenog);
				Klijent klijent = pronadjiKlijenta(idKlijenta);

				zaduzenja.add(new Zaduzenje(sifraZaduzenja, datum, new BigDecimal(ukupno), zaposleni, klijent));
			}
			st.close();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return zaduzenja;
	}

	public ArrayList<Ploca> vratiPloce() {
		ArrayList<Ploca> ploce = new ArrayList<>();
		try {

			String upit = "Select * from ploca";
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int idPloce = rs.getInt(1);
				String autor = rs.getString(2);
				Date datumIzdavanja = rs.getDate(3);
				int brojpesama = rs.getInt(4);
				double cenaIzdavanja = rs.getDouble(5);
				String naziv = rs.getString(6);
				ploce.add(new Ploca(idPloce, autor, datumIzdavanja, brojpesama, new BigDecimal(cenaIzdavanja), naziv));
			}
			st.close();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return ploce;

	}

	public Zaposleni pronadjiZaposlenog(int id) {
		Zaposleni zaposleni = null;
		try {

			String upit = "Select * from zaposleni where idZaposlenog='" + id + "'";
			System.out.println(upit);
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);

			while (rs.next()) {
				int idZaposlenog = rs.getInt(1);
				String jmbg = rs.getString(2);
				String imeZaposlenog = rs.getString(3);
				String prezimeZaposlenog = rs.getString(4);
				String emailZ = rs.getString(5);
				zaposleni = new Zaposleni(idZaposlenog, jmbg, imeZaposlenog, prezimeZaposlenog, emailZ);
			}

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return zaposleni;

	}

	public Klijent pronadjiKlijenta(int id) {
		Klijent klijent = null;
		try {

			String upit = "Select * from klijent where idklijenta='" + id + "'";
			System.out.println(upit);
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int idKlijenta = rs.getInt(1);
				String ime = rs.getString(2);
				String prezime = rs.getString(3);
				String telefon = rs.getString(4);
				String adresa = rs.getString(5);
				String email = rs.getString(6);
				klijent = new Klijent(idKlijenta, ime, prezime, telefon, adresa, email);
			}

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}

		return klijent;

	}

	public boolean dodajStavkuZaduzenja(StavkaZaduzenja stavka) {

		// if (proveriPlocu(ploca.getNaziv(), ploca.getAutor())) {
		// return false;

		// }

		String upit = "insert into stavkazaduzenja(idZaposlenog,idKlijenta,idZaduzenja,kolicina,vrednost,idPloce) values('"
				+ stavka.getZaposleni().getIdZaposlenog() + "','" + stavka.getKlijent().getIdKlijenta() + "','"
				+ Kontroler.getInstance().getIdPoslednjegUnetogZaduzenja() + "','" + stavka.getKolicina() + "','"
				+ stavka.getVrednost().toString() + "','" + stavka.getPloca().getIdPloce() + "')";
		System.out.println(upit);

		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				osveziZaduzenje(stavka.getVrednost(), Kontroler.getInstance().getIdPoslednjegUnetogZaduzenja());

				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}

	}

	private void osveziZaduzenje(BigDecimal vrednost, int IDZaduzenja) {

		String upit = "UPDATE zaduzenje SET ukupno = ukupno + '" + vrednost.toString() + "' WHERE sifraZaduzenja ="
				+ String.valueOf(IDZaduzenja);
		System.out.println(upit);
		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);

		}

	}

	public ArrayList<Zaduzenje> pronadjiZaduzenja(Klijent kl) {
		ArrayList<Zaduzenje> zaduzenja = new ArrayList<>();
		try {

			String upit = "Select * from zaduzenje where idKlijenta='" + kl.getIdKlijenta() + "'";
			Statement st = (Statement) konekcija.createStatement();
			ResultSet rs = st.executeQuery(upit);
			while (rs.next()) {
				int sifraZaduzenja = rs.getInt(1);
				int idKlijenta = rs.getInt(2);
				int idZaposlenog = rs.getInt(3);
				Date datum = rs.getDate(4);
				Double ukupno = rs.getDouble(5);
				Zaposleni zaposleni = pronadjiZaposlenog(idZaposlenog);
				Klijent klijent = pronadjiKlijenta(idKlijenta);

				zaduzenja.add(new Zaduzenje(sifraZaduzenja, datum, new BigDecimal(ukupno), zaposleni, klijent));
			}
			st.close();

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println(zaduzenja);
		return zaduzenja;
	}

	public boolean izbrisiZaduzenje(Zaduzenje zaduzenje) {
		String upit = "DELETE FROM zaduzenje WHERE sifraZaduzenja='" + String.valueOf(zaduzenje.getSifraZaduzenja())
				+ "'";
		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}
	}

	public boolean izmeniZaduzenja(ArrayList<Zaduzenje> zaduzenja) {

		for (Zaduzenje zaduzenje : zaduzenja) {

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String datum = dateFormat.format(zaduzenje.getDatum());

			String upit = "UPDATE zaduzenje SET datum = '" + datum + "',ukupno='" + zaduzenje.getUkupno().toString()
					+ "',idKlijenta='" + zaduzenje.getKlijent().getIdKlijenta() + "',idZaposlenog='"
					+ zaduzenje.getZaposleni().getIdZaposlenog() + "' WHERE sifraZaduzenja ="
					+ String.valueOf(zaduzenje.getSifraZaduzenja());
			System.out.println(upit);
			Statement st;

			try {
				st = (Statement) konekcija.createStatement();
				int rez = st.executeUpdate(upit);
				System.out.println(rez);
				sacuvajIzmene();
				// if (rez == 1) {
				// return true;
				// }
				// return false;

			} catch (SQLException ex) {
				Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
				return false;

			}
		}
		return true;

	}

	public boolean prebaciUJSON() {

		ArrayList<Ploca> ploce = vratiPloce();
		try (FileWriter out = new FileWriter("ploce.json")) {

			Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();

			out.write(gson.toJson(ploce.toArray()));
			return true;
		} catch (IOException e) {
			return false;
		}

	}

	public boolean prebaciUPloce() {

		try (FileReader in = new FileReader("ploce.json")) {
			// knjige.removeAll(knjige);
			Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();

			List<Ploca> ploce = Arrays.asList(gson.fromJson(in, Ploca[].class));

			if (ploce.size()==0)
				return false;
			
			obrisiSvePloce();
			for (Ploca ploca : ploce)
				dodajPlocu(ploca);

			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean obrisiSvePloce() {
		String upit = "DELETE FROM ploca";
				
		Statement st;

		try {
			st = (Statement) konekcija.createStatement();
			int rez = st.executeUpdate(upit);
			System.out.println(rez);
			sacuvajIzmene();
			if (rez == 1) {
				return true;
			}
			return false;

		} catch (SQLException ex) {
			Logger.getLogger(RadSaBazom.class.getName()).log(Level.SEVERE, null, ex);
			return false;

		}

	}
}
