/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class ServicioViaje {
    private String tipoVehiculo;
    private String origen;
    private String destino;
    private int pasajeros;
    private boolean incluyeEquipajeExtra;
    private boolean incluyeSeguroViajero;
    private boolean rutaPrioritaria;
    private double tarifaTotal;

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setIncluyeEquipajeExtra(boolean incluyeEquipajeExtra) {
        this.incluyeEquipajeExtra = incluyeEquipajeExtra;
    }

    public void setIncluyeSeguroViajero(boolean incluyeSeguroViajero) {
        this.incluyeSeguroViajero = incluyeSeguroViajero;
    }

    public void setRutaPrioritaria(boolean rutaPrioritaria) {
        this.rutaPrioritaria = rutaPrioritaria;
    }

    public void setTarifaTotal(double tarifaTotal) {
        this.tarifaTotal = tarifaTotal;
    }

    @Override
    public String toString() {
        return "=== RESUMEN DE RESERVA DE VIAJE ===\n"
                + "Vehiculo: " + tipoVehiculo + "\n"
                + "Ruta: " + origen + " -> " + destino + "\n"
                + "Pasajeros: " + pasajeros + "\n"
                + "Equipaje Extra: " + (incluyeEquipajeExtra ? "Si" : "No") + "\n"
                + "Seguro Viajero: " + (incluyeSeguroViajero ? "Si" : "No") + "\n"
                + "Ruta Prioritaria: " + (rutaPrioritaria ? "Si" : "No") + "\n"
                + String.format("Tarifa Total Liquidada: $%.2f", tarifaTotal);
    }
}
