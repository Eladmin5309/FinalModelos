/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada;
import java.util.InputMismatchException;
import java.util.Scanner;
import salida.Vista;
import salida.VistaConsola;

/**
 *
 * @author Usuario
 */
public class EntradaConsola implements Entrada {

    Scanner sc;
    Vista vista;

    public EntradaConsola() {
        sc = new Scanner(System.in);
        vista = new VistaConsola();
    }

    @Override
    public String capturarDato() {
        return sc.next();
    }

    @Override
    public String capturarDatoRango(int a, int b) {
        int opcion;
        try {
            do {
                opcion = sc.nextInt();
                if (opcion < a || opcion > b) {
                    vista.mostrarMensaje("Ese número está fuera del rango permitido."
                            + "Lea nuevamente el rango de opciones.");
                }
            } while (opcion < a || opcion > b);
        } catch (InputMismatchException e) {
            return "ERROR";
        }
        return String.valueOf(opcion);
    }
}
