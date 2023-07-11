/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.util;

import com.github.javafaker.Faker;
import zoloskivrtapp.model.Djelatnik;
import zoloskivrtapp.model.Zivotinja;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Igor
 */
public class PocetniInsert {
    
    private Faker faker;
    private List<Zivotinja> zivotinje;
    private List<Djelatnik> djelatnici;
    private Session session;
    
     public static void izvedi() {
            new PocetniInsert();
        }
    
    public PocetniInsert() {
        faker = new Faker();
        zivotinje = new ArrayList<>();
        djelatnici = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajDjelatnike();
        kreirajZivotinje();
        
        session.getTransaction().commit();
    }

    private void kreirajDjelatnike() {
        Djelatnik d;
        for(int i=0;i<10;i++) {
            d = new Djelatnik();
            d.setIBAN(faker.finance().iban());
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            session.persist(d);
            djelatnici.add(d);
        }
        
    }

    private void kreirajZivotinje() {
        Zivotinja z;
        for(int i=0;i<10;i++) {
            z = new Zivotinja();
            z.setZivotinjskaVrsta(faker.leagueOfLegends().champion());
            z.setVrsta(faker.leagueOfLegends().rank());
            z.setIme(faker.animal().name());
            z.setDatumRodenja(faker.date().birthday());
            z.setDatumDolaska(faker.date().birthday());
            z.setDatumSmrti(faker.date().birthday());
            z.setDjelatnik(djelatnici.get(faker.number().numberBetween(0, 10-1)));
            session.persist(z);
            zivotinje.add(z);
        }
    }
    
    
    
    
    
    
    
}
