import java.io.FileWriter;      // Para escribir en archivos
import java.io.PrintWriter;     // Para escribir texto más fácil (línea a línea)
import java.io.BufferedReader;  // Para leer archivos
import java.io.FileReader;      // Para leer archivos de texto
import java.io.IOException;     // Para manejar errores de entrada/salida
import java.util.Scanner;       // Para leer desde consola

public class ListaTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para leer datos del usuario
        try {
            // -------------------------------
            // 1) ESCRITURA DE ARCHIVO
            // -------------------------------

            // FileWriter abre/crea el archivo "tareas.txt"
            // El segundo parámetro (true) significa "append": no borra, agrega al final
            FileWriter fw = new FileWriter("tareas.txt", true);

            // PrintWriter permite escribir texto en el archivo más fácilmente
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("Ingrese 3 tareas para guardar en el archivo:");

            // Bucle para pedir 3 tareas
            for (int i = 1; i <= 3; i++) {
                System.out.print("Tarea " + i + ": ");
              
                String tarea = sc.nextLine(); // Leer tarea desde consola
                pw.println(tarea);            // Guardar en el archivo (una línea por tarea)
            }

            pw.close(); // Muy importante: cierra el archivo y guarda los datos
            fw.close(); // Cierra también el FileWriter

            System.out.println("Tareas guardadas correctamente en tareas.txt");

            // -------------------------------
            // 2) LECTURA DE ARCHIVO
            // -------------------------------

            System.out.println("\nLeyendo las tareas guardadas:");

            // FileReader abre el archivo "tareas.txt"
            FileReader fr = new FileReader("tareas.txt");

            // BufferedReader permite leer línea por línea
            BufferedReader br = new BufferedReader(fr);

            String linea; // Variable temporal para cada línea
            while ((linea = br.readLine()) != null) { // Leer hasta que no haya más
                System.out.println("- " + linea);    // Mostrar en consola
            }

            br.close(); // Cerrar BufferedReader
            fr.close(); // Cerrar FileReader

        } catch (IOException e) {
            // Si ocurre un error de entrada/salida, lo mostramos
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

        sc.close(); // Cierra el scanner
    }
}

