/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public interface ConstructorViaje {
    void reiniciar();
    void definirVehiculo();
    void definirRuta(String origen, String destino);
    void definirPasajeros(int cantidad);
    void agregarEquipajeExtra(boolean incluir);
    void agregarSeguroViajero(boolean incluir);
    void agregarRutaPrioritaria(boolean incluir);
    void calcularTarifaFinal();
    ServicioViaje obtenerViaje();
}
