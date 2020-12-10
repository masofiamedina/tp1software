/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author fiume
 */
public class Hallasgo implements Comparable<Hallasgo>{
    private int hora;
    private Defecto defecto;
    private String pie;
    private Integer cantidad;
    private int agregarQuitar;

    public Hallasgo(int hora, Defecto defecto, String pie, int agregarQuitar, int cantidad) {
        this.hora = hora;
        this.pie=pie;
        this.defecto = defecto;
        this.agregarQuitar=agregarQuitar;
        this.cantidad = cantidad;
        
    }

    public Hallasgo(int hora, Defecto defecto, int cantidad) {
        this.hora = hora;
        this.defecto = defecto;
        this.cantidad = cantidad;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public Hallasgo() {
    }

    public int getAgregarQuitar() {
        return agregarQuitar;
    }

    public void setAgregarQuitar(int agregarQuitar) {
        this.agregarQuitar = agregarQuitar;
    }
    
    
    

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Defecto getDefecto() {
        return defecto;
    }

    public void setDefecto(Defecto defecto) {
        this.defecto = defecto;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    @Override
    public int compareTo(Hallasgo t) {
        return this.cantidad.compareTo(t.getCantidad());
    }
    
    
    
}