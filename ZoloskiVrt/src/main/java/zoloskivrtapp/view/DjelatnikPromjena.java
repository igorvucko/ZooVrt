/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zoloskivrtapp.view;

import javax.swing.JList;
import javax.swing.JOptionPane;
import zoloskivrtapp.controller.ObradaDjelatnik;
import zoloskivrtapp.model.Djelatnik;
import zoloskivrtapp.util.Alati;
import zoloskivrtapp.util.ZooException;

/**
 *
 * @author Igor
 */
public class DjelatnikPromjena extends javax.swing.JFrame {
    
    private ObradaDjelatnik obradaD;
    private Djelatnik d;
    private JList<Djelatnik> lista;

    /**
     * Creates new form DjelatnikPromjena
     */
    public DjelatnikPromjena() {
        initComponents();
        obradaD = new ObradaDjelatnik();
        setTitle("Djelatnici");
    }

    public DjelatnikPromjena(String ime,String prezime, String iban,Djelatnik s, JList<Djelatnik> lista){
        initComponents();
        obradaD = new ObradaDjelatnik();
        setTitle("Djelatnici");
        napuniView(ime,prezime,iban);
        d = s;
        this.lista = lista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIBAN = new javax.swing.JTextField();
        btnIBAN = new javax.swing.JButton();
        btnPromjenaD = new javax.swing.JButton();
        lblUspjeh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime");

        txtI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIActionPerformed(evt);
            }
        });

        jLabel2.setText("Prezime");

        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-add-12 (1).png"))); // NOI18N

        jLabel3.setText("IBAN");

        btnIBAN.setText("💳");
        btnIBAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIBANActionPerformed(evt);
            }
        });

        btnPromjenaD.setBackground(new java.awt.Color(255, 255, 0));
        btnPromjenaD.setText("Promjena");
        btnPromjenaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaDActionPerformed(evt);
            }
        });

        lblUspjeh.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtIBAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIBAN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(121, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(lblUspjeh)))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnPromjenaD, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIBAN))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnPromjenaD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUspjeh)
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIActionPerformed

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPActionPerformed

    private void btnIBANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIBANActionPerformed
        txtIBAN.setText(Alati.generirajIBAN());
    }//GEN-LAST:event_btnIBANActionPerformed

    private void btnPromjenaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaDActionPerformed
        napuniModel();
    }//GEN-LAST:event_btnPromjenaDActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIBAN;
    private javax.swing.JButton btnPromjenaD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblUspjeh;
    private javax.swing.JTextField txtI;
    private javax.swing.JTextField txtIBAN;
    private javax.swing.JTextField txtP;
    // End of variables declaration//GEN-END:variables

    private void napuniModel() {
        obradaD.setEntitet(d);
        var s = obradaD.getEntitet();
        s.setIme(txtI.getText());
        s.setPrezime(txtP.getText());
        s.setIBAN(txtIBAN.getText());
         try {
            obradaD.update();
            lblUspjeh.setText("Djelatnik uspješno promijenjen!");
            lista.repaint();
        } catch (ZooException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        
    }

    void prikazi() {
        setVisible(true);
    }

    private void napuniView(String ime, String prezime, String iban) {
        txtI.setText(ime);
        txtP.setText(prezime);
        txtIBAN.setText(iban);
   }
}
