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
public class RefrescoNatural extends Refresco {

    public RefrescoNatural() {
    }
    
    @Override
    public Refresco crearRefresco(){
        super.empaque = Empaque.BotellaConTapa;
        super.tipo = "Natural";
        return this;
    }
}
