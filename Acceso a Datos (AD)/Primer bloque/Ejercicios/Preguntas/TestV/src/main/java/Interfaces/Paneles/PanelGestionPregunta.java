/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Paneles;

import Clases.GestionPreguntas;
import Clases.Pregunta;
import Clases.Respuesta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class PanelGestionPregunta extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearPregunta
     */
    GestionPreguntas gp;
    int posicion=-1;
    String[] listaPreguntas;
    public PanelGestionPregunta(GestionPreguntas m) {
        initComponents();
        gp = m;
        refrescarLista();
    }
    
    public void refrescarLista(){
        listaPreguntas = new String[gp.getListPreguntas().size()];
        for(int i = 0; i < listaPreguntas.length; i++){
            listaPreguntas[i] = gp.getListPreguntas().get(i).getPregunta();
        }
        JlistaPreguntas.setListData(listaPreguntas);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoValidar = new javax.swing.ButtonGroup();
        panelAdd_pregunta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textPregunta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textRespuesta1 = new javax.swing.JTextField();
        textRespuesta2 = new javax.swing.JTextField();
        textRespuesta3 = new javax.swing.JTextField();
        textRespuesta4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        radioRespuesta1 = new javax.swing.JRadioButton();
        radioRespuesta2 = new javax.swing.JRadioButton();
        radioRespuesta3 = new javax.swing.JRadioButton();
        radioRespuesta4 = new javax.swing.JRadioButton();
        btn_enviar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        panelPreguntas = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistaPreguntas = new javax.swing.JList<>();

        panelAdd_pregunta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Crear / Modificar ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Pregunta:");

        jLabel3.setText("Respuesta 1:");

        jLabel4.setText("Respuesta 2:");

        jLabel5.setText("Respuesta 3:");

        jLabel6.setText("Respuesta 4:");

        jLabel7.setText("Valida:");

        grupoValidar.add(radioRespuesta1);
        radioRespuesta1.setSelected(true);
        radioRespuesta1.setText("Respuesta 1");
        radioRespuesta1.setActionCommand("0");

        grupoValidar.add(radioRespuesta2);
        radioRespuesta2.setText("Respuesta 2");
        radioRespuesta2.setActionCommand("1");

        grupoValidar.add(radioRespuesta3);
        radioRespuesta3.setText("Respuesta 3");
        radioRespuesta3.setActionCommand("2");

        grupoValidar.add(radioRespuesta4);
        radioRespuesta4.setText("Respuesta 4");
        radioRespuesta4.setActionCommand("3");

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdd_preguntaLayout = new javax.swing.GroupLayout(panelAdd_pregunta);
        panelAdd_pregunta.setLayout(panelAdd_preguntaLayout);
        panelAdd_preguntaLayout.setHorizontalGroup(
            panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                        .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioRespuesta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPregunta)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdd_preguntaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_enviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        panelAdd_preguntaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textRespuesta1, textRespuesta2, textRespuesta3, textRespuesta4});

        panelAdd_preguntaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radioRespuesta1, radioRespuesta2, radioRespuesta3, radioRespuesta4});

        panelAdd_preguntaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_enviar, btn_limpiar});

        panelAdd_preguntaLayout.setVerticalGroup(
            panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdd_preguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radioRespuesta1)
                    .addComponent(radioRespuesta2)
                    .addComponent(radioRespuesta3)
                    .addComponent(radioRespuesta4))
                .addGap(22, 22, 22)
                .addGroup(panelAdd_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enviar)
                    .addComponent(btn_limpiar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelPreguntas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Menu preguntas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        JlistaPreguntas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JlistaPreguntas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JlistaPreguntasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JlistaPreguntas);

        javax.swing.GroupLayout panelPreguntasLayout = new javax.swing.GroupLayout(panelPreguntas);
        panelPreguntas.setLayout(panelPreguntasLayout);
        panelPreguntasLayout.setHorizontalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar))
                .addContainerGap())
        );

        panelPreguntasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_editar, btn_eliminar});

        panelPreguntasLayout.setVerticalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addGroup(panelPreguntasLayout.createSequentialGroup()
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAdd_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelAdd_pregunta, panelPreguntas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAdd_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        if(posicion == -1){
            List<Respuesta> r = new ArrayList<Respuesta>();
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta1.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta2.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta3.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta4.isSelected()));
            gp.addPregunta(new Pregunta(textPregunta.getText(),r));
            refrescarLista();
        }
        else{
            List<Respuesta> r = new ArrayList<Respuesta>();
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta1.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta2.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta3.isSelected()));
            r.add(new Respuesta(textRespuesta1.getText(), radioRespuesta4.isSelected()));
            gp.modificarPregunta(posicion, new Pregunta(textPregunta.getText(),r));
            refrescarLista();
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void JlistaPreguntasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlistaPreguntasValueChanged
        
    }//GEN-LAST:event_JlistaPreguntasValueChanged

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        posicion = JlistaPreguntas.getSelectedIndex();
        Pregunta p = gp.getListPreguntas().get(posicion);
        
        textPregunta.setText(p.getPregunta());
        textRespuesta1.setText(p.getListRespuestas().get(0).getRespuesta());
        textRespuesta2.setText(p.getListRespuestas().get(1).getRespuesta());
        textRespuesta3.setText(p.getListRespuestas().get(2).getRespuesta());
        textRespuesta4.setText(p.getListRespuestas().get(3).getRespuesta());
        radioRespuesta1.setSelected(p.getListRespuestas().get(0).getValida());
        radioRespuesta2.setSelected(p.getListRespuestas().get(1).getValida());
        radioRespuesta3.setSelected(p.getListRespuestas().get(2).getValida());
        radioRespuesta4.setSelected(p.getListRespuestas().get(3).getValida());
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        posicion = -1;
        textPregunta.setText("");
        textRespuesta1.setText("");
        textRespuesta2.setText("");
        textRespuesta3.setText("");
        textRespuesta4.setText("");
        radioRespuesta1.setSelected(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if(gp.getListPreguntas().size() == 15){
            JOptionPane.showMessageDialog(null,"No se ha pod??do eliminar. (M??nimo 15)");
        }
        else{
            posicion = JlistaPreguntas.getSelectedIndex();
            Pregunta p = gp.getListPreguntas().get(posicion);
            gp.borrarPregunta(p);
            refrescarLista();
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistaPreguntas;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.ButtonGroup grupoValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAdd_pregunta;
    private javax.swing.JPanel panelPreguntas;
    private javax.swing.JRadioButton radioRespuesta1;
    private javax.swing.JRadioButton radioRespuesta2;
    private javax.swing.JRadioButton radioRespuesta3;
    private javax.swing.JRadioButton radioRespuesta4;
    private javax.swing.JTextField textPregunta;
    private javax.swing.JTextField textRespuesta1;
    private javax.swing.JTextField textRespuesta2;
    private javax.swing.JTextField textRespuesta3;
    private javax.swing.JTextField textRespuesta4;
    // End of variables declaration//GEN-END:variables
}
