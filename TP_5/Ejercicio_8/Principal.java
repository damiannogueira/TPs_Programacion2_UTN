/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo usuario y firma
        Usuario u1 = new Usuario("Damian Nogueira", "damian@email.com");
        FirmaDigital fd1 = new FirmaDigital("SHA256:ABC123", "2025-09-13");

        // creo el documento
        Documento d1 = new Documento("Contrato de servicio", "Texto del contrato...");

        // relaciones pedidas
        d1.setFirmaDigital(fd1); // composicion Documento -> FirmaDigital
        fd1.setUsuario(u1);      // agregacion FirmaDigital -> Usuario

        // chequeo rapido
        System.out.println("Doc: " + d1.getTitulo() +
                           " | Firma: " + d1.getFirmaDigital().getCodigoHash() +
                           " | Usuario: " + (fd1.getUsuario()!=null ? fd1.getUsuario().getNombre() : "sin usuario"));
    }
}

