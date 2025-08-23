/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_3_Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 1);
        Gallina g2 = new Gallina(2, 0);

        // Simulación de acciones
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar estado final de ambas
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

