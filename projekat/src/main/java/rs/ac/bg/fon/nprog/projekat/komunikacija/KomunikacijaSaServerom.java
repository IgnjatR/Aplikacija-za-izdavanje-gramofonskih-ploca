/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.komunikacija;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.nprog.projekat.klaseZaKomunikaciju.KlijentskiZahtev;
import rs.ac.bg.fon.nprog.projekat.kontroler.Kontroler;

/**
 *
 * @author Ignjat
 */
public class KomunikacijaSaServerom {

    private static KomunikacijaSaServerom instance;
    private Socket so;

    public KomunikacijaSaServerom() {

    }

    public static KomunikacijaSaServerom getInstance() {
        if (instance == null) {
            instance = new KomunikacijaSaServerom();
        }
        return instance;

    }

    public boolean uspostaviKonekciju() throws IOException {

        so = new Socket("localhost", 9000);
        return true;

    }

    public void posaljiZahtev(KlijentskiZahtev kz) {
        try {
            ObjectOutputStream ous = new ObjectOutputStream(so.getOutputStream());
            ous.writeObject(kz);
            System.out.println("Uspeh");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(Kontroler.getInstance().getPocetnaForma(), "Aplikacija ne moze da se povezesa serverom", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public ServerskiOdgovor primiOdgovor(){
//        ServerskiOdgovor sodg=new ServerskiOdgovor();
//        try {
//            ObjectInputStream ois=new ObjectInputStream(so.getInputStream());
//            sodg=(ServerskiOdgovor) ois.readObject();
//        } catch (IOException ex) {
//            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return sodg;
//        
//    
//    
//    
//    }
    public Socket getSo() {
        return so;
    }

    public void setSo(Socket so) {
        this.so = so;
    }
}
