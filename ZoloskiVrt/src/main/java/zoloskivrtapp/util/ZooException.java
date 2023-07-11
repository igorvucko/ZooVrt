/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoloskivrtapp.util;

/**
 *
 * @author Igor
 */
public class ZooException extends Exception {
    
    private String poruka;

    public String getPoruka() {
        return poruka;
    }

    public ZooException(String poruka) {
        super();
        this.poruka = poruka;
    }
    
    
    
}
