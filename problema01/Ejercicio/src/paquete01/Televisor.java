/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Televisor {

    private String marca;
    private double precio;

    public Televisor(String marc, double prec) {
        this.marca = marc;
        this.precio = prec;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecio(double m) {
        precio = m;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Marca: %s\n"+
                "Precio: %.2f\n",marca,precio);
        return cadena;
    }
}
