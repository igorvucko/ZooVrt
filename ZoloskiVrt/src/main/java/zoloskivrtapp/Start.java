/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zoloskivrtapp;

import javax.swing.UIManager;
import zoloskivrtapp.util.HibernateUtil;
import zoloskivrtapp.util.PocetniInsert;
import zoloskivrtapp.view.ProzorLogin;

/**
 *
 * @author Igor
 */
public class Start {

    public static void main(String[] args) {
       
       try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
       new PocetniInsert();
       new ProzorLogin().setVisible(true);
    }
}

