package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        // TODO code application logic here
        //SON TODAS DE RUNTIMEEXCEPTION
        //ARITHMETIC EXCEPTION
        //Division entre 0
        System.out.println("INICIANDO");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("DIVISION SIENDO CALCULADA");
        System.out.println("División "+resu);
         
        //InputMismatchException
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número"); 
        int num = sc.nextInt();
        System.out.println("El número fue "+num);

        //INDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5];
        arreglo[0] = 100;
        arreglo[1] = 2;
        arreglo[2] = 2;
        arreglo[3] = 2;
        arreglo[4] = 2;
        arreglo[5] = 4; //ERROR DE LÓGICA 5 NO ES PARTE DEL ARRAY
        
        //NULLPOINTER EXCEPTION
        Prueba obj = null;
        System.out.println("Valor de x "+ obj.x);
    }

}

class Prueba{
    public int x = 100;
    
}
