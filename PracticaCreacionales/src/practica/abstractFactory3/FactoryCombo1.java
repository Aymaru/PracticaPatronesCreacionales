/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.abstractFactory3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayma-93
 */
public class FactoryCombo1 extends AbstractFactoryCombo{
    
  
    @Override
    public Hamburguesa getHamburguesa(){
        try {
            return (Hamburguesa) Class.forName(HamburguesaVerduras.class.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null;
        }
    }
    
    @Override
    public Refresco getRefresco(){
        try {
            return (Refresco) Class.forName(RefrescoNatural.class.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null;
        }
    }
}
