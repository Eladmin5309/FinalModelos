/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

public class TaxiEjecutivo implements Vehiculo {
    @Override
    public String asignarRuta(String origen, String destino) {
        return "Taxi Ejecutivo puerta a puerta: " + origen + " -> " + destino;
    }

    @Override
    public double calcularTarifa(double distanciaKm) {
        return 5500.0 + (distanciaKm * 1400.0);
    }
}