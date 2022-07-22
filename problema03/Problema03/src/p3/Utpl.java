/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author USUARIO 2020
 */
public class Utpl implements DominioCorreos{
    private String dominio;
    @Override
    public void establecerDominio(){
        dominio = "utpl.edu.ec";
    }
    @Override
    public String obtenerDominio(){
        return dominio;
    }
    @Override
    public String toString(){
        String cadenafinal = "Dominio UTPL";
        return cadenafinal;
    }
}
