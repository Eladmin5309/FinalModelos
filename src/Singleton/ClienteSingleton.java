/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import entrada.Entrada;
import entrada.EntradaConsola;
import java.util.List;
import salida.Vista;
import salida.VistaConsola;

public class ClienteSingleton {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteSingleton() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== CENTRAL UNICA DE DESPACHO (SINGLETON) ===");

        // Primera referencia obtenida desde el modulo de configuracion
        CentralDespachoSingleton centralConfig = CentralDespachoSingleton.obtenerInstancia();
        vista.mostrarMensaje("Referencia 1 inicial: " + centralConfig.obtenerEstadoCentral());

        vista.mostrarMensaje("Ingrese nueva tarifa base por kilometro:");
        double nuevaTarifa = Double.parseDouble(entrada.capturarDato());
        centralConfig.actualizarTarifaBaseKm(nuevaTarifa);

        // Segunda referencia obtenida desde el modulo de operaciones
        CentralDespachoSingleton centralOperaciones = CentralDespachoSingleton.obtenerInstancia();

        vista.mostrarMensaje("Ingrese placa o tipo de vehiculo (sin espacios):");
        String vehiculo = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese ruta del servicio (ej. Norte-Sur, sin espacios):");
        String ruta = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese distancia del recorrido en km:");
        double km = Double.parseDouble(entrada.capturarDato());

        String detalle = centralOperaciones.registrarServicio(vehiculo, ruta, km);

        vista.mostrarMensaje("\n--- Verificacion de Instancia Unica ---");
        vista.mostrarMensaje("¿Ambas referencias apuntan al mismo objeto en memoria?: " + (centralConfig == centralOperaciones));
        vista.mostrarMensaje("Referencia 1 tras operacion: " + centralConfig.obtenerEstadoCentral());
        vista.mostrarMensaje("Referencia 2 tras operacion: " + centralOperaciones.obtenerEstadoCentral());
        vista.mostrarMensaje("Registro generado: " + detalle);

        vista.mostrarLista( centralOperaciones.obtenerHistorial());
    }
}