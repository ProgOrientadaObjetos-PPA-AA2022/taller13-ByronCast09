/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionesTelevisor {

    private ArrayList<Televisor> t;
    private double totalPrecios;
    private String marcas;
    private double televisorMasCaro = 0;
    private String listaMarcasTv;

    public OperacionesTelevisor(ArrayList<Televisor> lista){
        t = lista;
    }
    public void establecerTotalPrecioTvs() {
        
        for (int i = 0; i < t.size(); i++) {
            totalPrecios = totalPrecios + t.get(i).obtenerPrecio();
        }
    }
    public void establecerTelevisorMasCaro() {
        televisorMasCaro = t.get(0).obtenerPrecio();
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > televisorMasCaro) {
                televisorMasCaro = t.get(i).obtenerPrecio();
            }
        }
    }
    public void establecerListaMarcasVendidas() {
   
        for (int i = 0; i < t.size(); i++) {
            listaMarcasTv = String.format("%s%s\n", listaMarcasTv, t.get(i).obtenerMarca());
        }
    }
    public ArrayList<Televisor> obtenerLista(){
        return t;
    }
    public double obtenererTelevisorMasCaro(){
        return televisorMasCaro;
    }
    public double obtenerTotalPrecioTvs(){
        return totalPrecios;
    }
    public String obtenerMarcas(){
        return marcas;
    }
    
    @Override
    public String toString(){
         String cadenafinal = String.format("");
        for (int i=0;i < t.size();i++) {
            cadenafinal = String.format("%s%s"
                    ,cadenafinal,t.get(i));
        }
        cadenafinal = String.format("%s%s"+"Televisor mas caro: %.2f\n"
                +"Total Precios Tvs: %.2f",cadenafinal,marcas,televisorMasCaro,totalPrecios);
        return cadenafinal;
    }

}
