/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author Igor
 */
@Entity
public class Zivotinja extends Entitet{
    
    private String zivotinjskaVrsta;
    private String vrsta;
    private String ime;
    private Date datumRodenja;
    private Date datumDolaska;
    private Date datumSmrti;
    @ManyToOne
    @JoinColumn(
    name = "djelatnik")
    private Djelatnik djelatnik;
   

    public String getZivotinjskaVrsta() {
        return zivotinjskaVrsta;
    }

    public void setZivotinjskaVrsta(String zivotinjskaVrsta) {
        this.zivotinjskaVrsta = zivotinjskaVrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public Zivotinja() {
        super();
    }

    public Zivotinja(String zivotinjskaVrsta, String vrsta, String ime, Date datumRodenja, Date datumDolaska, Date datumSmrti, Djelatnik djelatnik,int sifra) {
        super(sifra);
        this.zivotinjskaVrsta = zivotinjskaVrsta;
        this.vrsta = vrsta;
        this.ime = ime;
        this.datumRodenja = datumRodenja;
        this.datumDolaska = datumDolaska;
        this.datumSmrti = datumSmrti;
        this.djelatnik = djelatnik;
      
    }

    @Override
    public String toString() {
        return vrsta + " - " + ime +"\n";
    }
    
    
}
