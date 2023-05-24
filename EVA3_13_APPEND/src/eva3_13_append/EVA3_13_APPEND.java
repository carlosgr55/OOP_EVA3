package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EVA3_13_APPEND {

    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "D:\\Escuela\\OOP\\Archivos\\";

        try {
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Escritura de archivos con buffered wrieter");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 10; i++) {
            bufWriter.write(i + datos);
            bufWriter.write("\n");
        }

        bufWriter.close();
        fileWriter.close();
    }

}
