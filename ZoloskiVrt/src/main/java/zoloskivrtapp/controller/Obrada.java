/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.controller;

import zoloskivrtapp.model.Entitet;
import zoloskivrtapp.util.HibernateUtil;
import zoloskivrtapp.util.ZooException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Igor
 */
public abstract class Obrada<T extends Entitet> {

    protected T entitet;
    protected Session session;

    public abstract List<T> read();

    protected abstract void kontrolaUnos() throws ZooException;

    protected abstract void kontrolaPromjena() throws ZooException;

    protected abstract void kontrolaBrisanje() throws ZooException;

    public Obrada() {
        this.session = HibernateUtil.getSession();

    }

    public T getEntitet() {
        return entitet;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    private void persist() {
        session.beginTransaction();
        if (session.contains(entitet)) {
            session.merge(entitet);
        } else {
            session.persist(entitet);
        }
        session.getTransaction().commit();
    }

    public void create() throws ZooException {
        if (entitet == null) {
            throw new ZooException("Entitet ne postoji.");
        }
        kontrolaUnos();
        persist();
    }

    public void update() throws ZooException {
        kontrolaPromjena();
        persist();
    }

    public void delete() throws ZooException {
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }

}
