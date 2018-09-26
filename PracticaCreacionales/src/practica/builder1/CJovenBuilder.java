/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.builder1;

/**
 *
 * @author ayma-93
 */
public class CJovenBuilder extends CuentaBuilder{
    
    public CJovenBuilder() {
        super();
    }
    
    @Override
    public void definirPorcentaje(){
        unaCuenta.setProcentajeInteres(2);
    }
    
    @Override
    public void definirTCredito(){
        unaCuenta.setTarjetaCredito("No");
    }
    
    @Override
    public void definirTDebito(){
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void definirRegalo(){
        unaCuenta.setRegalo("CD Música");
    }

   
}
