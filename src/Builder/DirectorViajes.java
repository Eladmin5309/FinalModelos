/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class DirectorViajes {

    public void construirViajeBasico(ConstructorViaje builder, String origen, String destino, int pasajeros) {
        builder.reiniciar();
        builder.definirVehiculo();
        builder.definirRuta(origen, destino);
        builder.definirPasajeros(pasajeros);
        builder.agregarEquipajeExtra(false);
        builder.agregarSeguroViajero(false);
        builder.agregarRutaPrioritaria(false);
        builder.calcularTarifaFinal();
    }

    public void construirViajeCompleto(ConstructorViaje builder, String origen, String destino, int pasajeros) {
        builder.reiniciar();
        builder.definirVehiculo();
        builder.definirRuta(origen, destino);
        builder.definirPasajeros(pasajeros);
        builder.agregarEquipajeExtra(true);
        builder.agregarSeguroViajero(true);
        builder.agregarRutaPrioritaria(true);
        builder.calcularTarifaFinal();
    }
}
