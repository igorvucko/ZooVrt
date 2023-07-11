/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.controller;

import jakarta.persistence.NoResultException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import zoloskivrtapp.model.Operater;
import zoloskivrtapp.util.Alati;
import zoloskivrtapp.util.ZooException;

/**
 *
 * @author Igor
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
       return session.createQuery("from Operater", Operater.class).list();
    }

    @Override
    protected void kontrolaUnos() throws ZooException {
        kontrolaOib();
    }

    @Override
    protected void kontrolaPromjena() throws ZooException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws ZooException {
       
    }

    private void kontrolaOib() throws ZooException {
       if(!Alati.kontrolaOIB(entitet.getOib())) {
           throw new ZooException("OIB nije u dobrom formatu!");
       }
    }
    
    public void unosAdminOperatera(){
        Operater o = new Operater();
        o.setIme("Igor");
        o.setPrezime("Vučko");
        o.setEmail("igor@zoloskivrt.hr");
        o.setOib("54585269677");
        o.setLozinka(BCrypt.hashpw("zoloskivrt", BCrypt.gensalt()).toCharArray());
        
        entitet=o;
        try {
            create();
        } catch (ZooException ex) {
            System.out.println(ex.getPoruka());
        }
    }
    
    public Operater autoriziraj(String email, char[] lozinka){
        Operater o;
        try {
            o = session.createQuery("from Operater o where o.email=:email",
                    Operater.class).setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        
        if(BCrypt.checkpw(new String(lozinka), new String(o.getLozinka()))) {
            return o;
        }
        
        return null;
    }
    
}
