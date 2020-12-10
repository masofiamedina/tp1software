/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import adaptador.Controlador;
import adaptador.ControladorInspeccion;
import static cliente.AutenticacionVista.BTN_INGRESAR;
import javax.swing.JTextField;


public class VistaSupervisorCalidad extends javax.swing.JFrame {

    public static final String RI_Despegado = "RI_Despegado";
    public static final String RI_Descolorido = "RI_Descolorido";
    public static final String RI_Deformado = "RI_Deformado";
    
    public static final String OI_Despegado = "OI_Despegado";
    public static final String OI_Descolorido = "OI_Descolorido";
    public static final String OI_Partido = "OI_Partido";
    
    public static final String RD_Despegado = "RD_Despegado";
    public static final String RD_Descolorido = "RD_Descolorido";
    public static final String RD_Deformado = "RD_Deformado";
    
    public static final String OD_Despegado = "OD_Despegado";
    public static final String OD_Descolorido = "OD_Descolorido";
    public static final String OD_Partido = "OD_Partido";
    
    
    public static final String RI_Despegado_Restar = "RI_Despegado_Restar";
    public static final String RI_Descolorido_Restar = "RI_Descolorido_Restar";
    public static final String RI_Deformado_Restar = "RI_Deformado_Restar";
    
    public static final String OI_Despegado_Restar = "OI_Despegado_Restar";
    public static final String OI_Descolorido_Restar = "OI_Descolorido_Restar";
    public static final String OI_Partido_Restar = "OI_Partido_Restar";
    
    public static final String RD_Despegado_Restar = "RD_Despegado_Restar";
    public static final String RD_Descolorido_Restar = "RD_Descolorido_Restar";
    public static final String RD_Deformado_Restar = "RD_Deformado_Restar";
    
    public static final String OD_Despegado_Restar = "OD_Despegado_Restar";
    public static final String OD_Descolorido_Restar = "OD_Descolorido_Restar";
    public static final String OD_Partido_Restar = "OD_Partido_Restar";
    
    public static final String FinalizarInspeccion = "FINALIZARINSPECCION";
    
    public static final String AGREGARPAR = "agregarPar";
    
    public static final String Primera = "Primera";
    public static final String RestarPrimera = "RestarPrimera";
    
    public VistaSupervisorCalidad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void ejecutar(){
        this.setVisible(true);
        
    }
    public void setControlador(ControladorInspeccion control){
        btnFinalizar.setActionCommand(FinalizarInspeccion);
        btnFinalizar.addActionListener(control);  
        
        RIDespegado.setActionCommand(RI_Despegado);
        RIDespegado.addActionListener(control);        
        
        RIDescolorido.setActionCommand(RI_Descolorido);
        RIDescolorido.addActionListener(control);        
        
        RIDeformado.setActionCommand(RI_Deformado);
        RIDeformado.addActionListener(control);  
        
        OIDespegado.setActionCommand(OI_Despegado);
        OIDespegado.addActionListener(control);        
        
        OIDescolorido.setActionCommand(OI_Descolorido);
        OIDescolorido.addActionListener(control);        
        
        OIPartido.setActionCommand(OI_Partido);
        OIPartido.addActionListener(control);  
        
        
        RDDespegado.setActionCommand(RD_Despegado);
        RDDespegado.addActionListener(control);        
        
        RDDescolorido.setActionCommand(RD_Descolorido);
        RDDescolorido.addActionListener(control);        
        
        RDDeformado.setActionCommand(RD_Deformado);
        RDDeformado.addActionListener(control); 
        
        ODDespegado.setActionCommand(OD_Despegado);
        ODDespegado.addActionListener(control);        
        
        ODDescolorido.setActionCommand(OD_Descolorido);
        ODDescolorido.addActionListener(control);        
        
        ODPartido.setActionCommand(OD_Partido);
        ODPartido.addActionListener(control);  
        
        RIDespegadoRestar.setActionCommand(RI_Despegado_Restar);
        RIDespegadoRestar.addActionListener(control);        
        
        RIDescoloridoRestar.setActionCommand(RI_Descolorido_Restar);
        RIDescoloridoRestar.addActionListener(control);        
        
        RIDeformadoRestar.setActionCommand(RI_Deformado_Restar);
        RIDeformadoRestar.addActionListener(control);  
        
        OIDespegadoRestar.setActionCommand(OI_Despegado_Restar);
        OIDespegadoRestar.addActionListener(control);        
        
        OIDescoloridoRestar.setActionCommand(OI_Descolorido_Restar);
        OIDescoloridoRestar.addActionListener(control);        
        
        OIPartidoRestar.setActionCommand(OI_Partido_Restar);
        OIPartidoRestar.addActionListener(control);  
        
        
        RDDespegadoRestar.setActionCommand(RD_Despegado_Restar);
        RDDespegadoRestar.addActionListener(control);        
        
        RDDescoloridoRestar.setActionCommand(RD_Descolorido_Restar);
        RDDescoloridoRestar.addActionListener(control);        
        
        RDDeformadoRestar.setActionCommand(RD_Deformado_Restar);
        RDDeformadoRestar.addActionListener(control); 
        
        ODDespegadoRestar.setActionCommand(OD_Despegado_Restar);
        ODDespegadoRestar.addActionListener(control);        
        
        ODDescoloridoRestar.setActionCommand(OD_Descolorido_Restar);
        ODDescoloridoRestar.addActionListener(control);        
        
        ODPartidoRestar.setActionCommand(OD_Partido_Restar);
        ODPartidoRestar.addActionListener(control);  
        
        PrimeraCalidad.setActionCommand(Primera);
        PrimeraCalidad.addActionListener(control);  
        
        btnAgregarPar.setActionCommand(AGREGARPAR);
        btnAgregarPar.addActionListener(control);  
        
        
        
        
        
    }
    
