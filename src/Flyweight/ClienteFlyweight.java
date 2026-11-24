/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

import entrada.Entrada;
import entrada.EntradaConsola;
import java.util.ArrayList;
import java.util.List;
import salida.Vista;
import salida.VistaConsola;

public class ClienteFlyweight {
    private final Entrada entrada;
    private final Vista vista;

    public ClienteFlyweight() {
        this.entrada = new EntradaConsola();
        this.vista = new VistaConsola();
    }

    public void Ejecutar() {
        vista.mostrarMensaje("=== MONITOREO DE FLOTA MASIVA EN TIEMPO REAL (FLYWEIGHT) ===");
        vista.mostrarMensaje("Ingrese cuantas unidades desea registrar en el mapa (1 a 10):");
        String cantStr = entrada.capturarDatoRango(1, 10);
        if ("ERROR".equals(cantStr)) {
            vista.mostrarMensaje("Entrada invalida. Se cancela la operacion.");
            return;
        }
        int cantidad = Integer.parseInt(cantStr);

        List<UnidadFlota> flotaActiva = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            vista.mostrarMensaje("\n--- Registro Unidad #" + i + " ---");
            vista.mostrarMensaje("Seleccione categoria (1: Articulado, 2: Alimentador, 3: Taxi Electrico, 4: Van Especial):");
            String opCat = entrada.capturarDatoRango(1, 4);

            String categoria;
            switch (opCat) {
                case "1":
                    categoria = "ARTICULADO";
                    break;
                case "2":
                    categoria = "ALIMENTADOR";
                    break;
                case "3":
                    categoria = "TAXI_ELECTRICO";
                    break;
                default:
                    categoria = "VAN_ESPECIAL";
                    break;
            }

            vista.mostrarMensaje("Ingrese placa del vehiculo (ej. WXY123):");
            String placa = entrada.capturarDato();

            vista.mostrarMensaje("Ingrese estado operativo (1: EnRuta, 2: Disponible, 3: Mantenimiento):");
            String opEstado = entrada.capturarDatoRango(1, 3);
            String estado = "1".equals(opEstado) ? "EnRuta" : ("2".equals(opEstado) ? "Disponible" : "Mantenimiento");

            // Se obtiene la referencia compartida desde la fabrica Flyweight
            TipoVehiculoFlyweight flyweight = FabricaTiposVehiculo.obtenerTipoVehiculo(categoria);

            // Coordenadas simuladas para la unidad individual
            double lat = 4.6000 + (i * 0.0125);
            double lon = -74.0800 - (i * 0.0085);

            flotaActiva.add(new UnidadFlota(placa, lat, lon, estado, flyweight));
        }

        vista.mostrarMensaje("\n=== REPORTE DE TELEMETRIA Y OPTIMIZACION DE MEMORIA ===");
        List<String> reporte = new ArrayList<>();
        for (UnidadFlota unidad : flotaActiva) {
            reporte.add(unidad.renderizarTelemetria());
        }
        vista.mostrarLista(reporte);

        vista.mostrarMensaje("\nTotal de unidades instanciadas en flota: " + flotaActiva.size());
        vista.mostrarMensaje("Total de objetos TipoVehiculoFlyweight en memoria: " + FabricaTiposVehiculo.obtenerTotalFlyweightsCreados());
    }
}
