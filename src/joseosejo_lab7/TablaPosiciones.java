/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joseosejo_lab7;

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
        modificarEquipoCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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

        jLabel4.setText("Equipos");

        jLabel5.setText("Ingresar nuevo Nombre");

        jButton2.setText("Modificar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(modificarEquipoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton2)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(modificarEquipoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarEquipoActionPerformed

    private void simularPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularPartidoActionPerformed
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
                DefaultComboBoxModel modifModel = (DefaultComboBoxModel) modificarEquipoCB.getModel();
                for(Equipo equipo: admin.getEquipos()){
                    modifModel.addElement(equipo);
                }
                modificarEquipoCB.setModel(modifModel);
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
         try{
            admin = new AdministracionEquipo("./Equipos.txt");
            crearEquipo.setEnabled(true);
            modificarEquipo.setEnabled(true);
            eliminarEquipo.setEnabled(true);
            simularPartido.setEnabled(true);
            tablaPosicionesEquipos.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar al archivo!");
        }        
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarArchivoActionPerformed

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
    private javax.swing.JDialog ModificarEquipo;
    private javax.swing.JMenuBar barraMenuEquipos;
    private javax.swing.JMenuItem cargarArchivo;
    private javax.swing.JMenuItem crearEquipo;
    private javax.swing.JMenuItem eliminarEquipo;
    private javax.swing.JTextField equipoNombreTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menuEquipo;
    private javax.swing.JMenu menuPartido;
    private javax.swing.JMenuItem modificarEquipo;
    private javax.swing.JComboBox<String> modificarEquipoCB;
    private javax.swing.JMenuItem simularPartido;
    private javax.swing.JMenuItem tablaPosicionesEquipos;
    // End of variables declaration//GEN-END:variables
AdministracionEquipo admin = new AdministracionEquipo();
Random numeroRandom = new Random();
}
