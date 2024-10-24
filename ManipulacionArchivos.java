import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivos(String fileName){
        File file;// la clase file apunta a un archivo fisico en disco duro
        FileReader reader;// llave con permisos de solo lectura
        BufferedReader bufer;
        String line;

        try {
            //crear un apuntadoral archivo fisico 
            file = new File("C:\\archivos\\" + fileName + ".txt");
            //abrir el archivo para lectura 
            reader = new FileReader(file);
            //configurar el bufer para leer datos de archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine())  != null ) {
                System.out.println("Linea leida: " + line);
            }
            reader.close();
        } catch(Exception/*exception significa para java error  */ e ){
            System.out.println("Error al leer al archivo: " + e.toString());
        }


    }

    public static void main(String[] args) throws IOException{
        BufferedReader bufer  = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto");
        System.out.println("escribe el nombre del archivo");
        fileName = bufer.readLine();
        leerArchivos(fileName);
    }
}