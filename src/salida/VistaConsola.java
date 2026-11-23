/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salida;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class VistaConsola implements Vista{

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void mostrarLista(List<String> lista){
        System.out.println("Listado de objetos:");
        for(Object objeto : lista){
            System.out.println(objeto);
        }
    }
    
    
}
