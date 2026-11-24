/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaTiposVehiculo {
    private static final Map<String, TipoVehiculoFlyweight> poolTipos = new HashMap<>();

    public static TipoVehiculoFlyweight obtenerTipoVehiculo(String categoria) {
        TipoVehiculoFlyweight tipo = poolTipos.get(categoria);

        if (tipo == null) {
            switch (categoria) {
                case "ARTICULADO":
                    tipo = new TipoVehiculoFlyweight("ARTICULADO", "Bus Biarticulado Troncal", 160, 3100.0);
                    break;
                case "ALIMENTADOR":
                    tipo = new TipoVehiculoFlyweight("ALIMENTADOR", "Bus Padron Urbano", 80, 2900.0);
                    break;
                case "TAXI_ELECTRICO":
                    tipo = new TipoVehiculoFlyweight("TAXI_ELECTRICO", "Sedan Electrico Cero Emisiones", 4, 1500.0);
                    break;
                default:
                    tipo = new TipoVehiculoFlyweight("VAN_ESPECIAL", "Van Ejecutiva Intermunicipal", 12, 2200.0);
                    break;
            }
            poolTipos.put(categoria, tipo);
        }
        return tipo;
    }

    public static int obtenerTotalFlyweightsCreados() {
        return poolTipos.size();
    }
}
