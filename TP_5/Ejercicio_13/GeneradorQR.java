/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author Damian Nogueira
 */

public class GeneradorQR {
    // dependencia de creacion: crea el CodigoQR dentro del metodo y no lo guarda
    public void generar(String valor, Usuario usuario) {
        // creo el codigo y lo uso aca mismo (no lo conservo como atributo)
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);

        // ejemplo de uso inmediato (sout de verificacion)
        System.out.println("QR generado para " + usuario.getNombre() + ": " + codigo.getValor());
        // termina el metodo: 'codigo' queda fuera de alcance (no se guarda)
    }
}

