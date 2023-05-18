package eva3_10_leer_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_10_LEER_ARCHIVOS {

    public static void main(String[] args) {
        // TODO code application logic here

        String ruta = "D:\\Escuela\\OOP\\Archivos\\";

        try {
            writeUsingFiles(ruta + "ArchivoUsandoFiles.txt", "estoy escribiendo un archivo con files");
            writeUsingFileWriter(ruta + "archivoFileWriter.txt", "Escritura de archivos usando file writer");
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Escritura de archivos con buffered wrieter");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_LEER_ARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void writeUsingFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }

    public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }

    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 10; i++) {
            bufWriter.write(i + datos);
            bufWriter.write("\n");
        }

        bufWriter.close();
        fileWriter.close();
    }

}
