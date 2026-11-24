/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

public abstract class ServicioTransporte {
    protected MotorTraccion motor;

    public ServicioTransporte(MotorTraccion motor) {
        this.motor = motor;
    }

    public abstract String ejecutarRecorrido(String origen, String destino, double km);
}
