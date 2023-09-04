/*PROYECTO FINAL CICLO
-- Objetos y Abstraccion de Datos --
Calculo de Costes
Esneyder Alcivar Velez
*/
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class FrmEmpleado extends javax.swing.JFrame {

    public FrmEmpleado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        txidempleado = new javax.swing.JTextField();
        txidreservaciones = new javax.swing.JTextField();
        txidpedido = new javax.swing.JTextField();
        txnombre = new javax.swing.JTextField();
        btRegresar = new javax.swing.JButton();
        idempleado = new javax.swing.JLabel();
        txrol = new javax.swing.JTextField();
        idreservaciones = new javax.swing.JLabel();
        txsalario = new javax.swing.JTextField();
        idpedido = new javax.swing.JLabel();
        btNuevo = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        btEnviar = new javax.swing.JButton();
        rol = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        salario = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();
        tblempleados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idempleado", "idreservaciones", "idpedido", "nombre", "rol", "salario"
            }
        ));
        jtEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleados);

        txidpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidpedidoActionPerformed(evt);
            }
        });

        btRegresar.setText("REGRESAR");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        idempleado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idempleado.setForeground(new java.awt.Color(0, 0, 204));
        idempleado.setText("id_empleado");

        idreservaciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idreservaciones.setForeground(new java.awt.Color(0, 0, 204));
        idreservaciones.setText("id_reservaciones");

        idpedido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idpedido.setForeground(new java.awt.Color(0, 0, 204));
        idpedido.setText("id_pedido");

        btNuevo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btNuevo.setText("NUEVO");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 204));
        nombre.setText("nombre");

        btEnviar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btEnviar.setText("ENVIAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        rol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        rol.setForeground(new java.awt.Color(0, 0, 204));
        rol.setText("rol");

        btEliminar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btEliminar.setText("ELIMINAR");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        salario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        salario.setForeground(new java.awt.Color(0, 0, 204));
        salario.setText("salario");

        btActualizar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btActualizar.setText("ACTUALIZAR");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        tblempleados.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        tblempleados.setForeground(new java.awt.Color(0, 0, 204));
        tblempleados.setText("EMPLEADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idreservaciones)
                                    .addComponent(idempleado)
                                    .addComponent(nombre)
                                    .addComponent(rol)
                                    .addComponent(salario)
                                    .addComponent(idpedido)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btRegresar)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txsalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txrol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tblempleados)
                            .addComponent(txidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txidpedido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txidreservaciones, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEnviar)
                            .addComponent(btNuevo)
                            .addComponent(btEliminar)
                            .addComponent(btActualizar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblempleados)
                            .addComponent(btRegresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idempleado))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idreservaciones)
                            .addComponent(txidreservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idpedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(nombre)
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNuevo)
                        .addGap(39, 39, 39)
                        .addComponent(btEnviar)
                        .addGap(41, 41, 41)
                        .addComponent(btEliminar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btActualizar)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(rol)))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadosMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtEmpleadosMouseClicked

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngreso in =new FrmIngreso();//1 ta
        this.setVisible(false);
        in.setVisible(true);
        /*
        T= ta
        */
    }//GEN-LAST:event_btRegresarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
        this.actualizar();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void txidpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidpedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidpedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            Empleados emp = new Empleados();//1 ta 
            txidempleado.setText("" + emp.Incremento_Empleados());
            txidreservaciones.setText("");
            txidpedido.setText("");
            txnombre.setText("");
            txrol.setText("");
            txsalario.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
    /*
    T= ta
    */

    private void enviar() {
        try {
            Empleados emp = new Empleados();//1 ta
            emp.setId_empleado(Integer.parseInt(txidempleado.getText()));
            emp.setId_reservaciones(Integer.parseInt(txidreservaciones.getText()));
            emp.setId_pedido(Integer.parseInt(txidpedido.getText()));
            emp.setNombre(txnombre.getText());
            emp.setRol(txrol.getText());
            emp.setSalario(Integer.parseInt(txsalario.getText()));
            emp.Insertar_Empleados();
            this.mostrar(jtEmpleados, "select * from empleados");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }
    /*
    T= ta
    
    */
    
    private void eliminar() {
        try{
         Empleados emp = new Empleados();//1 ta
         emp.setId_empleado(Integer.parseInt(txidempleado.getText()));
         emp.Eliminar_Empleados();
         this.mostrar(jtEmpleados, "select*from empleados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado" + e.toString());
        }
    }
/*
    T= ta
    
    */
    private void actualizar() {
        try {
            Empleados emp = new Empleados();//1 ta
            emp.setId_empleado(Integer.parseInt(txidempleado.getText()));
            emp.setId_reservaciones(Integer.parseInt(txidreservaciones.getText()));
            emp.setId_pedido(Integer.parseInt(txidpedido.getText()));
            emp.setNombre(txnombre.getText());
            emp.setRol(txrol.getText());
            emp.setSalario(Integer.parseInt(txsalario.getText()));
            emp.Actualizar_Empleados();
            this.mostrar(jtEmpleados, "select * from empleados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }  
    }
/*
    T= ta
    
    */
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Empleados emp = new Empleados();//1 ta 
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2 ta
            JT.setModel(modelo);
            rs = emp.consultaTabla(sql);//3 ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4 ta
            int cantcolumnas = rsMd.getColumnCount();//5 ta
            for (int i = 1; i <= cantcolumnas; i++) { //6 n(ta + tc + to)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {//7  n(tc)
                Object[] columna = new Object[cantcolumnas];//8  n(ta)
                for (int i = 0; i < cantcolumnas; i++) {//9  n(ta + tc + to)
                    columna[i] = rs.getObject(i + 1);//10  n(ta + to)
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
    /*
    Tiempo del metodo
    Mejor tiempo esperado (caso de el minimo de datos)
    T= ta + ta + ta + ta + ta+ ta+ tc + to +ta + ta+ tc+ to+ ta + to
    T=9ta + 2tc + 3to
    
    Peor tiempo esperado (caso de gran cantidad de datos)
    T= ta + ta + ta + ta + ta+ nta+ ntc + nto +nta + nta+ ntc+ nto+ nta + nto
    T= 5ta + 4nta + 2ntc + 3nto
    T= 5ta + n(4ta + 2tc + 3to)
    
    Tiempo promedio
    T= [Tm + Tp]/2
    T= [9ta + 2tc + 3to + 5ta + 4nta + 2ntc + 3nto]/2
    T= [14ta + 2tc + 3to + 4nta + 2ntc + 3nto]/2
    T= [14ta + 2tc + 3to + n(4ta + 2tc + 3to)]/2
    */

    private void MouseClick() {
        int fila=jtEmpleados.getSelectedRow();
        txidempleado.setText(jtEmpleados.getModel().getValueAt(fila, 0).toString());
        txidreservaciones.setText(jtEmpleados.getModel().getValueAt(fila, 1).toString());
        txidpedido.setText(jtEmpleados.getModel().getValueAt(fila, 2).toString());
        txnombre.setText(jtEmpleados.getModel().getValueAt(fila, 3).toString());
        txrol.setText(jtEmpleados.getModel().getValueAt(fila, 4).toString());
        txsalario.setText(jtEmpleados.getModel().getValueAt(fila, 5).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRegresar;
    private javax.swing.JLabel idempleado;
    private javax.swing.JLabel idpedido;
    private javax.swing.JLabel idreservaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel rol;
    private javax.swing.JLabel salario;
    private javax.swing.JLabel tblempleados;
    private javax.swing.JTextField txidempleado;
    private javax.swing.JTextField txidpedido;
    private javax.swing.JTextField txidreservaciones;
    private javax.swing.JTextField txnombre;
    private javax.swing.JTextField txrol;
    private javax.swing.JTextField txsalario;
    // End of variables declaration//GEN-END:variables
}
