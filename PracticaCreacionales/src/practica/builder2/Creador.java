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
public class Creador {
    private GUIBuilder creadorGUI;

    public void setCreadorGUI(GUIBuilder creadorGUI) {
        this.creadorGUI = creadorGUI;
    }
    
    public GUI getGUI(){
        return creadorGUI.getGUI();
    }
    
    public void armarGUI(){
        creadorGUI.definirColorFuente();
        creadorGUI.definirColorBackground();
    }
}
