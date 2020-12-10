/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import repositorio.Repositorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fiume
 */
public class Autenticacion {

    
    
    private String usuario;
    private String pass;
    Repositorio c = Repositorio.getRepositorio();
    public Autenticacion(String usuario, String pass) {
        
       
        this.pass=pass;
        this.usuario=usuario;
    }
    
    public String ObtenerRol(){
        
            Usuario user=null;
            String rol="";
            
            
            
           for(Usuario u:c.usuarios){
               if(u.getUser().equals(usuario)){
                   if(u.getPass().equals(pass)){
                       user = u;
                       rol=u.getEmpleado().getRol();
                   }
               }
           }
           
           if(user==null) JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            
           
        
            return rol;
    }
    
    public OrdenDeProduccion crearOP(int numero, int Objetivo, Modelo modelo, int linea, int HoraCreacion, String color){
        OrdenDeProduccion op = new OrdenDeProduccion(numero, Objetivo, modelo, linea, HoraCreacion);
        op.setColor(c.buscarColor(color));
        c.ordenes.add(op);
        JOptionPane.showMessageDialog(null, "Orden De produccion creada");
        return op;
    }
    
}