/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.singleton7;

/**
 *
 * @author ayma-93
 */
public class Singleton {
    private static Singleton singleton;
    private static String msj;
    
    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        Singleton.msj = msj;
    }
    
    
    
}
