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
public class FrmOrdenes_pedidos extends javax.swing.JFrame {
    public FrmOrdenes_pedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtOrdenes_pedido = new javax.swing.JTable();
        idpedido = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        tblOrdenes_pedido = new javax.swing.JLabel();
        txidpedido = new javax.swing.JTextField();
        btRegresar = new javax.swing.JButton();
        txfecha = new javax.swing.JTextField();
        txhora = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btenviar = new javax.swing.JButton();
        btactualizar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btmesa = new javax.swing.JLabel();
        txmesa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtOrdenes_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_pedido", "fecha", "hora", "mesa"
            }
        ));
        jtOrdenes_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtOrdenes_pedidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtOrdenes_pedido);

        idpedido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idpedido.setForeground(new java.awt.Color(0, 0, 204));
        idpedido.setText("id_pedido");

        fecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 204));
        fecha.setText("Fecha");

        hora.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 204));
        hora.setText("Hora");

        tblOrdenes_pedido.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        tblOrdenes_pedido.setForeground(new java.awt.Color(0, 0, 204));
        tblOrdenes_pedido.setText("Ordenes_pedido");

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

        btenviar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btenviar.setText("ENVIAR");
        btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenviarActionPerformed(evt);
            }
        });

        btactualizar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btactualizar.setText("ACTUALIZAR");
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });

        bteliminar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btmesa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btmesa.setForeground(new java.awt.Color(0, 0, 204));
        btmesa.setText("Mesa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRegresar)
                .addGap(39, 39, 39)
                .addComponent(tblOrdenes_pedido)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha)
                            .addComponent(hora)
                            .addComponent(idpedido)
                            .addComponent(btmesa))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txidpedido)
                            .addComponent(txhora)
                            .addComponent(txmesa))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btactualizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btenviar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(bteliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegresar)
                    .addComponent(tblOrdenes_pedido))
                .addGap(15, 15, 15)
                .addComponent(btnuevo)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idpedido)
                    .addComponent(txidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(txfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btenviar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hora)
                    .addComponent(txhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btactualizar)
                        .addGap(54, 54, 54)
                        .addComponent(bteliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btmesa)
                            .addComponent(txmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngreso in =new FrmIngreso();//1 ta
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_btRegresarActionPerformed
/*
    T= ta
    */
    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btenviarActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed
        // TODO add your handling code here:
        this.actualizar();
    }//GEN-LAST:event_btactualizarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void jtOrdenes_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtOrdenes_pedidoMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtOrdenes_pedidoMouseClicked

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            Ordenes_pedidos op = new Ordenes_pedidos();//1 ta 
            txidpedido.setText("" + op.Incremento_Ordenes_pedidos());
            txfecha.setText("");
            txhora.setText("");
            txmesa.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
    /*
    T=ta
    */

    private void enviar() {
        try {
            Ordenes_pedidos op = new Ordenes_pedidos();//1 ta
            op.setId_Pedido(Integer.parseInt(txidpedido.getText()));
            op.setFecha(txfecha.getText());
            op.setHora(txhora.getText());
            op.setMesa(Integer.parseInt(txmesa.getText()));
            op.Insertar_Ordenes_pedidos();
            this.mostrar(jtOrdenes_pedido, "select * from ordenespedidos");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }
     /*
    T=ta
    */
    private void actualizar() {
        try {
            Ordenes_pedidos op = new Ordenes_pedidos();//1 ta
            op.setId_Pedido(Integer.parseInt(txidpedido.getText()));
            op.setFecha(txfecha.getText());
            op.setHora(txhora.getText());
            op.setMesa(Integer.parseInt(txmesa.getText()));
            op.Actualizar_Ordenes_pedidos();
            this.mostrar(jtOrdenes_pedido, "select * from ordenespedidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }    
    }
 /*
    T=ta
    */
    private void eliminar() {
        try{
         Ordenes_pedidos op = new Ordenes_pedidos();//1 ta
         op.setId_Pedido(Integer.parseInt(txidpedido.getText()));
         op.Eliminar_Ordenes_pedidos();
         this.mostrar(jtOrdenes_pedido, "select*from ordenespedidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el pedido" + e.toString());
        }
        
    }
 /*
    T=ta
    */
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Ordenes_pedidos op = new Ordenes_pedidos();//1 ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2  ta
            JT.setModel(modelo);
            rs = op.consultaTabla(sql);//3  ta
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
        int fila=jtOrdenes_pedido.getSelectedRow();//1  ta
        txidpedido.setText(jtOrdenes_pedido.getModel().getValueAt(fila, 0).toString());
        txfecha.setText(jtOrdenes_pedido.getModel().getValueAt(fila, 1).toString());
        txhora.setText(jtOrdenes_pedido.getModel().getValueAt(fila, 2).toString());
        txmesa.setText(jtOrdenes_pedido.getModel().getValueAt(fila, 3).toString());
        //Tiempo = ta
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegresar;
    private javax.swing.JButton btactualizar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btenviar;
    private javax.swing.JLabel btmesa;
    private javax.swing.JButton btnuevo;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel idpedido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtOrdenes_pedido;
    private javax.swing.JLabel tblOrdenes_pedido;
    private javax.swing.JTextField txfecha;
    private javax.swing.JTextField txhora;
    private javax.swing.JTextField txidpedido;
    private javax.swing.JTextField txmesa;
    // End of variables declaration//GEN-END:variables
}
