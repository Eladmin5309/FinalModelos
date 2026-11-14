/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

public class EsHoraPicoExpresion implements ReglaExpresion {

    @Override
    public boolean interpretar(ViajeContext contexto) {
        return contexto.isHoraPico();
    }
}
