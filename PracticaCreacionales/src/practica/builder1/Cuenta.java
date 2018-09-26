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
public class Cuenta {
    private double porcentajeInteres;
    private String tarjetaDebito;
    private String tarjetaCredito;
    private String regalo;

    public Cuenta() {
    }

    public double getProcentajeInteres() {
        return porcentajeInteres;
    }

    public void setProcentajeInteres(double procentajeInteres) {
        this.porcentajeInteres = procentajeInteres;
    }

    public String getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(String tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Interes=" + porcentajeInteres + ", Tarjeta Debito=" + tarjetaDebito + ", Tarjeta Credito=" + tarjetaCredito +", Regalo=" + regalo + '}';
    }
    
    
}
