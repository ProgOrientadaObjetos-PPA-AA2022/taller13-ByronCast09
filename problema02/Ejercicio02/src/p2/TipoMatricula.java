/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.Matriculas;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matriculas>lista = new ArrayList<>();
    //private MatriculaCampamento campamento;
    //private MatriculaColegio colegio;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    
    public void establecerListaMatriculas(ArrayList<Matriculas>ma){
        lista = ma;
    }
    /*
    public void establecerMatriculaColegio(MatriculaColegio c){
        colegio = c;
    }
    
    public MatriculaCampamento obtenerMatriculaCampamento(){
        return campamento;
    }
    
    
    public MatriculaColegio obtenerMatriculaColegio(){
        return colegio;
    }
    */
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (Matriculas e:lista) {
            suma = suma+e.obtenerTarifa();
        }
        promedioMatriculas = suma / lista.size();
                //obtenerMatriculaColegio().obtenerTarifa())/2;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    @Override
    public String toString(){
        String cadenafinal = ("");
        for(Matriculas e:lista){
            cadenafinal = String.format("%s%s",cadenafinal,e);
        }
        cadenafinal = String.format("%sEl promedio de Tarifas de las Matriculas es: %.2f\n",
                cadenafinal,promedioMatriculas);
        return cadenafinal;
    }
}
