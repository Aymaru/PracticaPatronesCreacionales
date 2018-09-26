/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.abstractFactory3;

/**
 *
 * @author ayma-93
 */
public abstract class Hamburguesa {
    protected Empaque empaque;
    protected String ingredientes;
    
    public abstract Hamburguesa crearHamburguesa();

    @Override
    public String toString() {
        return ("Hamburguesa( Ingredientes = "+ ingredientes +", empaque = "+ empaque +")"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
