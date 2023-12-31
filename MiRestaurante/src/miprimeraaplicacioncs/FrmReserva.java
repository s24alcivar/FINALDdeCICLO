/*
PROYECTO FINAL OBJETOS Y ABSTRACCION DE DATOS
Jorge Vinueza :v
-----------------------------------
 */
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmReserva extends javax.swing.JFrame {
    public FrmReserva() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidcliente = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        btRegresar = new javax.swing.JButton();
        txtnumpersona = new javax.swing.JTextField();
        btNuevo = new javax.swing.JButton();
        idreservaciones = new javax.swing.JLabel();
        btEnviar = new javax.swing.JButton();
        idcliente = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();
        hora = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtreservaciones = new javax.swing.JTable();
        numpersona = new javax.swing.JLabel();
        txtidreservaciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("RESERVACIONES");

        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });

        btRegresar.setText("REGRESAR");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        txtnumpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumpersonaActionPerformed(evt);
            }
        });

        btNuevo.setText("NUEVO");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        idreservaciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idreservaciones.setForeground(new java.awt.Color(0, 0, 204));
        idreservaciones.setText("Id_Reservaciones");

        btEnviar.setText("ENVIAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        idcliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idcliente.setForeground(new java.awt.Color(0, 0, 204));
        idcliente.setText("Id_Cliente");

        btEliminar.setText("ELIMINAR");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 204));
        fecha.setText("Fecha");

        btActualizar.setText("ACTUALIZAR");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        hora.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 204));
        hora.setText("Hora");

        jtreservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idReservaciones", "idCliente", "Hora", "NumPersona", "Fecha"
            }
        ));
        jtreservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtreservacionesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtreservaciones);

        numpersona.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        numpersona.setForeground(new java.awt.Color(0, 0, 204));
        numpersona.setText("Num_Persona");

        txtidreservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidreservacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRegresar)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hora)
                            .addComponent(numpersona))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthora)
                            .addComponent(txtnumpersona)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idreservaciones)
                            .addComponent(idcliente)
                            .addComponent(fecha))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidreservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btActualizar)
                                    .addComponent(btEnviar)
                                    .addComponent(btNuevo)
                                    .addComponent(btEliminar))
                                .addGap(26, 26, 26))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btRegresar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idreservaciones)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidreservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNuevo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idcliente)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hora)
                            .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btEnviar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numpersona)
                            .addComponent(txtnumpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btEliminar)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btActualizar)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngreso in =new FrmIngreso();//1  ta
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_btRegresarActionPerformed

    private void txtnumpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumpersonaActionPerformed

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

    private void jtreservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtreservacionesMouseClicked
        // TODO add your handling code here:
        this.MouseClick();

    }//GEN-LAST:event_jtreservacionesMouseClicked

    private void txtidreservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            Reservaciones rv = new Reservaciones();//1  ta
            txtidreservaciones.setText("" + rv.Incremento_Reservaciones());
            txtidcliente.setText("");
            txtfecha.setText("");
            txthora.setText("");
            txtnumpersona.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
        //T= ta
    }
    

    private void enviar() {
        try {
            Reservaciones rv = new Reservaciones();//1  ta
            rv.setId_Reservaciones(Integer.parseInt(txtidreservaciones.getText()));
            rv.setId_Cliente(Integer.parseInt(txtidcliente.getText()));
            rv.setFecha(txtfecha.getText());
            rv.setHora(txthora.getText());
            rv.setNum_Persona(Integer.parseInt(txtnumpersona.getText()));
            rv.Insertar_Reservaciones();
            this.mostrar(jtreservaciones, "select * from reservaciones");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
        //T= ta
    }
    
    private void eliminar() {
        try{
         Reservaciones rv = new Reservaciones();//1  ta
         rv.setId_Reservaciones(Integer.parseInt(txtidreservaciones.getText()));
         rv.Eliminar_Reservaciones();
         this.mostrar(jtreservaciones, "select*from reservaciones");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la reservacion" + e.toString());
        }
        //T= ta
        
    }

    private void actualizar() {
        try{
            Reservaciones rv = new Reservaciones();//1  ta
            rv.setId_Reservaciones(Integer.parseInt(txtidreservaciones.getText()));
            rv.setId_Cliente(Integer.parseInt(txtidcliente.getText()));
            rv.setFecha(txtfecha.getText());
            rv.setHora(txthora.getText());
            rv.setNum_Persona(Integer.parseInt(txtnumpersona.getText()));
            rv.Actualizar_Reservaciones();
            this.mostrar(jtreservaciones, "select * from reservaciones");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
        //T=  ta
        }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Reservaciones rv = new Reservaciones();//1  ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2  ta
            JT.setModel(modelo);
            rs = rv.consultaTabla(sql);//3  ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4  ta
            int cantcolumnas = rsMd.getColumnCount();//5  ta
            for (int i = 1; i <= cantcolumnas; i++) {//6  n(ta + tc +to)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {//7  n(tc)
                Object[] columna = new Object[cantcolumnas];//8  n(ta)
                for (int i = 0; i < cantcolumnas; i++) {//9  n(ta + tc +to)
                    columna[i] = rs.getObject(i + 1);//10  n(ta + to)
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
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
    }

    private void MouseClick() {
        int fila=jtreservaciones.getSelectedRow();
        txtidreservaciones.setText(jtreservaciones.getModel().getValueAt(fila, 0).toString());
        txtidcliente.setText(jtreservaciones.getModel().getValueAt(fila, 1).toString());
        txtfecha.setText(jtreservaciones.getModel().getValueAt(fila, 2).toString());
        txthora.setText(jtreservaciones.getModel().getValueAt(fila, 3).toString());
        txtnumpersona.setText(jtreservaciones.getModel().getValueAt(fila, 4).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRegresar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel idcliente;
    private javax.swing.JLabel idreservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtreservaciones;
    private javax.swing.JLabel numpersona;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidreservaciones;
    private javax.swing.JTextField txtnumpersona;
    // End of variables declaration//GEN-END:variables
}
