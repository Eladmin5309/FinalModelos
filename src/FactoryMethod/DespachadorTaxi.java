/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

public class DespachadorTaxi extends DespachadorTransporte {
    @Override
    public Vehiculo crearVehiculo() {
        return new TaxiEjecutivo();
    }
}
