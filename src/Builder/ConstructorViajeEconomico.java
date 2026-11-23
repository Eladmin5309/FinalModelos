/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class ConstructorViajeEconomico implements ConstructorViaje {
    private ServicioViaje viaje;
    private double costoAcumulado;

    public ConstructorViajeEconomico() {
        this.reiniciar();
    }

    @Override
    public void reiniciar() {
        this.viaje = new ServicioViaje();
        this.costoAcumulado = 8000.0; // Tarifa base economica
    }

    @Override
    public void definirVehiculo() {
        viaje.setTipoVehiculo("Automovil Compacto Estandar");
    }

    @Override
    public void definirRuta(String origen, String destino) {
        viaje.setOrigen(origen);
        viaje.setDestino(destino);
    }

    @Override
    public void definirPasajeros(int cantidad) {
        viaje.setPasajeros(cantidad);
        costoAcumulado += cantidad * 1500.0;
    }

    @Override
    public void agregarEquipajeExtra(boolean incluir) {
        viaje.setIncluyeEquipajeExtra(incluir);
        if (incluir) {
            costoAcumulado += 3000.0;
        }
    }

    @Override
    public void agregarSeguroViajero(boolean incluir) {
        viaje.setIncluyeSeguroViajero(incluir);
        if (incluir) {
            costoAcumulado += 2000.0;
        }
    }

    @Override
    public void agregarRutaPrioritaria(boolean incluir) {
        viaje.setRutaPrioritaria(incluir);
        if (incluir) {
            costoAcumulado += 4000.0;
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