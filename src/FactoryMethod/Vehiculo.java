/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;


public interface Vehiculo {
    String asignarRuta(String origen, String destino);
    double calcularTarifa(double distanciaKm);
}