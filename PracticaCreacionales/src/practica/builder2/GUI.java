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
public class GUI {
    private String colorFuente;
    private String colorBackground;

    public GUI() {
    }

    public String getColorFuente() {
        return colorFuente;
    }

    public void setColorFuente(String colorFuente) {
        this.colorFuente = colorFuente;
    }

    public String getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(String colorBackground) {
        this.colorBackground = colorBackground;
    }

    @Override
    public String toString() {
        return ("GUI( Color de la Fuente = "+ colorFuente +", Color del Backgroud = "+ colorBackground +")"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
