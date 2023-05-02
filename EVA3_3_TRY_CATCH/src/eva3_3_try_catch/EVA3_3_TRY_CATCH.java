package eva3_3_try_catch;

/**
 *
 * @author gambo
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;

        try {
            //Sección que puede causar una exception
            int resu = x / y;
            System.out.println("Resultado = " + resu);
        }catch(ArithmeticException e){
            //Genera un objeto exception llamado e
            //Del tipo ArithmeticException
            System.out.println("Excepción: "+ e.getMessage());
        }
        System.out.println("fin del programa bye");

    }

}
