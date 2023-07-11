/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zoloskivrtapp.view;

import zoloskivrtapp.controller.ObradaDjelatnik;

/**
 *
 * @author Igor
 */
public class DjelatnikPregled extends javax.swing.JFrame {
    
    private ObradaDjelatnik obradaD;

    /**
     * Creates new form DjelatnikPregled
     */
    public DjelatnikPregled() {
        initComponents();
        obradaD = new ObradaDjelatnik();
         setTitle("Pregled djelatnika");
        
    }
    
    public DjelatnikPregled(String ime, String prezime) {
        initComponents();
        obradaD = new ObradaDjelatnik();
        napuniView(ime,prezime);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblI = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/djelatnik.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 221, 220));

        jLabel2.setText("IME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        jLabel3.setText("PREZIME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, -1, -1));

        lblI.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblI.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(lblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, 158, -1));

        lblP.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblP.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(lblP, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 112, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblI;
    private javax.swing.JLabel lblP;
    // End of variables declaration//GEN-END:variables

    private void napuniView(String ime, String prezime) {
        lblI.setText(ime.toUpperCase());
        lblP.setText(prezime.toUpperCase());
    }

    void prikazi() {
        setVisible(true);
    }
}
