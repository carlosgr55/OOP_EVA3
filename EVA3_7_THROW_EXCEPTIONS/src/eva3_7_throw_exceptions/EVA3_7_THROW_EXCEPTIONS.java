/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gambo
 */
public class EVA3_7_THROW_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        try {
            obj.capturaMayorCero(1);
            System.out.println("Ingresa un valor");
            Scanner input = new Scanner(System.in);
            int valor = input.nextInt();
            //Unchecked: error de lógica, no es forzoso resolverla
            //Checked: sí son obligatorias resolver
        } catch (Exception ex) { //Exception es muy general y captura a todos los tipos de errores posibles porque es una superclase
            System.out.println(ex.getMessage());
        }
        //ARITHMETIC EXCEPTION es unchecked por lo que no es necesario atenderla
        //Con el try-catch
        try {
            
            obj.division(4, 0);
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }

}

class Prueba {

    //Exception es checked exception, se tiene que atender forzosamente
    public void capturaMayorCero(int valor) throws Exception {
        if (valor <= 0) { //Se genera una excepcion
            throw new Exception("El valor no puede ser menor o igual a cero");
        }
        System.out.println("El valor ingresado es " + valor);

    }

    public int division(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("El divisor no puede ser igual a 0");
        }

        return x / y;
    }
}
