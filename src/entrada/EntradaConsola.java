/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EntradaConsola implements Entrada{

    Scanner sc;
    public EntradaConsola() {
        sc = new Scanner(System.in);
    }
    
    @Override
    public String capturarDato() {
        return sc.next();
    }
    
}
