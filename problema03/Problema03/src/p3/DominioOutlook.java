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
public class DominioOutlook implements DominioCorreos{
    private String dominio;
    @Override
    public void establecerDominio(){
        dominio = "outlook.com";
    }
    @Override
    public String obtenerDominio(){
        return dominio;
    }
    @Override
    public String toString(){
        String cadenafinal = "Dominio Outlook";
        return cadenafinal;
    }
}
