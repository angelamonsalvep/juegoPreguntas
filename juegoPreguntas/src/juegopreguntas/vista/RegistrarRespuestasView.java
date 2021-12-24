/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegopreguntas.vista;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import juegopreguntas.conexion.Conexion;
import juegopreguntas.model.Categoria;
import juegopreguntas.model.Pregunta;
import juegopreguntas.model.Respuesta;

/**
 *
 * @author Angelita
 */
public class RegistrarRespuestasView extends javax.swing.JFrame {

    Respuesta respuesta = new Respuesta();
    String opcionCorrecta, opcionIncorrecta1, opcionIncorrecta2, opcionIncorrecta3;
    
    /**
     * Creates new form Registar
     */
    public RegistrarRespuestasView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jl_pregunta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_respuestaCorrecta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_opcionInc1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_opcionInc2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta_OpcionInc3 = new javax.swing.JTextArea();
        jb_guardarOpciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("OPCIONES DE RESPUESTAS");

        jl_pregunta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_pregunta.setText("Enunciado de la Pregunta..........");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Respuesta Correcta: ");

        jta_respuestaCorrecta.setColumns(20);
        jta_respuestaCorrecta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jta_respuestaCorrecta.setLineWrap(true);
        jta_respuestaCorrecta.setRows(5);
        jScrollPane1.setViewportView(jta_respuestaCorrecta);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Opción incorrecta 1: ");

        jta_opcionInc1.setColumns(20);
        jta_opcionInc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jta_opcionInc1.setRows(5);
        jScrollPane2.setViewportView(jta_opcionInc1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Opción incorrecta 2: ");

        jta_opcionInc2.setColumns(20);
        jta_opcionInc2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jta_opcionInc2.setRows(5);
        jScrollPane3.setViewportView(jta_opcionInc2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Opción incorrecta 3: ");

        jta_OpcionInc3.setColumns(20);
        jta_OpcionInc3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jta_OpcionInc3.setRows(5);
        jScrollPane4.setViewportView(jta_OpcionInc3);

        jb_guardarOpciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_guardarOpciones.setText("GUARDAR");
        jb_guardarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jb_guardarOpciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jl_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jl_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jb_guardarOpciones)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarOpcionesActionPerformed
        // TODO add your handling code here:
        obtenerStringOpcionesRespOfForm();
        registarRespuesta(opcionCorrecta, true);
        registarRespuesta(opcionIncorrecta1, false);
        registarRespuesta(opcionIncorrecta2, false);
        registarRespuesta(opcionIncorrecta3, false);
        this.dispose();
        
    }//GEN-LAST:event_jb_guardarOpcionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarRespuestasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRespuestasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRespuestasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRespuestasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRespuestasView().setVisible(true);
            }
        });
    }
    
    
    /*--------------------------------------------------------------
    función para guardar en variables la descripción de cada opción de respuesta, para luego
    ----------------------------------------------------------------*/
    private void obtenerStringOpcionesRespOfForm() {
        opcionCorrecta = jta_respuestaCorrecta.getText();
        opcionIncorrecta1 = jta_opcionInc1.getText();
        opcionIncorrecta2 = jta_opcionInc2.getText();
        opcionIncorrecta3 = jta_OpcionInc3.getText();
        
    }
    
    /*--------------------------------------------------------------
    función para traer el enunciado de la pregunta creada en el formulario
    RegistrarPreguntaView
    ----------------------------------------------------------------*/
    public void mostrarPregunta(String Pregunta) {
        System.out.println("pregunta:   " + Pregunta);
        jl_pregunta.setText(Pregunta);
    }
    
    /*--------------------------------------------------------------
    función para registrar una respuesta en la base de datos
    recibe como parametros:
    String respuesta: la descripcion de la respuesta a guardar
    boolean estado: estado de la respuesta a guardar. 
                (true para las respuestas correctas)
                (false para las respuestas incorrectas)
    --------------------------------------------------------------*/
    private void registarRespuesta(String respuesta, boolean estado){
          
        Conexion conecta = new Conexion();
        Connection con = (Connection) conecta.getConexion();
        int id_pregunta = consultarPreguntaByDescripcion();
        
        if(respuesta.equalsIgnoreCase("")){
                  JOptionPane.showMessageDialog(null, "Debe diligenciar todos los datos", "Error", JOptionPane.WARNING_MESSAGE);
              }else {
                   try{
                         PreparedStatement ps = con.prepareStatement("INSERT INTO respuesta (descripcion_resp, estado_resp, id_preg_resp) VALUES (?,?,?)");
                         ps.setString(1, respuesta);
                         ps.setInt(2, booleanToInteger(estado));
                         ps.setInt(3, id_pregunta);

                         ps.executeUpdate();
                         
                         JOptionPane.showMessageDialog(null, "Agregado Correctamente");
                     }catch (Exception e){
                          System.out.println("Error al insertar ,"+e);

                     }
              }
        
        
    }
    
    /*--------------------------------------------------------------
    función que recibe un boolean y  retorna entero 
    1 si es true
    2 si es false
    --------------------------------------------------------------*/
    private int booleanToInteger(boolean estado) {
        if(estado)
            return 1;
        else
            return 0;
    }
    
    
        /*--------------------------------------------------------------
    función que retorna el id de la pregunta actual, este id
    se obtiene de la base de datos, por medio de una consulta SQL.
    --------------------------------------------------------------*/
    private int consultarPreguntaByDescripcion(){
        
        int id_pregunta=0;
        try{
            Conexion conecta = new Conexion();
            Connection con = (Connection) conecta.getConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `pregunta`.`id_preg`" +
                                        "FROM `pregunta` "
                                        + "WHERE pregunta.descripcion_preg like '"+ jl_pregunta.getText() +"';");
            
            
           while(rs.next()){
               id_pregunta= Integer.parseInt(rs.getString(1));
                System.out.println("id_preg:  " + rs.getString(1));
           }
                
                        
        } catch (Exception e){
            System.out.println(e);            
        }
        
        return id_pregunta;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_guardarOpciones;
    private javax.swing.JLabel jl_pregunta;
    private javax.swing.JTextArea jta_OpcionInc3;
    private javax.swing.JTextArea jta_opcionInc1;
    private javax.swing.JTextArea jta_opcionInc2;
    private javax.swing.JTextArea jta_respuestaCorrecta;
    // End of variables declaration//GEN-END:variables
}
