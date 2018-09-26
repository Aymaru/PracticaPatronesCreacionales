/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacreacionales;

import practica.builder1.Admin;
import practica.builder1.C10Builder;
import practica.builder1.CEstandarBuilder;
import practica.builder1.CJovenBuilder;
import practica.builder1.COroBuilder;

/**
 *
 * @author ayma-93
 */
public class PracticaCreacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // prueba de funcionamiento de Builder ejercicio 1
        Admin administradorCuenta = new Admin();
        CJovenBuilder adminCuentaJoven = new CJovenBuilder();
        C10Builder adminCuenta10 = new C10Builder();
        COroBuilder adminCuentaOro = new COroBuilder();
        CEstandarBuilder adminCuentaEstandar = new CEstandarBuilder();
        
        administradorCuenta.setCreadorCuenta(adminCuentaJoven);
        administradorCuenta.armarCuenta();
        System.out.println("La cuenta creada es " + administradorCuenta.getCuenta());
        
        administradorCuenta.setCreadorCuenta(adminCuenta10);
        administradorCuenta.armarCuenta();
        System.out.println("La cuenta creada es " + administradorCuenta.getCuenta());
        
        administradorCuenta.setCreadorCuenta(adminCuentaOro);
        administradorCuenta.armarCuenta();
        System.out.println("La cuenta creada es " + administradorCuenta.getCuenta());
        
        administradorCuenta.setCreadorCuenta(adminCuentaEstandar);
        administradorCuenta.armarCuenta();
        System.out.println("La cuenta creada es " + administradorCuenta.getCuenta());
    }
    
}
