/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gambo
 */
public class EVA3_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor entero de x");
                x = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato mal capturado");

            }
        } while (true);
        System.out.println("Valor de x = " + x);

    }

}
