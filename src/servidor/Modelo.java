/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;



public class Modelo {
    

private String Descripcion;
private int objetivo;


    public Modelo() {
    }

    public Modelo(String Descripcion, int objetivo) {
        this.Descripcion = Descripcion;
        this.objetivo = objetivo;
        
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }
    
    
}
