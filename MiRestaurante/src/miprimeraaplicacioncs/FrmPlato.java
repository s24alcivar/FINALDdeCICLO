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

public class FrmPlato extends javax.swing.JFrame {
    public FrmPlato() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        bteliminar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        btactualizar = new javax.swing.JButton();
        lbldescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPlatos = new javax.swing.JTable();
        lblprecio = new javax.swing.JLabel();
        txidplatos = new javax.swing.JTextField();
        txidpedido = new javax.swing.JTextField();
        txnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txdescripcion = new javax.swing.JTextField();
        btRegresar = new javax.swing.JButton();
        txprecio = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        lblidplatos = new javax.swing.JLabel();
        btenviar = new javax.swing.JButton();
        lblidpedido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bteliminar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(0, 0, 204));
        lblnombre.setText("nombre");

        btactualizar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btactualizar.setText("ACTUALIZAR");
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });

        lbldescripcion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lbldescripcion.setForeground(new java.awt.Color(0, 0, 204));
        lbldescripcion.setText("descripcion");

        jtPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idPlatos", "idPedido", "Nombre", "Descripcion", "Precio"
            }
        ));
        jtPlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPlatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPlatos);

        lblprecio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblprecio.setForeground(new java.awt.Color(0, 0, 204));
        lblprecio.setText("precio");

        txidpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidpedidoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("PLATOS");

        btRegresar.setText("REGRESAR");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        btnuevo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnuevo.setText("NUEVO");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        lblidplatos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblidplatos.setForeground(new java.awt.Color(0, 0, 204));
        lblidplatos.setText("id_platos");

        btenviar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btenviar.setText("ENVIAR");
        btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenviarActionPerformed(evt);
            }
        });

        lblidpedido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblidpedido.setForeground(new java.awt.Color(0, 0, 204));
        lblidpedido.setText("id_pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblidplatos)
                        .addComponent(btRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre)
                            .addComponent(lblidpedido)
                            .addComponent(lbldescripcion)
                            .addComponent(lblprecio))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(txidplatos, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txidpedido)
                    .addComponent(txnombre)
                    .addComponent(txdescripcion)
                    .addComponent(txprecio))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btactualizar)
                        .addComponent(btnuevo)
                        .addComponent(btenviar)
                        .addComponent(bteliminar)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btRegresar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnuevo)
                        .addGap(37, 37, 37)
                        .addComponent(btenviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblidplatos)
                            .addComponent(txidplatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblidpedido)
                            .addComponent(txidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombre)
                            .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldescripcion)
                        .addComponent(txdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bteliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprecio)
                    .addComponent(txprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btactualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed
        // TODO add your handling code here:
        this.actualizar();
    }//GEN-LAST:event_btactualizarActionPerformed

    private void jtPlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPlatosMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtPlatosMouseClicked

    private void txidpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidpedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidpedidoActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngreso in =new FrmIngreso();//1  ta 
        this.setVisible(false);
        in.setVisible(true);
        //T= ta
    }//GEN-LAST:event_btRegresarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btenviarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            Platos pl = new Platos();//1  ta
            txidplatos.setText("" + pl.Incremento_Platos());
            txidpedido.setText("");
            txnombre.setText("");
            txdescripcion.setText("");
            txprecio.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
        //Tiempo = ta
    }

    private void enviar() {
        try {
            Platos pl = new Platos();//1  ta
            pl.setId_Platos(Integer.parseInt(txidplatos.getText()));
            pl.setId_Pedido(Integer.parseInt(txidpedido.getText()));
            pl.setNombres(txnombre.getText());
            pl.setDescripcion(txdescripcion.getText());
            pl.setPrecio(Integer.parseInt(txprecio.getText()));
            pl.Insertar_Platos();
            this.mostrar(jtPlatos, "select * from platos");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
        //Tiempo = ta
    }
    
    private void eliminar() {
        try{
         Platos pl = new Platos();//1  ta
         pl.setId_Platos(Integer.parseInt(txidplatos.getText()));
         pl.Eliminar_Platos();
         this.mostrar(jtPlatos, "select*from platos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el plato" + e.toString());
        } 
        //Tiempo= ta
    }

    private void actualizar() {
        try {
            Platos pl = new Platos();//1  ta
            pl.setId_Platos(Integer.parseInt(txidplatos.getText()));
            pl.setId_Pedido(Integer.parseInt(txidpedido.getText()));
            pl.setNombres(txnombre.getText());
            pl.setDescripcion(txdescripcion.getText());
            pl.setPrecio(Integer.parseInt(txprecio.getText()));
            pl.Actualizar_Platos();
            this.mostrar(jtPlatos, "select * from platos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }  
        //Tiempo= ta
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Platos pl = new Platos();//1  ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2  ta
            JT.setModel(modelo);
            rs = pl.consultaTabla(sql);//3  ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4  ta
            int cantcolumnas = rsMd.getColumnCount();//5  ta
            for (int i = 1; i <= cantcolumnas; i++) {//6  n(ta + tc + to)
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
        int fila=jtPlatos.getSelectedRow();//1  ta
        txidplatos.setText(jtPlatos.getModel().getValueAt(fila, 0).toString());
        txidpedido.setText(jtPlatos.getModel().getValueAt(fila, 1).toString());
        txnombre.setText(jtPlatos.getModel().getValueAt(fila, 2).toString());
        txdescripcion.setText(jtPlatos.getModel().getValueAt(fila, 3).toString());
        txprecio.setText(jtPlatos.getModel().getValueAt(fila, 4).toString());
        //Tiempo= ta
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegresar;
    private javax.swing.JButton btactualizar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btenviar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPlatos;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblidpedido;
    private javax.swing.JLabel lblidplatos;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JTextField txdescripcion;
    private javax.swing.JTextField txidpedido;
    private javax.swing.JTextField txidplatos;
    private javax.swing.JTextField txnombre;
    private javax.swing.JTextField txprecio;
    // End of variables declaration//GEN-END:variables
}
