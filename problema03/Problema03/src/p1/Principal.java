/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioOutlook;
import p3.DominioYahoo;
import p3.GobiernoEc;
import p3.Utpl;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominioGmail = new DominioGmail();
        dominioGmail.establecerDominio();
        Correo c1 = new Correo();
        c1.establecerDominio(dominioGmail);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();
        lista.add(c1);
        
        DominioOutlook dominioOutlook =new DominioOutlook();
        dominioOutlook.establecerDominio();
        Correo c2 = new Correo();
        c2.establecerDominio(dominioOutlook);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        lista.add(c2);
        
        DominioYahoo dominioYah=new DominioYahoo();
        dominioYah.establecerDominio();
        Correo c3 = new Correo();
        c3.establecerDominio(dominioYah);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        lista.add(c3);
        
        GobiernoEc gob=new GobiernoEc();
        gob.establecerDominio();
        Correo c4 = new Correo();
        c4.establecerDominio(gob);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        lista.add(c4);
        
        Utpl uni =new Utpl();
        uni.establecerDominio();
        Correo c5 = new Correo();
        c5.establecerDominio(uni);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        lista.add(c5);
        
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
