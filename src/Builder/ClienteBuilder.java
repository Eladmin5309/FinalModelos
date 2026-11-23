/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import entrada.Entrada;
import entrada.EntradaConsola;
import salida.Vista;
import salida.VistaConsola;

public class ClienteBuilder {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteBuilder() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== RESERVA DE SERVICIOS DE TRANSPORTE (BUILDER) ===");
        vista.mostrarMensaje("Seleccione categoria del vehiculo (1: Economico, 2: Ejecutivo):");
        String tipo = entrada.capturarDato();

        vista.mostrarMensaje("Seleccione paquete de servicios (1: Viaje Basico, 2: Viaje Todo Incluido):");
        String paquete = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de origen (sin espacios):");
        String origen = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de destino (sin espacios):");
        String destino = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese numero de pasajeros:");
        int pasajeros = Integer.parseInt(entrada.capturarDato());

        ConstructorViaje constructor;
        if ("2".equals(tipo)) {
            constructor = new ConstructorViajeEjecutivo();
        } else {
            constructor = new ConstructorViajeEconomico();
        }

        DirectorViajes director = new DirectorViajes();
        if ("2".equals(paquete)) {
            director.construirViajeCompleto(constructor, origen, destino, pasajeros);
        } else {
            director.construirViajeBasico(constructor, origen, destino, pasajeros);
        }

        ServicioViaje viajeFinal = constructor.obtenerViaje();
        vista.mostrarMensaje("\n" + viajeFinal.toString());
    }
}