/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

public abstract class DespachadorTransporte {
    
    // Factory Method
    public abstract Vehiculo crearVehiculo();

    // Logica de negocio comun que opera sobre el producto abstracto
    public String procesarDespacho(String origen, String destino, double km) {
        Vehiculo vehiculo = crearVehiculo();
        String detalleRuta = vehiculo.asignarRuta(origen, destino);
        double costo = vehiculo.calcularTarifa(km);
        return detalleRuta + String.format(" | Distancia: %.1f km | Tarifa total: $%.2f", km, costo);
    }
}
