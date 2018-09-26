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
public class COroBuilder extends CuentaBuilder {
    public COroBuilder() {
        super();
    }
    
    @Override
    public void definirPorcentaje(){
        unaCuenta.setProcentajeInteres(1.5);
    }
    
    @Override
    public void definirTCredito(){
        unaCuenta.setTarjetaCredito("Gratuita, 60% pensión");
    }
    
    @Override
    public void definirTDebito(){
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void definirRegalo(){
        unaCuenta.setRegalo("Seguro");
    }


}
