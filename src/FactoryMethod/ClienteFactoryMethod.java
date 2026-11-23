/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import entrada.Entrada;
import entrada.EntradaConsola;
import salida.Vista;
import salida.VistaConsola;

public class ClienteFactoryMethod {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteFactoryMethod() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== SISTEMA DE DESPACHO DE TRANSPORTE (FACTORY METHOD) ===");
        vista.mostrarMensaje("Seleccione tipo de servicio (1: Bus Urbano, 2: Taxi Ejecutivo, 3: Mototaxi):");
        String opcion = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de origen (sin espacios):");
        String origen = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de destino (sin espacios):");
        String destino = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese distancia estimada en km:");
        double km = Double.parseDouble(entrada.capturarDato());

        DespachadorTransporte despachador;
        switch (opcion) {
            case "1":
                despachador = new DespachadorBus();
                break;
            case "2":
                despachador = new DespachadorTaxi();
                break;
            case "3":
                despachador = new DespachadorMototaxi();
                break;
            default:
                vista.mostrarMensaje("Opcion invalida. Asignando Bus Urbano por defecto.");
                despachador = new DespachadorBus();
                break;
        }

        String resultado = despachador.procesarDespacho(origen, destino, km);
        vista.mostrarMensaje("\n--- Resultado del Despacho ---");
        vista.mostrarMensaje(resultado);
    }
}