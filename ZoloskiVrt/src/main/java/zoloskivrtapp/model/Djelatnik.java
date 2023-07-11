/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Igor
 */
@Entity
public class Djelatnik extends Entitet {
    
    private String ime;
    private String prezime;
    private String IBAN;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Djelatnik() {
        super();
    }

    public Djelatnik(String ime, String prezime, String IBAN, int sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.IBAN = IBAN;
    }
    
    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
}
