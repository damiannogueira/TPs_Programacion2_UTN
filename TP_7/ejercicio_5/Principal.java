/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Armo distintas formas de pago (datos de ejemplo).
        Pagable t1 = new TarjetaCredito("Damián Nogueira", "4509123499991234", 3, 120000);
        Pagable tr1 = new Transferencia("BBVA", "2850590940098765432101", 85000);
        Pagable ef1 = new Efectivo(15000);

        // Nota personal: uso List<Pagable> para practicar generics con interfaces.
        List<Pagable> pagos = new ArrayList<>();
        pagos.add(t1);
        pagos.add(tr1);
        pagos.add(ef1);

        // Proceso todos con una sola funcion (polimorfismo).
        System.out.println("== Procesamiento de pagos ==");
        for (Pagable p : pagos) {
            ProcesadorPagos.procesarPago(p);
        }
    }
}

