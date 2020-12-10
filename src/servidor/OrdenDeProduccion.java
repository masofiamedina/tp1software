/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

public class OrdenDeProduccion {

    private ArrayList<Pie> pies = new ArrayList<>();
    private ArrayList<Hallasgo> defectosPorHora = new ArrayList<>();
    private int numero;
    private int Objetivo;
    private String estado;
    private Modelo modelo;
    private int linea;
    private Color color;
    private int paresDePrimera = 0;
    private int HoraCreacion;

    private int RI_Despegado;
    private int RI_Descolorido;
    private int RI_Deformado;

    private int RD_Despegado;
    private int RD_Descolorido;
    private int RD_Deformado;

    private int OI_Despegado;
    private int OI_Descolorido;
    private int OI_Partido;

    private int OD_Despegado;
    private int OD_Descolorido;
    private int OD_Partido;

    public OrdenDeProduccion() {
    }

    
    
    public OrdenDeProduccion(int numero, int Objetivo, Modelo modelo, int linea, int HoraCreacion) {
        this.estado = "En Proceso";
        this.numero = numero;
        this.Objetivo = Objetivo;
        this.modelo = modelo;
        this.linea = linea;
        this.HoraCreacion=HoraCreacion;

    }
    
    public void MostrarDefectosTotales(Turno turno, ArrayList<Defecto> defectos){ // Recibe el array con todos los defectos
        
        for(int hora : turno.getHoras()){ // horasDeTrabajo sera un array de las horas que tenga un turno
            for(Defecto d : defectos){
                int izquierdo = this.contabilizarDefectosPorHora(hora,d, "Izquierdo");
                int Derecho = this.contabilizarDefectosPorHora(hora,d, "Derecho");
                
                System.out.println("Pie : Izquierdo  - Hora : "+hora + " Defecto : "+d.getDescripcion()+ " De Tipo : "+d.getTipo() +" Total : "+izquierdo);
                System.out.println("Pie : Derecho  - Hora : "+hora + " Defecto : "+d.getDescripcion()+ " De Tipo : "+d.getTipo() +" Total : "+Derecho);
            }
        }
        
    }

    public int getHoraCreacion() {
        return HoraCreacion;
    }

    public void setHoraCreacion(int HoraCreacion) {
        this.HoraCreacion = HoraCreacion;
    }
    
    public int contabilizarDefectosPorHora(int hora, Defecto defecto, String tipoPie) {
        
        int cantidadDefectos = 0;
        
        for(Hallasgo dh : this.defectosPorHora){
            if(dh.getHora()==hora && dh.getDefecto().getDescripcion().equals(defecto.getDescripcion()) && dh.getDefecto().getTipo().equals(defecto.getTipo()) && dh.getPie().equals(tipoPie)){
                cantidadDefectos = cantidadDefectos + dh.getAgregarQuitar();
                
            }
        }
        
        return cantidadDefectos;
        
    }
    
    public int contabilizarDefectosPorHora(int hora, Defecto defecto) {
        
        int cantidadDefectos = 0;
        
        for(Hallasgo dh : defectosPorHora){
            
            if(dh.getHora()==hora && dh.getDefecto().getDescripcion().equals(defecto.getDescripcion()) && dh.getDefecto().getTipo().equals(defecto.getTipo())){
                cantidadDefectos++;
                
            }
        }
        
        return cantidadDefectos;
        
    }
    
     public ArrayList<Hallasgo> defectosEnUltimasHoras( ArrayList<Defecto> defectos,int hora) {
        
       ArrayList<Hallasgo> defectosConCantidad = new ArrayList<>();
        
       for(int i=(hora-4);i<=hora;i++){
           for(Defecto d : defectos){
                int cantidadDefectos = this.contabilizarDefectosPorHora(i,d);
                System.out.println(i);
                Hallasgo aux = new Hallasgo(i,d,cantidadDefectos);
                defectosConCantidad.add(aux);
                }
       }
       
      Collections.sort(defectosConCantidad, Collections.reverseOrder());
      ArrayList<Hallasgo> primeros = new ArrayList<>();
      primeros.add(defectosConCantidad.get(0));
      primeros.add(defectosConCantidad.get(1));
      primeros.add(defectosConCantidad.get(2));
      
      
       return primeros;
    }
     
     
     
    
    
    
    
    

    public ArrayList<Hallasgo> getDefectoPorHora() {
        return defectosPorHora;
    }

    public void setDefectosPorHora(ArrayList<Hallasgo> defectosPorHora) {
        this.defectosPorHora = defectosPorHora;
    }
    
    

