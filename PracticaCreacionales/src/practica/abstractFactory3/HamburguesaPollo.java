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
public class HamburguesaPollo extends Hamburguesa {

    public HamburguesaPollo() {
    }
    
    @Override
    public Hamburguesa crearHamburguesa(){
        super.empaque = Empaque.EnvolturaPapel;
        super.ingredientes = "Pollo";
        return this;
    }
}
