/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matriculas {
    private double tarifa;
    
        
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }
        
    public double obtenerTarifa(){
        return tarifa;
    }
    @Override
    public String toString() {
        String cadenafinal = String.format("\nMatricula del Jardin: %.2f\n",
                obtenerTarifa());
        return cadenafinal;
    }
}
