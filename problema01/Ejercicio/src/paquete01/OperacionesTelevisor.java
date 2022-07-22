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
    private double televisorMasCaro = 0;
    private String listaMarcasTv;

    public void establecerMarcas(ArrayList<Televisor> lista){
        t = lista;
    }
    public ArrayList<Televisor> obtenerMarcas(){
        return t;
    }
    
    public void establecerPrecio(ArrayList<Televisor>list){
        t = list;
    }
    public ArrayList<Televisor> obtenerPrecio(){
        return t;
    }
    //--------
    
    
//------------------------------------
    public void establecerTotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
        }
    }
    public double obtenerTotalPrecioTvs(){
        return totalPrecios;
    }
    public void establecerTelevisorMasCaro() {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            if (televisorMasCaro < t.get(i).obtenerPrecio()) {
                televisorMasCaro = t.get(i).obtenerPrecio();
            }
        }
    }
    public void obtenererTelevisorMasCaro(double tele){
        televisorMasCaro = tele;
    }

    public void establecerListaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
    }
    public String obtenerListaMarcasVendidas(){
        return listaMarcasTv;
    }
    
    @Override
    public String toString(){
         String cadenafinal = String.format("");
        for (Televisor e: obtenerMarcas()) {
            cadenafinal = String.format("Marcas TV: %s\n"
                    ,cadenafinal,obtenerMarcas());
        }
        cadenafinal = String.format("Total de Precios: %.2f\n"
        +"Televisor mas Caro: %.2f\n",cadenafinal,totalPrecios,televisorMasCaro);
        return cadenafinal;
    }

}
