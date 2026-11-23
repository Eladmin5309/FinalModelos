/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

public class Mototaxi implements Vehiculo {
    @Override
    public String asignarRuta(String origen, String destino) {
        return "Mototaxi expreso: " + origen + " -> " + destino;
    }

    @Override
    public double calcularTarifa(double distanciaKm) {
        return 2500.0 + (distanciaKm * 900.0);
    }
}