    public void cargarHorasDeInspeccion(int horaInicio){
        int aux = horaInicio+7;
        
        while(horaInicio < aux){
            cbxHoraDeInspeccion.addItem(""+horaInicio);
            horaInicio++;
        }
    }
    
    public int obtenerHoraDeHallazgo(){
        return Integer.parseInt(cbxHoraDeInspeccion.getSelectedItem().toString());
    }

    public void setTxtODDescolorido(int cantidad) {
        this.txtODDescolorido.setText(""+cantidad);
    }

    public void setTxtODDespegado(int cantidad) {
        this.txtODDespegado.setText(""+cantidad);
    }

    public void setTxtODPartido(int cantidad) {
        this.txtODPartido.setText(""+cantidad);
    }

    public void setTxtOIDescolorido(int cantidad) {
        this.txtOIDescolorido.setText(""+cantidad);
    }

    public void setTxtOIDespegado(int cantidad) {
        this.txtOIDespegado.setText(""+cantidad);
    }

    public void setTxtOIPartido(int cantidad) {
        this.txtOIPartido.setText(""+cantidad);
    }

    public void setTxtPrimeraCalidad(int cantidad) {
        this.txtPrimeraCalidad.setText(""+cantidad);
    }

    public void setTxtRDDeformado1(int cantidad) {
        this.txtRDDeformado1.setText(""+cantidad);
    }

    public void setTxtRDDescolorido1(int cantidad) {
        this.txtRDDescolorido1.setText(""+cantidad);
    }

    public void setTxtRDDespegado1(int cantidad) {
        this.txtRDDespegado1.setText(""+cantidad);
    }

    public void setTxtRIDeformado(int cantidad) {
        this.txtRIDeformado.setText(""+cantidad);
    }

    public void setTxtRIDescolorido(int cantidad) {
        this.txtRIDescolorido.setText(""+cantidad);
    }

    public void setTxtRIDespegado(int cantidad) {
        this.txtRIDespegado.setText(""+cantidad);
    }
    
     public void setTxtPrimeraCalidad(String cantidad){
        txtPrimeraCalidad.setText(cantidad);
    }
    
    public void setLinea(String Linea){
        txtLinea.setText(Linea);
    }
     
