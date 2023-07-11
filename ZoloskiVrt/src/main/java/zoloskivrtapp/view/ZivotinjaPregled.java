/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zoloskivrtapp.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import zoloskivrtapp.controller.ObradaZivotinja;
import zoloskivrtapp.model.Djelatnik;


/**
 *
 * @author Igor
 */
public class ZivotinjaPregled extends javax.swing.JFrame {

    private ObradaZivotinja obradaZ;

    /**
     * Creates new form zivotinjaPregled
     */
    public ZivotinjaPregled() {
        initComponents();
        lblDJ.setVisible(false);
        lblSM.setVisible(false);
    }
    
     public ZivotinjaPregled(String ime, String zivotinjskaVrsta,String vrsta,Djelatnik djelatnik,LocalDate datumR,LocalDate datumD,LocalDate datumS) {
        initComponents();
        obradaZ = new ObradaZivotinja();
        lblDJ.setVisible(false);
        lblSM.setVisible(false);
        lblDjelatnik.setVisible(false);
        dpSmrt.setVisible(false);
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
        DatePickerSettings dD = new DatePickerSettings(new Locale("hr","HR"));
        dD.setFormatForDatesCommonEra("dd. MM. YYYY.");
        DatePickerSettings dS = new DatePickerSettings(new Locale("hr","HR"));
        dS.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dpRodjenje.setSettings(dps);
        dpDolazak.setSettings(dD);
        dpSmrt.setSettings(dS);
        Date dateS = null;
        if (datumS != null) {
            dateS = Date.from(datumS.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }
        napuniView(ime,zivotinjskaVrsta,vrsta,djelatnik,Date.from(datumR.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()),Date.from(datumD.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()),dateS);
    }
   
    public void napuniView(String ime, String zivotinjskaVrsta,String vrsta,Djelatnik djelatnik,Date datumR,Date datumD,Date datumS) {
       lblName.setText(ime.toUpperCase());
       lblZivVrsta.setText(zivotinjskaVrsta.toUpperCase());
       lblVrsta.setText(vrsta.toUpperCase());
       lblDjelatnik.setText(djelatnik.getIme().toUpperCase() + " " + djelatnik.getPrezime().toUpperCase());
       dpRodjenje.setDate(datumR.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
       dpDolazak.setDate(datumD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
      if(datumS!=null) {
          dpSmrt.setDate(datumS.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
      }else {
          dpSmrt.setDate(null);
      }
    }
    
    public void prikazi() {
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnViseInfo = new javax.swing.JButton();
        lblDJ = new javax.swing.JLabel();
        lblSM = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblZivVrsta = new javax.swing.JLabel();
        lblVrsta = new javax.swing.JLabel();
        lblProstorija = new javax.swing.JLabel();
        lblDjelatnik = new javax.swing.JLabel();
        dpDolazak = new com.github.lgooddatepicker.components.DatePicker();
        dpRodjenje = new com.github.lgooddatepicker.components.DatePicker();
        dpSmrt = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pregled životinja");

        jLabel2.setText("IME:");

        jLabel3.setText("ŽIVOTINJSKA VRSTA:");

        jLabel4.setText("VRSTA:");

        jLabel5.setText("DATUM ROĐENJA:");

        jLabel6.setText("DATUM DOLASKA:");

        btnViseInfo.setText("Više informacija");
        btnViseInfo.setBackground(new java.awt.Color(255, 255, 0));
        btnViseInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViseInfoActionPerformed(evt);
            }
        });

        lblDJ.setText("DJELATNIK:");

        lblSM.setText("DATUM SMRTI:");

        lblName.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 255));

        lblZivVrsta.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblZivVrsta.setForeground(new java.awt.Color(51, 51, 255));

        lblVrsta.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblVrsta.setForeground(new java.awt.Color(21, 21, 255));

        lblProstorija.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblProstorija.setForeground(new java.awt.Color(21, 21, 255));

        lblDjelatnik.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        lblDjelatnik.setForeground(new java.awt.Color(21, 21, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpSmrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDjelatnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblZivVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpRodjenje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnViseInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(lblProstorija, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblZivVrsta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblVrsta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dpRodjenje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dpDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViseInfo)
                .addGap(18, 18, 18)
                .addComponent(lblProstorija)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDJ)
                    .addComponent(lblDjelatnik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSM)
                    .addComponent(dpSmrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViseInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViseInfoActionPerformed
        lblDJ.setVisible(true);
        lblSM.setVisible(true);
        lblDjelatnik.setVisible(true);
        lblProstorija.setVisible(true);
        dpSmrt.setVisible(true);
    }//GEN-LAST:event_btnViseInfoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViseInfo;
    private com.github.lgooddatepicker.components.DatePicker dpDolazak;
    private com.github.lgooddatepicker.components.DatePicker dpRodjenje;
    private com.github.lgooddatepicker.components.DatePicker dpSmrt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDJ;
    private javax.swing.JLabel lblDjelatnik;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProstorija;
    private javax.swing.JLabel lblSM;
    private javax.swing.JLabel lblVrsta;
    private javax.swing.JLabel lblZivVrsta;
    // End of variables declaration//GEN-END:variables
}
