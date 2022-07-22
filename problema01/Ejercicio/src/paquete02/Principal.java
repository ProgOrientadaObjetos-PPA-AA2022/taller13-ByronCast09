/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.OperacionesTelevisor;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Televisor t1 = new Televisor("LG-14 pulgadas", 300.2);
        //t1.establecerMarca();
        //t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor("SAMSUMG-21 pulgadas", 1300.2);
        //t2.establecerMarca();
        //t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor("RIVIERA-29 pulgadas", 2300.5);
        //t3.establecerMarca();
        //t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        System.out.println("-----------------");
        OperacionesTelevisor op1 = new OperacionesTelevisor();
        op1.establecerMarcas(tvs);
        op1.establecerPrecio(tvs);
        op1.establecerTotalPrecioTvs();
        op1.establecerTelevisorMasCaro();

        System.out.printf("%s\n",tvs);

    }
}
