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
public abstract class Refresco {
    protected Empaque empaque;
    protected String tipo;
    
    public abstract Refresco crearRefresco();

    @Override
    public String toString() {
        return ("Refresco( Tipo de refresco = "+ tipo +", empaque = "+ empaque +")"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
