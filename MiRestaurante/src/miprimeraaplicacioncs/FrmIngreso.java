/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacioncs;

/**
 *
 * @author USUARIO
 */
public class FrmIngreso extends javax.swing.JFrame {

    /**
     * Creates new form FrmIngreso
     */
    public FrmIngreso() {
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

        jPanel1 = new javax.swing.JPanel();
        btcliente = new javax.swing.JButton();
        btreservaciones = new javax.swing.JButton();
        btempleado = new javax.swing.JButton();
        btordenespedidos = new javax.swing.JButton();
        btplatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btpedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btcliente.setText("Tabla cliente");
        btcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        btreservaciones.setText("Tabla reservaciones");
        btreservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreservacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btreservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        btempleado.setText("Tabla empleados");
        btempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        btordenespedidos.setText("Tabla Ordenes_pedidos");
        btordenespedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btordenespedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btordenespedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btplatos.setText("Tabla platos");
        btplatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplatosActionPerformed(evt);
            }
        });
        jPanel1.add(btplatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 470));

        btpedido.setText("Tabla pedido");
        btpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miprimeraaplicacioncs/kitchen2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclienteActionPerformed
        // TODO add your handling code here:
        FrmCliente cl =new FrmCliente();//1 ta 
        this.setVisible(false);
        cl.setVisible(true);
    }//GEN-LAST:event_btclienteActionPerformed

    /*
    T= ta
    
    */
    private void btreservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreservacionesActionPerformed
        // TODO add your handling code here:
        FrmReserva rs =new FrmReserva();//1 ta 
        this.setVisible(false);
        rs.setVisible(true);
    }//GEN-LAST:event_btreservacionesActionPerformed
   /*
    T= ta
    
    */
    private void btempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btempleadoActionPerformed
        // TODO add your handling code here:
        FrmEmpleado cl =new FrmEmpleado();//1 ta 
        this.setVisible(false);
        cl.setVisible(true);
    }//GEN-LAST:event_btempleadoActionPerformed
  /*
    T= ta
    
    */
    private void btordenespedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btordenespedidosActionPerformed
        // TODO add your handling code here:
        FrmOrdenes_pedidos cl =new FrmOrdenes_pedidos();//1 ta 
        this.setVisible(false);
        cl.setVisible(true);
    }//GEN-LAST:event_btordenespedidosActionPerformed
/*
    T= ta
    
    */
    private void btplatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btplatosActionPerformed
        // TODO add your handling code here:
        FrmPlato cl =new FrmPlato();//1  ta
        this.setVisible(false);
        cl.setVisible(true);
    }//GEN-LAST:event_btplatosActionPerformed
/*
    T= ta
    
    */
    private void btpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpedidoActionPerformed
        // TODO add your handling code here:
        FrmPedido pd =new FrmPedido();//1 ta
        this.setVisible(false);
        pd.setVisible(true);
        //T =t a
    }//GEN-LAST:event_btpedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcliente;
    private javax.swing.JButton btempleado;
    private javax.swing.JButton btordenespedidos;
    private javax.swing.JButton btpedido;
    private javax.swing.JButton btplatos;
    private javax.swing.JButton btreservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
