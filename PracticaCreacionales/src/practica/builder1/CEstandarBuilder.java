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
public class CEstandarBuilder extends CuentaBuilder {

    public CEstandarBuilder() {
        super();
    }
    
    @Override
    public void definirPorcentaje(){
        unaCuenta.setProcentajeInteres(0.5);
    }
    
    @Override
    public void definirTCredito(){
        unaCuenta.setTarjetaCredito("No");
    }
    
    @Override
    public void definirTDebito(){
        unaCuenta.setTarjetaDebito("5 Euros");
    }
    
    @Override
    public void definirRegalo(){
        unaCuenta.setRegalo("No");
    }

    
}
