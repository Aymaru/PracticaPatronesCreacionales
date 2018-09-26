/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.builder2;

/**
 *
 * @author ayma-93
 */
public abstract class GUIBuilder {
    protected GUI unaGUI;

    public GUIBuilder() {
        unaGUI = new GUI();
    }
    
    public abstract void definirColorFuente();
    public abstract void definirColorBackground();
    
    public GUI getGUI(){
        return unaGUI;
    }
    
}
