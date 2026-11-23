/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class ConstructorViajeEjecutivo implements ConstructorViaje {
    private ServicioViaje viaje;
    private double costoAcumulado;

    public ConstructorViajeEjecutivo() {
        this.reiniciar();
    }

    @Override
    public void reiniciar() {
        this.viaje = new ServicioViaje();
        this.costoAcumulado = 18000.0; // Tarifa base ejecutiva
    }

    @Override
    public void definirVehiculo() {
        viaje.setTipoVehiculo("Camioneta SUV Ejecutiva");
    }

    @Override
    public void definirRuta(String origen, String destino) {
        viaje.setOrigen(origen);
        viaje.setDestino(destino);
    }

    @Override
    public void definirPasajeros(int cantidad) {
        viaje.setPasajeros(cantidad);
        costoAcumulado += cantidad * 2500.0;
    }

    @Override
    public void agregarEquipajeExtra(boolean incluir) {
        viaje.setIncluyeEquipajeExtra(incluir);
        if (incluir) {
            costoAcumulado += 5000.0;
        }
    }

    @Override
    public void agregarSeguroViajero(boolean incluir) {
        viaje.setIncluyeSeguroViajero(incluir);
        if (incluir) {
            costoAcumulado += 3500.0;
        }
    }

    @Override
    public void agregarRutaPrioritaria(boolean incluir) {
        viaje.setRutaPrioritaria(incluir);
        if (incluir) {
            costoAcumulado += 6000.0;
        }
    }

    @Override
    public void calcularTarifaFinal() {
        viaje.setTarifaTotal(costoAcumulado);
    }

    @Override
    public ServicioViaje obtenerViaje() {
        ServicioViaje resultado = this.viaje;
        this.reiniciar();
        return resultado;
    }
}
