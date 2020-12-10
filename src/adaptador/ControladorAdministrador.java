/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import cliente.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fiume
 */
public class ControladorAdministrador implements ActionListener{

    private VistaGestionar visualizarGestionar;
    
    public ControladorAdministrador() {
        visualizarGestionar = new VistaGestionar();
    }
    
    
    
    public void ejecutar(){
         visualizarGestionar.setControlador(this);
         visualizarGestionar.ejecutar();
     }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("")) {
        }
        
    }
    
}
