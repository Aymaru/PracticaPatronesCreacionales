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
public class OscuroBuilder extends GUIBuilder {

    public OscuroBuilder() {
        super();
    }
    
    
    @Override
    public void definirColorFuente(){
        unaGUI.setColorBackground("Negro");
    }
    
    @Override
    public void definirColorBackground(){
        unaGUI.setColorFuente("Blanco");
    }
}
