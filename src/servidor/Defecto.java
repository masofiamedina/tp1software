/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;



public class Defecto {
    
    private int numero;
    private String Descripcion;
    private String Tipo;

    public Defecto(int numero, String Descripcion, String Tipo) {
        this.numero = numero;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
    }

    public Defecto() {
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Defecto{" + "numero=" + numero + ", Descripcion=" + Descripcion + ", Tipo=" + Tipo + '}';
    }
    
    
    
}
