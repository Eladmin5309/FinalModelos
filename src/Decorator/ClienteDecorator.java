/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import entrada.Entrada;
import entrada.EntradaConsola;
import salida.Vista;
import salida.VistaConsola;

public class ClienteDecorator {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteDecorator() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== PERSONALIZACION DE SERVICIO DE TRANSPORTE (DECORATOR) ===");
        vista.mostrarMensaje("Ingrese punto de origen (sin espacios):");
        String origen = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese punto de destino (sin espacios):");
        String destino = entrada.capturarDato();

        vista.mostrarMensaje("Ingrese distancia estimada en km:");
        double km = Double.parseDouble(entrada.capturarDato());

        // 1. Instanciacion del componente base
        TarifaServicio servicio = new ViajeBase(origen, destino, km);

        // 2. Envoltura dinamica segun los adicionales elegidos
        vista.mostrarMensaje("¿Desea agregar Seguro Integral de Viajero? (S/N):");
        if ("S".equalsIgnoreCase(entrada.capturarDato())) {
            servicio = new SeguroViajeroDecorator(servicio);
        }

        vista.mostrarMensaje("¿Desea agregar Bodega de Equipaje Extra? (S/N):");
        if ("S".equalsIgnoreCase(entrada.capturarDato())) {
            servicio = new EquipajeExtraDecorator(servicio);
        }

        vista.mostrarMensaje("¿Desea agregar Despacho Prioritario Express? (S/N):");
        if ("S".equalsIgnoreCase(entrada.capturarDato())) {
            servicio = new PrioridadDespachoDecorator(servicio);
        }

        vista.mostrarMensaje("\n--- Liquidacion Final del Servicio ---");
        vista.mostrarMensaje("Detalle: " + servicio.obtenerDescripcion());
        vista.mostrarMensaje(String.format("Costo Total: $%.2f", servicio.calcularCosto()));
    }
}
