/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.ArrayList;



public class Turno {
   
    private ArrayList<Integer> horas; 
    private String Descripcion;

    public Turno(String Descripcion, ArrayList<Integer> horas ) {
        
        this.Descripcion = Descripcion;
        this.horas = horas;
    }

    public ArrayList<Integer> getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<Integer> horas) {
        this.horas = horas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    
    
    
}
