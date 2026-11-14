/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class OrExpresion implements ReglaExpresion {

    private final ReglaExpresion izquierda;
    private final ReglaExpresion derecha;

    public OrExpresion(ReglaExpresion izquierda, ReglaExpresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public boolean interpretar(ViajeContext contexto) {
        return izquierda.interpretar(contexto) || derecha.interpretar(contexto);
    }
}
