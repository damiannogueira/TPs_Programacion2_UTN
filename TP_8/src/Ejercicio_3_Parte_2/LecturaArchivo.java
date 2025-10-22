package Ejercicio_3_Parte_2;

// Autor: Damián Ignacio Nogueira

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido la ruta del archivo a leer
        System.out.print("Ingrese la ruta del archivo de texto: ");
        String ruta = sc.nextLine();

        // Intento abrir el archivo y mostrar su contenido
        try {
            Scanner lector = new Scanner(new File(ruta));
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            // Manejo cuando el archivo no existe
            System.out.println("Error: el archivo no existe o la ruta es incorrecta.");
        }
    }
}
