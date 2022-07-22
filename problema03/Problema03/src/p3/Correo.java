/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class Correo {
    private DominioCorreos dominioCorreos;
    private String correo;
    private String username;
    
    public void establecerDominio(DominioCorreos g){
        dominioCorreos = g;
    }
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public DominioCorreos obtenerDominio(){
        return dominioCorreos;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    @Override
    public String toString(){
        String cadenafinal = String.format("Username: %s\n"+"Correo Electronico: %s\n"
        +"Dominio: %s\n",obtenerUserName(),obtenerCorreo(),dominioCorreos.toString());
        return cadenafinal;
    }
}
