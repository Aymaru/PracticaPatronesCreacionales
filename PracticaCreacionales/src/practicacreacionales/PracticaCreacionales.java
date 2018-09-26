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
import practica.builder2.ClaroBuilder;
import practica.builder2.Creador;
import practica.builder2.OscuroBuilder;
import practica.singleton7.Singleton;

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
        
        
        // prueba de funcionamiento de Builder ejercicio 2
        Creador creadorGUI = new Creador();
        ClaroBuilder creadorGUIClaro = new ClaroBuilder();
        OscuroBuilder creadorGUIOscuro = new OscuroBuilder();
        
        creadorGUI.setCreadorGUI(creadorGUIClaro);
        creadorGUI.armarGUI();
        System.out.println("La GUI creada es " + creadorGUI.getGUI());
        
        creadorGUI.setCreadorGUI(creadorGUIOscuro);
        creadorGUI.armarGUI();
        System.out.println("La GUI creada es " + creadorGUI.getGUI());
        
        // Prueba de uso del patrón Singleton ejercicio 7
        
        //Inicio de la aplicación
        Singleton.getInstance().setMsj("Esta es la pantalla de inicio de la aplicacion");
        System.out.println("El mensaje de ayuda es = " + Singleton.getInstance().getMsj());
        
        //Otra pantalla de la aplicacion
        Singleton.getInstance().setMsj("Esta es otra pantalla de la aplicacion");
        System.out.println("El mensaje de ayuda es = " + Singleton.getInstance().getMsj());
    }
    
}