    public int getParesDePrimera() {
        return paresDePrimera;
    }

    public void AgregarParesDePrimera() {
        this.paresDePrimera++;
    }

    public void QuitarParesDePrimera() {

        if (paresDePrimera > 0) {
            this.paresDePrimera = -1;
        }
    }

    public void agregarPieInpeccionado(Pie p) {
        this.pies.add(p);
    }

    public void contabilizarDefectos(int hora) {
       
        for (Pie p : pies) {
            
            if(p.getHora()==hora){
                
               switch (p.getTipoPie()) {
                case "Derecho":
                    
                    this.RD_Despegado=this.RD_Despegado+p.obtenerDefectos("Reproceso","Despegado");
                    this.RD_Descolorido=this.RD_Descolorido+p.obtenerDefectos("Reproceso","Descolorido");
                    this.RD_Deformado=this.RD_Deformado+p.obtenerDefectos("Reproceso","Deformado");
                    
                    this.OD_Despegado=this.OD_Despegado+p.obtenerDefectos("Observado","Deformado");
                    this.OD_Descolorido=this.OD_Descolorido+p.obtenerDefectos("Observado","Descolorido");
                    this.OD_Partido=this.OD_Partido+p.obtenerDefectos("Observado","Partido");

                    break;
                
                case "Izquierdo":
                   
                    this.RI_Despegado=this.RI_Despegado+p.obtenerDefectos("Reproceso","Despegado");
                    this.RI_Descolorido=this.RI_Descolorido+p.obtenerDefectos("Reproceso","Descolorido");
                    this.RI_Deformado=this.RI_Deformado+p.obtenerDefectos("Reproceso","Deformado");
                    
                    this.OI_Despegado=this.OI_Despegado+p.obtenerDefectos("Observado","Deformado");
                    this.OI_Descolorido=this.OI_Descolorido+p.obtenerDefectos("Observado","Descolorido");
                    this.OI_Partido=this.OI_Partido+p.obtenerDefectos("Observado","Partido");
                    
                    break;
            } 
               
            }
            
        }
        
       
    }
    
   

    public int getRI_Despegado() {
        return RI_Despegado;
    }

    public void setRI_Despegado(int RI_Despegado) {
        this.RI_Despegado = RI_Despegado;
    }

    public int getRI_Descolorido() {
        return RI_Descolorido;
    }

    public void setRI_Descolorido(int RI_Descolorido) {
        this.RI_Descolorido = RI_Descolorido;
    }

    public int getRI_Deformado() {
        return RI_Deformado;
    }

    public void setRI_Deformado(int RI_Deformado) {
        this.RI_Deformado = RI_Deformado;
    }

    public int getRD_Despegado() {
        return RD_Despegado;
    }

    public void setRD_Despegado(int RD_Despegado) {
        this.RD_Despegado = RD_Despegado;
    }

    public int getRD_Descolorido() {
        return RD_Descolorido;
    }

    public void setRD_Descolorido(int RD_Descolorido) {
        this.RD_Descolorido = RD_Descolorido;
    }

    public int getRD_Deformado() {
        return RD_Deformado;
    }

    public void setRD_Deformado(int RD_Deformado) {
        this.RD_Deformado = RD_Deformado;
    }

    public int getOI_Despegado() {
        return OI_Despegado;
    }

    public void setOI_Despegado(int OI_Despegado) {
        this.OI_Despegado = OI_Despegado;
    }

    public int getOI_Descolorido() {
        return OI_Descolorido;
    }

    public void setOI_Descolorido(int OI_Descolorido) {
        this.OI_Descolorido = OI_Descolorido;
    }

    public int getOI_Partido() {
        return OI_Partido;
    }

    public void setOI_Partido(int OI_Partido) {
        this.OI_Partido = OI_Partido;
    }

    public int getOD_Despegado() {
        return OD_Despegado;
    }

    public void setOD_Despegado(int OD_Despegado) {
        this.OD_Despegado = OD_Despegado;
    }

    public int getOD_Descolorido() {
        return OD_Descolorido;
    }

    public void setOD_Descolorido(int OD_Descolorido) {
        this.OD_Descolorido = OD_Descolorido;
    }

    public int getOD_Partido() {
        return OD_Partido;
    }

    public void setOD_Partido(int OD_Partido) {
        this.OD_Partido = OD_Partido;
    }
    
    

    public ArrayList<Pie> getPies() {
        return pies;
    }

    public void setPies(ArrayList<Pie> pies) {
        this.pies = pies;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(int Objetivo) {
        this.Objetivo = Objetivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
