/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;

    // Relaciones de la consigna (agregación y asociación)
    private Bateria bateria;   // Celular → Bateria (agregación)
    private Usuario usuario;   // Celular ↔ Usuario (asociación 1 a 1)

    // Constructor para crear el celular con sus datos
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters simples (los uso en Principal para chequear)
    public String getImei()  { return imei; }
    public String getMarca() { return marca; }
    public String getModelo(){ return modelo; }

    // Relación: agregación (puedo cambiar la batería)
    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }

    // Relación: asociación bidireccional 1–1 con Usuario
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario nuevo) {
        if (this.usuario == nuevo) return;
        Usuario anterior = this.usuario;
        this.usuario = nuevo;
        if (anterior != null && anterior.getCelular() == this) {
            anterior.setCelular(null);
        }
        if (nuevo != null && nuevo.getCelular() != this) {
            nuevo.setCelular(this);
        }
    }
}