    public void setNumeroOrden(String NOP){
        txtNOP.setText(NOP);
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        RIDespegado = new javax.swing.JButton();
        RIDescolorido = new javax.swing.JButton();
        RIDeformado = new javax.swing.JButton();
        OIPartido = new javax.swing.JButton();
        RIDespegadoRestar = new javax.swing.JButton();
        btnRestarPrimeraCalidad = new javax.swing.JButton();
        RIDescoloridoRestar = new javax.swing.JButton();
        OIDespegadoRestar = new javax.swing.JButton();
        OIPartidoRestar = new javax.swing.JButton();
        OIDescoloridoRestar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRIDespegado = new javax.swing.JTextField();
        txtRIDescolorido = new javax.swing.JTextField();
        txtRIDeformado = new javax.swing.JTextField();
        txtOIDespegado = new javax.swing.JTextField();
        txtOIDescolorido = new javax.swing.JTextField();
        txtPrimeraCalidad = new javax.swing.JTextField();
        PrimeraCalidad = new javax.swing.JButton();
        RIDeformadoRestar = new javax.swing.JButton();
        txtOIPartido = new javax.swing.JTextField();
        OIDespegado = new javax.swing.JButton();
        OIDescolorido = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        RDDespegado = new javax.swing.JButton();
        RDDescolorido = new javax.swing.JButton();
        RDDeformado = new javax.swing.JButton();
        RDDespegadoRestar = new javax.swing.JButton();
        RDDescoloridoRestar = new javax.swing.JButton();
        txtRDDespegado1 = new javax.swing.JTextField();
        txtRDDescolorido1 = new javax.swing.JTextField();
        txtRDDeformado1 = new javax.swing.JTextField();
        RDDeformadoRestar = new javax.swing.JButton();
        ODPartido = new javax.swing.JButton();
        ODDespegadoRestar = new javax.swing.JButton();
        ODPartidoRestar = new javax.swing.JButton();
        ODDescoloridoRestar = new javax.swing.JButton();
        txtODDespegado = new javax.swing.JTextField();
        txtODDescolorido = new javax.swing.JTextField();
        txtODPartido = new javax.swing.JTextField();
        ODDespegado = new javax.swing.JButton();
        ODDescolorido = new javax.swing.JButton();
        txtNOP = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        btnAgregarPar = new javax.swing.JButton();
        cbxHoraDeInspeccion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inspeccion de calzado");

        jLabel2.setText("Orden de Produccion Nº :");

        jLabel3.setText("Usuario :");

        jLabel4.setText("Linea: ");

        btnFinalizar.setText("Finalizar Inspeccion");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Pie Izquierdo : ");

        jLabel6.setText("Pie Derecho:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        RIDespegado.setText("Despegado");

        RIDescolorido.setText("Descolorido");

        RIDeformado.setText("Deformado");

        OIPartido.setText("Partido");

        RIDespegadoRestar.setText("-");

        btnRestarPrimeraCalidad.setText("-");

        RIDescoloridoRestar.setText("-");

        OIDespegadoRestar.setText("-");

        OIPartidoRestar.setText("-");

        OIDescoloridoRestar.setText("-");

        jLabel8.setText("Reproceso");

        jLabel9.setText("Observados");

        jLabel11.setText("Observados");

        txtRIDespegado.setEditable(false);
        txtRIDespegado.setText("0");
        txtRIDespegado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRIDespegadoActionPerformed(evt);
            }
        });

        txtRIDescolorido.setEditable(false);
        txtRIDescolorido.setText("0");

        txtRIDeformado.setEditable(false);
        txtRIDeformado.setText("0");

        txtOIDespegado.setEditable(false);
        txtOIDespegado.setText("0");

        txtOIDescolorido.setEditable(false);
        txtOIDescolorido.setText("0");

        txtPrimeraCalidad.setEditable(false);
        txtPrimeraCalidad.setText("0");

        PrimeraCalidad.setText("Primera Calidad");

        RIDeformadoRestar.setText("-");

        txtOIPartido.setEditable(false);
        txtOIPartido.setText("0");

        OIDespegado.setText("Despegado");

        OIDescolorido.setText("Descolorido");

        jLabel12.setText("Reproceso");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        RDDespegado.setText("Despegado");

        RDDescolorido.setText("Descolorido");

        RDDeformado.setText("Deformado");

        RDDespegadoRestar.setText("-");

        RDDescoloridoRestar.setText("-");

        txtRDDespegado1.setEditable(false);
        txtRDDespegado1.setText("0");

        txtRDDescolorido1.setEditable(false);
        txtRDDescolorido1.setText("0");

        txtRDDeformado1.setEditable(false);
        txtRDDeformado1.setText("0");

        RDDeformadoRestar.setText("-");

        ODPartido.setText("Partido");

        ODDespegadoRestar.setText("-");

        ODPartidoRestar.setText("-");

        ODDescoloridoRestar.setText("-");

        txtODDespegado.setEditable(false);
        txtODDespegado.setText("0");

        txtODDescolorido.setEditable(false);
        txtODDescolorido.setText("0");

        txtODPartido.setEditable(false);
        txtODPartido.setText("0");

        ODDespegado.setText("Despegado");

        ODDescolorido.setText("Descolorido");

        txtNOP.setEnabled(false);

        txtLinea.setEnabled(false);

        btnAgregarPar.setText("AgregarPar");
        btnAgregarPar.setEnabled(false);

        jLabel7.setText("Hora de Inspeccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNOP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RIDespegadoRestar)
                                    .addComponent(RIDescoloridoRestar)
                                    .addComponent(RIDeformadoRestar)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel8))
                                    .addComponent(RIDespegado)
                                    .addComponent(RIDescolorido)
                                    .addComponent(RIDeformado))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtRIDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtRIDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtRIDeformado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OIDespegadoRestar)
                                            .addComponent(OIDescoloridoRestar)
                                            .addComponent(OIPartidoRestar))))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(OIDespegado)
                                    .addComponent(OIDescolorido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(OIPartido)))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOIDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOIDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOIPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RDDespegadoRestar)
                                    .addComponent(RDDescoloridoRestar)
                                    .addComponent(RDDeformadoRestar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RDDespegado)
                                            .addComponent(RDDescolorido)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel12))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RDDeformado)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRDDespegado1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRDDescolorido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRDDeformado1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ODDespegadoRestar)
                                    .addComponent(ODDescoloridoRestar)
                                    .addComponent(ODPartidoRestar))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(ODDespegado)
                                    .addComponent(ODDescolorido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ODPartido)))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtODDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtODDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtODPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxHoraDeInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRestarPrimeraCalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrimeraCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrimeraCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(btnAgregarPar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxHoraDeInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(RIDespegadoRestar)
                        .addGap(51, 51, 51)
                        .addComponent(RIDescoloridoRestar)
                        .addGap(52, 52, 52)
                        .addComponent(RIDeformadoRestar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RIDespegado)
                            .addComponent(txtRIDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RIDescolorido)
                            .addComponent(txtRIDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RIDeformado)
                            .addComponent(txtRIDeformado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(OIDespegadoRestar)
                                .addGap(47, 47, 47)
                                .addComponent(OIDescoloridoRestar)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OIPartidoRestar)
                                    .addComponent(OIPartido)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(OIDespegado)
                        .addGap(47, 47, 47)
                        .addComponent(OIDescolorido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtOIDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtOIDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtOIPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(RDDespegadoRestar)
                        .addGap(47, 47, 47)
                        .addComponent(RDDescoloridoRestar)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RDDeformadoRestar)
                            .addComponent(RDDeformado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addComponent(RDDespegado)
                        .addGap(47, 47, 47)
                        .addComponent(RDDescolorido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtRDDespegado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtRDDescolorido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtRDDeformado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ODDespegadoRestar)
                        .addGap(47, 47, 47)
                        .addComponent(ODDescoloridoRestar)
                        .addGap(47, 47, 47)
                        .addComponent(ODPartidoRestar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ODDespegado)
                        .addGap(47, 47, 47)
                        .addComponent(ODDescolorido)
                        .addGap(47, 47, 47)
                        .addComponent(ODPartido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtODDespegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtODDescolorido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtODPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestarPrimeraCalidad)
                    .addComponent(PrimeraCalidad)
                    .addComponent(txtPrimeraCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtRIDespegadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRIDespegadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRIDespegadoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ODDescolorido;
    private javax.swing.JButton ODDescoloridoRestar;
    private javax.swing.JButton ODDespegado;
    private javax.swing.JButton ODDespegadoRestar;
    private javax.swing.JButton ODPartido;
    private javax.swing.JButton ODPartidoRestar;
    private javax.swing.JButton OIDescolorido;
    private javax.swing.JButton OIDescoloridoRestar;
    private javax.swing.JButton OIDespegado;
    private javax.swing.JButton OIDespegadoRestar;
    private javax.swing.JButton OIPartido;
    private javax.swing.JButton OIPartidoRestar;
    private javax.swing.JButton PrimeraCalidad;
    private javax.swing.JButton RDDeformado;
    private javax.swing.JButton RDDeformadoRestar;
    private javax.swing.JButton RDDescolorido;
    private javax.swing.JButton RDDescoloridoRestar;
    private javax.swing.JButton RDDespegado;
    private javax.swing.JButton RDDespegadoRestar;
    private javax.swing.JButton RIDeformado;
    private javax.swing.JButton RIDeformadoRestar;
    private javax.swing.JButton RIDescolorido;
    private javax.swing.JButton RIDescoloridoRestar;
    private javax.swing.JButton RIDespegado;
    private javax.swing.JButton RIDespegadoRestar;
    private javax.swing.JButton btnAgregarPar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRestarPrimeraCalidad;
    private javax.swing.JComboBox<String> cbxHoraDeInspeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtNOP;
    private javax.swing.JTextField txtODDescolorido;
    private javax.swing.JTextField txtODDespegado;
    private javax.swing.JTextField txtODPartido;
    private javax.swing.JTextField txtOIDescolorido;
    private javax.swing.JTextField txtOIDespegado;
    private javax.swing.JTextField txtOIPartido;
    private javax.swing.JTextField txtPrimeraCalidad;
    private javax.swing.JTextField txtRDDeformado1;
    private javax.swing.JTextField txtRDDescolorido1;
    private javax.swing.JTextField txtRDDespegado1;
    private javax.swing.JTextField txtRIDeformado;
    private javax.swing.JTextField txtRIDescolorido;
    private javax.swing.JTextField txtRIDespegado;
    // End of variables declaration//GEN-END:variables
}
