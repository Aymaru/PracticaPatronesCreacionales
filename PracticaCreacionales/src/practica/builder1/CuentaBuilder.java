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
public abstract class CuentaBuilder {
    protected Cuenta unaCuenta;

    public CuentaBuilder() {
        this.unaCuenta = new Cuenta();
    }
    
    public abstract void definirPorcentaje();
    public abstract void definirTDebito();
    public abstract void definirTCredito();
    public abstract void definirRegalo();   

    public Cuenta getCuenta(){
        return unaCuenta;
    }

            
}            
