package Ejercicio_5_Parte_2;

// Autor: Damián Ignacio Nogueira

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaConTryWithResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido la ruta del archivo a leer
        System.out.print("Ingrese la ruta del archivo de texto: ");
        String ruta = sc.nextLine();

        // Uso try-with-resources para que el BufferedReader se cierre solo
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // Manejo de IOException (incluye archivo inexistente y otros errores de E/S)
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
