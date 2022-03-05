/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joseosejo_lab7;

import java.io.IOException;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jcoq2
 */
public class TablaPosiciones extends javax.swing.JFrame {

    /**
     * Creates new form TablaPosiciones
     */
    public TablaPosiciones() {
        initComponents();
        crearEquipo.setEnabled(false);
        modificarEquipo.setEnabled(false);
        eliminarEquipo.setEnabled(false);
        simularPartido.setEnabled(false);
        tablaPosicionesEquipos.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearEquipo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        equipoNombreTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ModificarEquipo = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        posEquipo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        equipoModif = new javax.swing.JTextField();
        SimulacionPartido = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        equipo1 = new javax.swing.JComboBox<>();
        equipo2 = new javax.swing.JComboBox<>();
        golesEquipo1 = new javax.swing.JLabel();
        golesEquipo2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        EliminarEquipo = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        equipoPosEliminar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TablaPosiciones = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPosiciones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraMenuEquipos = new javax.swing.JMenuBar();
        menuEquipo = new javax.swing.JMenu();
        crearEquipo = new javax.swing.JMenuItem();
        modificarEquipo = new javax.swing.JMenuItem();
        eliminarEquipo = new javax.swing.JMenuItem();
        cargarArchivo = new javax.swing.JMenuItem();
        menuPartido = new javax.swing.JMenu();
        simularPartido = new javax.swing.JMenuItem();
        tablaPosicionesEquipos = new javax.swing.JMenuItem();

        jLabel2.setText("Crear Equipo");

        jLabel3.setText("Nombre del Equipo");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(equipoNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(equipoNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout CrearEquipoLayout = new javax.swing.GroupLayout(CrearEquipo.getContentPane());
        CrearEquipo.getContentPane().setLayout(CrearEquipoLayout);
        CrearEquipoLayout.setHorizontalGroup(
            CrearEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CrearEquipoLayout.setVerticalGroup(
            CrearEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setText("Posicion del Equipo");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nuevo Nombre");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(posEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(equipoModif))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addComponent(equipoModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout ModificarEquipoLayout = new javax.swing.GroupLayout(ModificarEquipo.getContentPane());
        ModificarEquipo.getContentPane().setLayout(ModificarEquipoLayout);
        ModificarEquipoLayout.setHorizontalGroup(
            ModificarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModificarEquipoLayout.setVerticalGroup(
            ModificarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton4.setText("Simulacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(golesEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(golesEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(golesEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golesEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout SimulacionPartidoLayout = new javax.swing.GroupLayout(SimulacionPartido.getContentPane());
        SimulacionPartido.getContentPane().setLayout(SimulacionPartidoLayout);
        SimulacionPartidoLayout.setHorizontalGroup(
            SimulacionPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SimulacionPartidoLayout.setVerticalGroup(
            SimulacionPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese posicion del Equipo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(equipoPosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addComponent(equipoPosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout EliminarEquipoLayout = new javax.swing.GroupLayout(EliminarEquipo.getContentPane());
        EliminarEquipo.getContentPane().setLayout(EliminarEquipoLayout);
        EliminarEquipoLayout.setHorizontalGroup(
            EliminarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        EliminarEquipoLayout.setVerticalGroup(
            EliminarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaPosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPosiciones);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TablaPosicionesLayout = new javax.swing.GroupLayout(TablaPosiciones.getContentPane());
        TablaPosiciones.getContentPane().setLayout(TablaPosicionesLayout);
        TablaPosicionesLayout.setHorizontalGroup(
            TablaPosicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TablaPosicionesLayout.setVerticalGroup(
            TablaPosicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joseosejo_lab7/futImagen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 208, Short.MAX_VALUE))
        );

        barraMenuEquipos.setToolTipText("");

        menuEquipo.setText("Equipo");

        crearEquipo.setText("Crear");
        crearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEquipoActionPerformed(evt);
            }
        });
        menuEquipo.add(crearEquipo);

        modificarEquipo.setText("Modificar");
        modificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEquipoActionPerformed(evt);
            }
        });
        menuEquipo.add(modificarEquipo);

        eliminarEquipo.setText("Eliminar");
        eliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEquipoActionPerformed(evt);
            }
        });
        menuEquipo.add(eliminarEquipo);

        cargarArchivo.setText("Cargar Archivo");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });
        menuEquipo.add(cargarArchivo);

        barraMenuEquipos.add(menuEquipo);

        menuPartido.setText("Partido");

        simularPartido.setText("Simular");
        simularPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularPartidoActionPerformed(evt);
            }
        });
        menuPartido.add(simularPartido);

        tablaPosicionesEquipos.setText("Tabla de Posiciones");
        menuPartido.add(tablaPosicionesEquipos);

        barraMenuEquipos.add(menuPartido);

        setJMenuBar(barraMenuEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEquipoActionPerformed
        EliminarEquipo.setVisible(true);
        EliminarEquipo.setResizable(false);
        EliminarEquipo.setLocationRelativeTo(null);
        EliminarEquipo.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarEquipoActionPerformed

    private void simularPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularPartidoActionPerformed
        try {
            admin.cargarArchivo();
            DefaultComboBoxModel model = (DefaultComboBoxModel) equipo1.getModel();
            DefaultComboBoxModel model2 = (DefaultComboBoxModel) equipo2.getModel();
            for (Equipo equipo : admin.getEquipos()) {
                model.addElement(equipo);
                model2.addElement(equipo);
            }
            equipo1.setModel(model);
            equipo2.setModel(model2);
            SimulacionPartido.setVisible(true);
            SimulacionPartido.setLocationRelativeTo(null);
            SimulacionPartido.setResizable(false);
            SimulacionPartido.pack();
        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_simularPartidoActionPerformed

    private void crearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEquipoActionPerformed
        CrearEquipo.setVisible(true);
        CrearEquipo.setLocationRelativeTo(null);
        CrearEquipo.setResizable(false);
        CrearEquipo.pack();

        // TODO add your handling code here:
    }//GEN-LAST:event_crearEquipoActionPerformed

    private void modificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEquipoActionPerformed
        ModificarEquipo.setVisible(true);
        ModificarEquipo.setLocationRelativeTo(null);
        ModificarEquipo.setResizable(false);
        ModificarEquipo.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEquipoActionPerformed

    private boolean equipoRepetido(String nombre) {
        for (Equipo equipo : admin.getEquipos()) {
            if (equipo.getNombreEquipo().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //for(Equipo equipo: admin.getEquipos()){
        //  if(equipo.getNombreEquipo().equalsIgnoreCase(equipoNombreTF.getText())){
        //    JOptionPane.showMessageDialog(null,"El Equipo ya existe!");
        //}else{
        if (equipoRepetido(equipoNombreTF.getText()) == true || equipoNombreTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El equipo esta Repetido");
        } else {
            try {
                admin.getEquipos().add(new Equipo(equipoNombreTF.getText(), 0, 0, 0, 0, 0, 0, 0, 0));
                admin.escribirArchivo();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, no se pudo crear el equipo!");
            }

        }

        /*admin.getEquipos().add(new Equipo(equipoNombreTF.getText(),0,0,0,0,0,0,0,0));
                DefaultComboBoxModel modifEquipo = (DefaultComboBoxModel) modificarEquipoCB.getModel();
                for(Equipo e: admin.getEquipos()){
                    modifEquipo.addElement(e.getNombreEquipo());
                }
                modificarEquipoCB.setModel(modifEquipo);*/
        //}
        //  }
        equipoNombreTF.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        try {
            admin = new AdministracionEquipo("./Equipos.txt");
            crearEquipo.setEnabled(true);
            modificarEquipo.setEnabled(true);
            eliminarEquipo.setEnabled(true);
            simularPartido.setEnabled(true);
            tablaPosicionesEquipos.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar al archivo!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int pos = Integer.parseInt(posEquipo.getText());
        admin.getEquipos().get(pos).setNombreEquipo(equipoModif.getText());
        try {
            admin.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Equipo modificado!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Nose puede modificar el Equipo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int pos = Integer.parseInt(equipoPosEliminar.getText());
        try {
            admin.getEquipos().remove(pos);
            admin.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Equipo Eliminado!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (equipo1.getSelectedIndex() >= 0 && equipo2.getSelectedIndex() >= 0) {
                if (equipo1.getSelectedIndex() != equipo2.getSelectedIndex()) {
                    int golEquipo1 = numeroRandom.nextInt(10);
                    int golEquipo2 = numeroRandom.nextInt(10);
                    golesEquipo1.setText(String.valueOf(golEquipo1));
                    golesEquipo2.setText(String.valueOf(golEquipo2));
                    Equipo equipo_1 = admin.getEquipos().get(equipo1.getSelectedIndex());
                    Equipo equipo_2 = admin.getEquipos().get(equipo2.getSelectedIndex());
                    equipo_1.setPartidosJugados(equipo_1.getPartidosJugados()+ 1);
                    equipo_2.setPartidosJugados(equipo_2.getPartidosJugados()+ 1);
                    if (golEquipo1 > golEquipo2) {
                        equipo_1.setPartidosGanados(equipo_1.getPartidosGanados()+ 1);
                        equipo_2.setPartidosPerdidos(equipo_2.getPartidosPerdidos()+ 1);
                        equipo_1.setPuntos(equipo_1.getPuntos()+ 3);
                    } else if (golEquipo1 < golEquipo2) {
                        equipo_2.setPartidosGanados(equipo_2.getPartidosGanados()+ 1);
                        equipo_1.setPartidosPerdidos(equipo_1.getPartidosPerdidos()+ 1);
                        equipo_2.setPuntos(equipo_2.getPuntos()+ 3);
                    } else {
                        equipo_1.setPartidosEmpatados(equipo_1.getPartidosEmpatados()+ 1);
                        equipo_2.setPartidosEmpatados(equipo_2.getPartidosEmpatados()+ 1);
                        equipo_1.setPuntos(equipo_1.getPuntos()+ 1);
                        equipo_2.setPuntos(equipo_2.getPuntos()+ 1);
                    }

                    equipo_1.setGolesFavor(equipo_1.getGolesFavor() + golEquipo1);
                    equipo_2.setGolesFavor(equipo_2.getGolesFavor() + golEquipo2);

                    equipo_1.setGolesContra(equipo_1.getGolesContra() + golEquipo1);
                    equipo_2.setGolesContra(equipo_2.getGolesContra() + golEquipo2);

                    equipo_1.setDiferenciaGoles(equipo_1.getDiferenciaGoles() + (golEquipo1 - golEquipo2));
                    equipo_2.setDiferenciaGoles(equipo_2.getDiferenciaGoles() + (golEquipo1 - golEquipo2));

                    admin.escribirArchivo();
                } else {
                    JOptionPane.showMessageDialog(null, "Mismo Equipo seleccionado");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TablaPosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaPosiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CrearEquipo;
    private javax.swing.JDialog EliminarEquipo;
    private javax.swing.JDialog ModificarEquipo;
    private javax.swing.JDialog SimulacionPartido;
    private javax.swing.JDialog TablaPosiciones;
    private javax.swing.JMenuBar barraMenuEquipos;
    private javax.swing.JMenuItem cargarArchivo;
    private javax.swing.JMenuItem crearEquipo;
    private javax.swing.JMenuItem eliminarEquipo;
    private javax.swing.JComboBox<String> equipo1;
    private javax.swing.JComboBox<String> equipo2;
    private javax.swing.JTextField equipoModif;
    private javax.swing.JTextField equipoNombreTF;
    private javax.swing.JTextField equipoPosEliminar;
    private javax.swing.JLabel golesEquipo1;
    private javax.swing.JLabel golesEquipo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuEquipo;
    private javax.swing.JMenu menuPartido;
    private javax.swing.JMenuItem modificarEquipo;
    private javax.swing.JTextField posEquipo;
    private javax.swing.JMenuItem simularPartido;
    private javax.swing.JTable tablaPosiciones;
    private javax.swing.JMenuItem tablaPosicionesEquipos;
    // End of variables declaration//GEN-END:variables
AdministracionEquipo admin = new AdministracionEquipo();
    Random numeroRandom = new Random();
}
