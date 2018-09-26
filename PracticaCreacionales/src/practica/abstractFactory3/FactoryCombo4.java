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
public class FactoryCombo4 extends AbstractFactoryCombo {
    
    @Override
    public Hamburguesa getHamburguesa(){
        try {
            return (Hamburguesa) Class.forName(HamburguesaPollo.class.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null;
        }
    }
    
    @Override
    public Refresco getRefresco(){
        try {
            return (Refresco) Class.forName(RefrescoGaseosa.class.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null;
        }
    }
}
