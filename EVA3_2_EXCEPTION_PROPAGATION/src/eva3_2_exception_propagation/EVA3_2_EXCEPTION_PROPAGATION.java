/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_exception_propagation;

/**
 *
 * @author gambo
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }

    public static void A() {
        System.out.println("INCIA A");
        B();
        System.out.println("TERMINA A");
    }

    public static void B() {
        System.out.println("INICIA B");
        C();
        System.out.println("TERMINA B");
    }

    public static void C(){
        System.out.println("INICIA C");
        int x = 5, y = 0;
        int z = x / y;
        System.out.println("Resultado = "+z);
        System.out.println("TERMINA C");
        
    }

}
