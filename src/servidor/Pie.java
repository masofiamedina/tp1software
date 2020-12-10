/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.ArrayList;
import java.util.Calendar;


public class Pie {
    
    private String tipoPie;
    private ArrayList<Defecto> defectos ;
    private Calendar calendario;
    private int hora;

    public Pie(String tipoPie, ArrayList<Defecto> defectos) {
        this.calendario = Calendar.getInstance();
        this.hora=calendario.get(Calendar.HOUR_OF_DAY);
        this.tipoPie = tipoPie;
        this.defectos = defectos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
    public int obtenerDefectos(String tipoDefecto , String defecto){
        
        
        for(Defecto d : defectos){
            if(d.getTipo().equalsIgnoreCase(tipoDefecto) && d.getDescripcion().equals(defecto) ){
                return 1;
            }
        }
        
        return 0;
    }
    
    public ArrayList<Defecto> getDefectos() {
        return defectos;
    }

    public void setDefectos(ArrayList<Defecto> defectos) {
        this.defectos = defectos;
    }

    

    public String getTipoPie() {
        return tipoPie;
    }

    public void setTipoPie(String tipoPie) {
        this.tipoPie = tipoPie;
    }
    
    public void TotalDefectosPie(){
        System.out.println("Pie: "+this.getTipoPie()+defectos.size()+" Defectos totales");
        
      
    }
    
    public void mostrarDefectosPie(){
        System.out.println("Pie: "+this.getTipoPie()+"\n");
        
        for(Defecto d:defectos){
                System.out.println(d);
            }
    }
}