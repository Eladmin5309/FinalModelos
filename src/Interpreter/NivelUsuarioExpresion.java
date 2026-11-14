/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class NivelUsuarioExpresion implements ReglaExpresion {

    private final String nivelRequerido;

    public NivelUsuarioExpresion(String nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    @Override
    public boolean interpretar(ViajeContext contexto) {
        return this.nivelRequerido.equalsIgnoreCase(contexto.getNivelUsuario());
    }
}
