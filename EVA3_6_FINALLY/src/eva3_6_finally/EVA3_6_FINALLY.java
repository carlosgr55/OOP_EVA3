/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_finally;

/**
 *
 * @author gambo
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 1;

        try {
            int resu = x / y;
            System.out.println("Resultado = " + resu);

        } catch (ArithmeticException e) {
            System.out.println("ERROR " + e.getMessage());
        } finally { //OBLIGA A LA EJECUCIÓN DE ESTA SECCIÓN DEL CÓDIGO
            //Es un bloque opcional de código
            System.out.println("Siempre me voy a ejecutar");
        }
        System.out.println("Fin del programa");
    }

}
