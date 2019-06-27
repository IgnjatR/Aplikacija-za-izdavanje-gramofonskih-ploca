/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.nprog.projekat.forme;

import rs.ac.bg.fon.nprog.projekat.domen.Klijent;
import rs.ac.bg.fon.nprog.projekat.domen.Ploca;
import rs.ac.bg.fon.nprog.projekat.domen.StavkaZaduzenja;
import rs.ac.bg.fon.nprog.projekat.domen.Zaduzenje;
import rs.ac.bg.fon.nprog.projekat.domen.Zaposleni;
import rs.ac.bg.fon.nprog.projekat.kontroler.Kontroler;

import static java.awt.image.ImageObserver.HEIGHT;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Ignjat
 */
public class DodajStavkeZaduzenja extends javax.swing.JFrame {

    /**
     * Creates new form DodajStavkeZaduzenja
     */
    public DodajStavkeZaduzenja() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        popuniListe();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPloce = new javax.swing.JComboBox<>();
        cmbZaduzenja = new javax.swing.JComboBox<>();
        eBrojPloca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCena = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnIZracunajCenu = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eBrojPloca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eBrojPlocaKeyTyped(evt);
            }
        });

        jLabel1.setText("Broj ploca:");

        jLabel3.setText("Ploca:");

        jLabel4.setText("Zaduzenje:");

        jLabel2.setText("Cena stavke :");

        btnSave.setText("Sacuvaj stavku");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnIZracunajCenu.setText("Izracunaj cenu");
        btnIZracunajCenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIZracunajCenuActionPerformed(evt);
            }
        });

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(eBrojPloca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPloce, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbZaduzenja, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIZracunajCenu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCena, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbZaduzenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPloce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(eBrojPloca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblCena, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIZracunajCenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eBrojPlocaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eBrojPlocaKeyTyped


    }//GEN-LAST:event_eBrojPlocaKeyTyped

    private void btnIZracunajCenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIZracunajCenuActionPerformed
        try {
            Ploca ploca = (Ploca) cmbPloce.getSelectedItem();
            BigDecimal cena = new BigDecimal(Integer.parseInt(eBrojPloca.getText())).multiply(ploca.getCenaIzdavanja());
            lblCena.setText(cena.setScale(2, RoundingMode.CEILING).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Neispravan broj ploca", "Greska", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnIZracunajCenuActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Ploca ploca = (Ploca) cmbPloce.getSelectedItem();
            int kolicina = Integer.parseInt(eBrojPloca.getText());
            BigDecimal cena = new BigDecimal(kolicina).multiply(ploca.getCenaIzdavanja()).setScale(2, RoundingMode.CEILING);
            Zaduzenje zaduzenje = (Zaduzenje) cmbZaduzenja.getSelectedItem();
            StavkaZaduzenja stavka = new StavkaZaduzenja();
            stavka.setKlijent(zaduzenje.getKlijent());
            stavka.setZaduzenje(zaduzenje);
            stavka.setZaposleni(zaduzenje.getZaposleni());
            stavka.setKolicina(kolicina);
            stavka.setPloca(ploca);
            stavka.setVrednost(cena);

//            KlijentskiZahtev kz = new KlijentskiZahtev(operacije.Operacije.DODAJ_STAVKU_ZADUZENJA, stavka);
//            kontroler.Kontroler.getInstance().dodajStavkuZaduzenja(kz);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Neispravan broj ploca", "Greska", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DodajStavkeZaduzenja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajStavkeZaduzenja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajStavkeZaduzenja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajStavkeZaduzenja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajStavkeZaduzenja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIZracunajCenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Ploca> cmbPloce;
    private javax.swing.JComboBox<Zaduzenje> cmbZaduzenja;
    private javax.swing.JTextField eBrojPloca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblID;
    // End of variables declaration//GEN-END:variables

    private void popuniListe() {
        lblID.setText("Vas ID je : " + Kontroler.getInstance().getPrijavljeniZaposleni().getSifraNaloga());

        ArrayList<Zaduzenje> zaduzenja = Kontroler.getInstance().vratiSvaZaduzenja();
        ArrayList<Ploca> ploce = Kontroler.getInstance().vratiSvePloce();
        cmbZaduzenja.setModel(new DefaultComboBoxModel(zaduzenja.toArray()));
        cmbPloce.setModel(new DefaultComboBoxModel(ploce.toArray()));

    }
}










