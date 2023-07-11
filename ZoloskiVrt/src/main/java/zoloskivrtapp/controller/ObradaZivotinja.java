/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.controller;

import java.util.List;
import zoloskivrtapp.model.Zivotinja;
import zoloskivrtapp.util.ZooException;

/**
 *
 * @author Igor
 */
public class ObradaZivotinja extends Obrada<Zivotinja>{
    

    @Override
    public List<Zivotinja> read() {
        return session.createQuery("from Zivotinja order by vrsta, ime",Zivotinja.class).list();

    }
    
    public List<Zivotinja> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Zivotinja where concat(vrsta,' ',ime,' ',zivotinjskaVrsta,vrsta) like :uvjet order by vrsta, ime ", Zivotinja.class).
                setParameter("uvjet", uvjet).setMaxResults(20).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
          kontrolaPopunjenaPolja();
          kontrolaIme();
          kontrolaVrsta();
          kontrolaDatum();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
        kontrolaPopunjenaPolja();
          kontrolaIme();
          kontrolaVrsta();
          kontrolaDatum();
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
         if(entitet.getDatumSmrti()==null){
            
            StringBuilder sb = new StringBuilder();
            sb.append("Odabrana ");
            sb.append("životinja");
            sb.append(" se ne može obrisati jer se nalazi u Zoološkom!");
            sb.append("\n");
            
           throw new ZooException(sb.toString());
        }
    }

    private void kontrolaIme() throws ZooException {
        kontrolaImeNull();
        kontrolaImeBroj();
    }

    private void kontrolaImeNull() throws ZooException {
        if(entitet.getIme()==null || entitet.getIme().isEmpty()){
            throw new ZooException("Ime mora biti unešeno!");
        }
    }

    private void kontrolaImeBroj() throws ZooException {
         boolean broj = false;

        try {
            Double.parseDouble(entitet.getIme());
            
            broj = true;
        } catch (Exception e) {

        }
        if (broj) {
            throw new ZooException("Ime ne može biti broj!");
        }
    }

    private void kontrolaVrsta() throws ZooException {
        kontrolaNull();
        kontrolaBroj();
    }

    private void kontrolaNull() throws ZooException {
        if(entitet.getVrsta()==null || entitet.getVrsta().isEmpty()){
            throw new ZooException("Vrsta mora biti unešena!");
        }
    }

    private void kontrolaBroj() throws ZooException {
         boolean broj = false;

        try {
            Double.parseDouble(entitet.getVrsta());
            
            broj = true;
        } catch (Exception e) {

        }
        if (broj) {
            throw new ZooException("Vrsta ne može biti broj!");
        }
    }

    private void kontrolaPopunjenaPolja() throws ZooException {
        String[] provjera = {entitet.getIme(), entitet.getZivotinjskaVrsta(), entitet.getVrsta()};
        for (int i = 0; i < provjera.length; i++) {
            if (provjera[i].isEmpty()) {
                throw new ZooException("Sva polja moraju biti popunjena!");
            }
        }

        if (entitet.getDatumDolaska()==null || entitet.getDatumRodenja()==null) {
            throw new ZooException("Sva polja moraju biti popunjena!");
        }
        
    }

    private void kontrolaDatum() throws ZooException {
        
      if(entitet.getDatumRodenja().compareTo(entitet.getDatumDolaska())>0) {
          throw new ZooException("Datum rođenja nije dobro unesen!");
      }
       
    }

}
