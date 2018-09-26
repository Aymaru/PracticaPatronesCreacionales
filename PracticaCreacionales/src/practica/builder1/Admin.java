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
public class Admin {
    private CuentaBuilder creadorCuenta;

    
    public void setCreadorCuenta(CuentaBuilder creadorCuenta) {
        this.creadorCuenta = creadorCuenta;
    }
    
    public Cuenta getCuenta(){
        return creadorCuenta.getCuenta();
    }
    
    public void armarCuenta(){
        creadorCuenta.definirPorcentaje();
        creadorCuenta.definirTDebito();
        creadorCuenta.definirTCredito();
        creadorCuenta.definirRegalo();       
    }
}
