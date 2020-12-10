/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import servidor.Hallasgo;
import servidor.OrdenDeProduccion;
import servidor.Turno;
import servidor.EnumTipoPie;
import servidor.Defecto;
import servidor.TipoDefecto;
import repositorio.Repositorio;
import cliente.VistaSupervisorCalidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author fiume
 */
public class ControladorInspeccion implements ActionListener {

    private Repositorio r = Repositorio.getRepositorio();
    private VistaSupervisorCalidad vistaSupervisorCalidad;
    private OrdenDeProduccion OP;
    private ArrayList<Hallasgo> defectosPorHora;
    private Calendar calendario;
    private int hora;

    public ControladorInspeccion(OrdenDeProduccion OP) {
        this.OP = OP;
        vistaSupervisorCalidad = new VistaSupervisorCalidad();
        defectosPorHora = new ArrayList<Hallasgo>();
        defectosPorHora = OP.getDefectoPorHora();
    }

    public void ejecutar(int linea) {
        
        vistaSupervisorCalidad.setControlador(this);
        vistaSupervisorCalidad.setLinea("" + linea);
        vistaSupervisorCalidad.setNumeroOrden("" + OP.getNumero());
        vistaSupervisorCalidad.cargarHorasDeInspeccion(2);
        vistaSupervisorCalidad.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Deformado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Deformado") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtRIDeformado(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Despegado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Despegado") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtRIDespegado(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;

                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Descolorido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Descolorido") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtRIDescolorido(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Descolorido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Descolorido") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtOIDescolorido(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Despegado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Despegado") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtOIDespegado(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Partido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Partido") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Izquierdo",1);
                    vistaSupervisorCalidad.setTxtOIPartido(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Deformado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Deformado") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtRDDeformado1(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;

                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Despegado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Despegado") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtRDDespegado1(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;

                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Descolorido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Descolorido") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtRDDescolorido1(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;
                }
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Descolorido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Descolorido") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtODDescolorido(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;
                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Despegado)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Despegado") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtODDespegado(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;
                }
            }
        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Partido)) {

            Defecto def;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Partido") && d.getTipo().equals(TipoDefecto.Observado.toString())) {
                    def = d;
                    this.agregarDefectoActual(def, "Derecho",1);
                    vistaSupervisorCalidad.setTxtODPartido(this.contabilizarDefectosPorTipo(def, "Derecho"));
                    break;

                }
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.Primera)) {
            OP.AgregarParesDePrimera();
            vistaSupervisorCalidad.setTxtPrimeraCalidad(OP.getParesDePrimera());

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.FinalizarInspeccion)) {

            OP.setDefectosPorHora(defectosPorHora);

            for (Turno t : r.turnos) {
                OP.MostrarDefectosTotales(t, r.defectos);
            }
        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.AGREGARPAR)) {

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Deformado_Restar)) {

            Defecto def = new Defecto();
            int aux = 0;

            for (Defecto d : r.defectos) {
                if (d.getDescripcion().equals("Deformado") && d.getTipo().equals(TipoDefecto.Reproceso.toString())) {
                    def = d;
                    this.agregarDefectoActual(d, "Izquierdo", -1);
                    vistaSupervisorCalidad.setTxtRIDeformado(this.contabilizarDefectosPorTipo(def, "Izquierdo"));
                    break;
                }
            }
            
            
            

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Despegado_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RI_Descolorido_Restar)) {

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Descolorido_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Despegado_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OI_Partido_Restar)) {

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Deformado_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Despegado_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.RD_Descolorido_Restar)) {

        }

        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Descolorido_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Despegado_Restar)) {

        }
        if (e.getActionCommand().equals(vistaSupervisorCalidad.OD_Partido_Restar)) {

        }

    }

    public void agregarDefectoActual(Defecto d, String tipoPie, int valor) {
        //this.calendario = Calendar.getInstance();
        this.hora = vistaSupervisorCalidad.obtenerHoraDeHallazgo(); //calendario.get(Calendar.HOUR_OF_DAY);

        Hallasgo ht = new Hallasgo();

        if (tipoPie.equals("Izquierdo")) {
            ht = new Hallasgo(hora, d, EnumTipoPie.Izquierdo.toString(),hora,valor);
        }

        if (tipoPie.equals("Derecho")) {
            ht = new Hallasgo(hora, d, EnumTipoPie.Derecho.toString(),hora,valor);
        }

        defectosPorHora.add(ht);
    }

    public int contabilizarDefectosPorTipo(Defecto defecto, String tipoPie) {

        int cantidadDefectos = 0;

        for (Hallasgo dh : defectosPorHora) {
            if (dh.getDefecto().getDescripcion().equals(defecto.getDescripcion()) && dh.getDefecto().getTipo().equals(defecto.getTipo()) && dh.getPie().equals(tipoPie)) {
                cantidadDefectos = cantidadDefectos+dh.getCantidad();
            }
        }

        return cantidadDefectos;

    }

}
