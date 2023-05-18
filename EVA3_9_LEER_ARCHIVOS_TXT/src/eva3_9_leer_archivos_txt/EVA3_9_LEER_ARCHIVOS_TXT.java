package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EVA3_9_LEER_ARCHIVOS_TXT {

    final static String RUTA = "D:\\Escuela\\OOP\\Archivos\\Prueba.txt";

    public static void main(String[] args) {

        try {
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    /*
    Con files se lee todo el archivo y se transfiere a la memoria principal RAM
        es útil con archivos pequeños
        */
        
    }

    public static void readUsingFiles(String ruta) throws IOException {

        //Construimos la ruta en base a la cadena de texto
        Path path = Paths.get(ruta);
        /*List<String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i));
        }
        */
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
}
