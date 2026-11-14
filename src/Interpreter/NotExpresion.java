/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class NotExpresion implements ReglaExpresion {

    private final ReglaExpresion expresion;

    public NotExpresion(ReglaExpresion expresion) {
        this.expresion = expresion;
    }

    @Override
    public boolean interpretar(ViajeContext contexto) {
        return !expresion.interpretar(contexto);
    }
}


