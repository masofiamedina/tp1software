/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import servidor.Autenticacion;
import servidor.Usuario;
import cliente.AutenticacionVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fiume
 */
public class Controlador implements ActionListener{
    
    private AutenticacionVista autenticacion_vista;
    private ArrayList<Usuario> usuarios;
    
     public Controlador() {
         
     
         autenticacion_vista = new AutenticacionVista();
       // principal = new Principal();
        

    }

    public void ejecutarAutenticacion() {
        autenticacion_vista.setControlador(this);
        autenticacion_vista.ejecutar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(autenticacion_vista.BTN_INGRESAR)) {
            
            Autenticacion au = new Autenticacion(autenticacion_vista.getUsuario(), autenticacion_vista.getPass());
            String rol = au.ObtenerRol() ;
            
             switch(rol){
                
                case "SupervisorLinea":
                    
                    autenticacion_vista.dispose();
                    ControladorOrdenDeProduccion cop = new ControladorOrdenDeProduccion(au);
                    cop.ejecutar();
                    break;
                
                case "SupervisorCalidad":
                
                   autenticacion_vista.dispose();
                   ControladorOrdenDeProduccion cop2 = new ControladorOrdenDeProduccion(au);
                   cop2.ejecutar();
                   break;
                
            }
        }
        
    }
    
}
