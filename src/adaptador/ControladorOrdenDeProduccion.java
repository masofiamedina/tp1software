/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import cliente.VistaSupervisorLinea;
import cliente.VistaCrearOP;
import cliente.VistaSupervisorCalidad;
import cliente.VistaVisualizarDatos;
import servidor.Autenticacion;
import servidor.Hallasgo;
import servidor.OrdenDeProduccion;
import repositorio.Repositorio;
import cliente.LineasDeTrabajo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author fiume
 */
public class ControladorOrdenDeProduccion implements ActionListener {

    private LineasDeTrabajo lineasDeTrabajo;
    private Autenticacion auteticacion;
    private VistaSupervisorCalidad vistaSupervisorCalidad;
    private VistaSupervisorLinea vistaSupervisorLinea;
    private VistaCrearOP vistaCrearOP;
    private OrdenDeProduccion p = null;
    private VistaVisualizarDatos visualizarDatos;
    private Repositorio r = Repositorio.getRepositorio();
    private int linea = 0;
    private Calendar calendario;

    public ControladorOrdenDeProduccion(Autenticacion auteticacion) {
        this.auteticacion = auteticacion;
        lineasDeTrabajo = new LineasDeTrabajo();
        vistaSupervisorCalidad = new VistaSupervisorCalidad();
        vistaSupervisorLinea = new VistaSupervisorLinea();
        visualizarDatos = new VistaVisualizarDatos();
        vistaCrearOP = new VistaCrearOP();

    }

    public void ejecutar() {
        visualizarDatos.setControlador(this);
        vistaSupervisorLinea.setControlador(this);
        lineasDeTrabajo.setControlador(this);
        lineasDeTrabajo.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(lineasDeTrabajo.L1) && auteticacion.ObtenerRol().equals("SupervisorLinea")) {
            this.linea = 1;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(1, "En Proceso");

            if (op != null) {
                vistaSupervisorLinea.ocultarPanel2();
                vistaSupervisorLinea.setOP(op);
            } else {
                vistaSupervisorLinea.ocultarPanel1();
            }

            vistaSupervisorLinea.ejecutar();

        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L2) && auteticacion.ObtenerRol().equals("SupervisorLinea")) {

            this.linea = 2;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(2, "En Proceso");

            if (op != null) {
                vistaSupervisorLinea.ocultarPanel2();
            } else {
                vistaSupervisorLinea.ocultarPanel1();
            }

            vistaSupervisorLinea.ejecutar();
        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L3) && auteticacion.ObtenerRol().equals("SupervisorLinea")) {
            this.linea = 3;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(3, "En Proceso");

            if (op != null) {
                vistaSupervisorLinea.ocultarPanel2();
            } else {
                vistaSupervisorLinea.ocultarPanel1();
            }

            vistaSupervisorLinea.ejecutar();
        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L1) && auteticacion.ObtenerRol().equals("SupervisorCalidad")) {

            this.linea = 1;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(1, "En Proceso");

            if (op != null) {
                ControladorInspeccion controladorInspecion = new ControladorInspeccion(op);
                controladorInspecion.ejecutar(1);
               
               
            } else {
                JOptionPane.showMessageDialog(null, "No hay ordenes en la linea");
            }
        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L2) && auteticacion.ObtenerRol().equals("SupervisorCalidad")) {
            this.linea = 2;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(2, "En Proceso");

            if (op != null) {
                ControladorInspeccion controladorInspecion = new ControladorInspeccion(p);
                controladorInspecion.ejecutar(2);
            } else {
                JOptionPane.showMessageDialog(null, "No hay ordenes en la linea");
            }

        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L3) && auteticacion.ObtenerRol().equals("SupervisorCalidad")) {
            this.linea = 3;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(3, "En Proceso");

            if (op != null) {
                ControladorInspeccion controladorInspecion = new ControladorInspeccion(p);
                controladorInspecion.ejecutar(3);
            } else {
                JOptionPane.showMessageDialog(null, "No hay ordenes en la linea");
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorLinea.CREAR)) {
            vistaCrearOP.setControlador(this);
            vistaCrearOP.cargarColores(r.colores);
            vistaCrearOP.cargarModelos(r.modelos);
            vistaCrearOP.ejecutar();
        }

        if (e.getActionCommand().equals(vistaCrearOP.btn_crearop)) {

            this.calendario = Calendar.getInstance();
            OrdenDeProduccion o = auteticacion.crearOP(Integer.parseInt(vistaCrearOP.getNumero()), r.buscarModelo(vistaCrearOP.getModelo()).getObjetivo(), r.buscarModelo(vistaCrearOP.getModelo()), linea, calendario.get(Calendar.HOUR_OF_DAY),vistaCrearOP.getColor());
            vistaCrearOP.dispose();
            vistaSupervisorLinea.ocultarPanel2();
            vistaSupervisorLinea.setOP(o);
        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L1) && auteticacion.ObtenerRol().equals("datosenlinea")) {
            this.linea = 1;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(1, "En Proceso");

            
            if (op != null) {
                
                ArrayList<String[]> lista = new ArrayList<String[]>();
                for (Hallasgo h : op.defectosEnUltimasHoras(r.defectos, Calendar.getInstance().get(Calendar.HOUR))) {

                    String linea[] = new String[4];
                    linea[0] = "" + h.getDefecto().getDescripcion();
                    linea[1] = "" + h.getDefecto().getTipo();
                    linea[2] = "" + h.getCantidad();
                    linea[3] = "" + h.getHora();
                  
                    lista.add(linea);
                }
                visualizarDatos.cargarListaDefectos(lista);

                visualizarDatos.ejecutar();
            }

        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L2)&& auteticacion.ObtenerRol().equals("datosenlinea")) {

            this.linea = 2;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(2, "En Proceso");

            if (op != null) {
                visualizarDatos.ejecutar();
            } else {

            }

        }

        if (e.getActionCommand().equals(lineasDeTrabajo.L3)&& auteticacion.ObtenerRol().equals("datosenlinea")) {
            this.linea = 3;
            OrdenDeProduccion op = new OrdenDeProduccion();
            op = buscarOP(3, "En Proceso");

            if (op != null) {
                visualizarDatos.ejecutar();
            } else {

            }

        }

    }

    public OrdenDeProduccion buscarOP(int Linea, String estado) {
        OrdenDeProduccion op = new OrdenDeProduccion();
        op = null;

        for (OrdenDeProduccion q : r.ordenes) {
            if (q.getLinea() == Linea && q.getEstado().equals(estado)) {
                op = q;

            }
        }

        return op;
    }

}
