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
public class C10Builder extends CuentaBuilder{
    
    public C10Builder() {
        super();
    }
    
    @Override
    public void definirPorcentaje(){
        unaCuenta.setProcentajeInteres(1);
    }
    
    @Override
    public void definirTCredito(){
        unaCuenta.setTarjetaCredito("18 Euros, 60% Nómina");
    }
    
    @Override
    public void definirTDebito(){
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void definirRegalo(){
        unaCuenta.setRegalo("Reproductor CD");
    }

   
}
