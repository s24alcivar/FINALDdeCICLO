/*PROYECTO FINAL CICLO
-- Objetos y Abstraccion de Datos --
Calculo de Costes
Esneyder Alcivar Velez
*/
package miprimeraaplicacioncs;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.sql.*;

public class FrmCliente extends javax.swing.JFrame {
    public FrmCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblid_cliente = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txidcliente = new javax.swing.JTextField();
        txnombres = new javax.swing.JTextField();
        txdireccion = new javax.swing.JTextField();
        txtelefono = new javax.swing.JTextField();
        txcorreo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        tblClientes = new javax.swing.JLabel();
        btRegresar = new javax.swing.JButton();
        btbuscar = new java.awt.Button();
        txbuscar = new java.awt.TextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblid_cliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblid_cliente.setForeground(new java.awt.Color(0, 0, 204));
        lblid_cliente.setText("Id_Cliente");

        lblnombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblnombres.setForeground(new java.awt.Color(0, 0, 204));
        lblnombres.setText("Nombres");

        lbldireccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(0, 0, 204));
        lbldireccion.setText("Direccion");

        lbltelefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(0, 0, 204));
        lbltelefono.setText("Telefono");

        lblcorreo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(0, 0, 204));
        lblcorreo.setText("Correo");

        txidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidclienteActionPerformed(evt);
            }
        });

        txtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelefonoActionPerformed(evt);
            }
        });

        txcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcorreoActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEnviar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idCliente", "Nombres", "Direccion", "Telefono", "Correo"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCliente);

        tblClientes.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(0, 0, 204));
        tblClientes.setText("CLIENTES");

        btRegresar.setText("REGRESAR");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        btbuscar.setLabel("Buscar Cliente");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        txbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblnombres)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltelefono)
                                            .addComponent(lbldireccion)
                                            .addComponent(lblcorreo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblid_cliente)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txnombres, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txdireccion)
                                    .addComponent(txtelefono)
                                    .addComponent(txcorreo)
                                    .addComponent(txidcliente))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEnviar)
                                .addComponent(btnNuevo))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btRegresar)
                                .addGap(56, 56, 56)
                                .addComponent(tblClientes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRegresar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblid_cliente)
                        .addComponent(txidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombres)
                            .addComponent(txnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldireccion)
                            .addComponent(txdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltelefono)
                                .addGap(21, 21, 21)
                                .addComponent(lblcorreo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnEnviar)
                        .addGap(42, 42, 42)
                        .addComponent(btnEliminar)
                        .addGap(41, 41, 41)
                        .addComponent(btnActualizar)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btbuscar.getAccessibleContext().setAccessibleName("Buscar Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtClienteMouseClicked

    private void txidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidclienteActionPerformed

    private void txtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelefonoActionPerformed
        
    }//GEN-LAST:event_txtelefonoActionPerformed

    private void txcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcorreoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        FrmIngreso in =new FrmIngreso();//1 ta
        this.setVisible(false);
        in.setVisible(true);
        //Tiempo del metodo 
        //T= ta
    }//GEN-LAST:event_btRegresarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // TODO add your handling code here:
        this.buscar();
    }//GEN-LAST:event_btbuscarActionPerformed

    private void txbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            ClienteBeans cb = new ClienteBeans();//1  ta
            txidcliente.setText("" + cb.Incremento_CLiente());//2  to
            txnombres.setText("");
            txdireccion.setText("");
            txtelefono.setText("");
            txcorreo.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
            //Tiempo= ta + to
        }
    }

    private void enviar() {
        try {
            ClienteBeans cb = new ClienteBeans();//1  ta
            cb.setId_Cliente(Integer.parseInt(txidcliente.getText()));
            cb.setNombres(txnombres.getText());
            cb.setDireccion(txdireccion.getText());
            cb.setTelefono(txtelefono.getText());
            cb.setCorreo(txcorreo.getText());
            cb.Insertar_Cliente();
            this.mostrar(jtCliente, "select * from clientes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
        //Tiempo = ta
    }
    

    private void eliminar() {
        try{
         ClienteBeans cb = new ClienteBeans();//1  ta
         cb.setId_Cliente(Integer.parseInt(txidcliente.getText()));
         cb.Eliminar_Cliente();
         this.mostrar(jtCliente, "select*from clientes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente" + e.toString());
        }
        //Tiempo= ta
    }
    
    private void actualizar() {
        try {
            ClienteBeans cb = new ClienteBeans();//1  ta
            cb.setId_Cliente(Integer.parseInt(txidcliente.getText()));
            cb.setNombres(txnombres.getText());
            cb.setDireccion(txdireccion.getText());
            cb.setTelefono(txtelefono.getText());
            cb.setCorreo(txcorreo.getText());
            cb.Actualizar_Cliente();
            this.mostrar(jtCliente, "select * from clientes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
        //Tiempo = ta
    }  
        

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            ClienteBeans cb = new ClienteBeans();//1  ta
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();//2  ta
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);//3  ta
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();//4  ta
            int cantcolumnas = rsMd.getColumnCount();//5  ta
            for (int i = 1; i <= cantcolumnas; i++) {//6 n(ta + tc + to)
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
    
    
    private void buscar()  {
        try {
        String textoBuscar = txbuscar.getText();//1 ta
        int Id_Cliente = Integer.parseInt(textoBuscar);//2 ta
        buscarPorId(Id_Cliente);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un ID válido.");
    }

    }
    /*
    Tiempo metodo
    T= ta+ta
    T=2ta
    
    
    */
    
    private void buscarPorId(int Id_Cliente) {
        try {
            ClienteBeans cb = new ClienteBeans();//1 ta
            ResultSet rs = cb.buscarClientePorId(Id_Cliente);//2 ta

            if (rs.next()) {
                txidcliente.setText(rs.getString("idcliente"));
                txnombres.setText(rs.getString("nombre"));
                txdireccion.setText(rs.getString("direccion"));
                txtelefono.setText(rs.getString("telefono"));
                txcorreo.setText(rs.getString("correo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró cliente con el ID especificado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente por ID: " + e.toString());
        }
    }
    /*
    T= ta + ta 
    T= 2TA
    
    */

    private void MouseClick() {
        int fila=jtCliente.getSelectedRow();
        txidcliente.setText(jtCliente.getModel().getValueAt(fila, 0).toString());
        txnombres.setText(jtCliente.getModel().getValueAt(fila, 1).toString());
        txdireccion.setText(jtCliente.getModel().getValueAt(fila, 2).toString());
        txtelefono.setText(jtCliente.getModel().getValueAt(fila, 3).toString());
        txcorreo.setText(jtCliente.getModel().getValueAt(fila, 4).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegresar;
    private java.awt.Button btbuscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblid_cliente;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel tblClientes;
    private java.awt.TextField txbuscar;
    private javax.swing.JTextField txcorreo;
    private javax.swing.JTextField txdireccion;
    private javax.swing.JTextField txidcliente;
    private javax.swing.JTextField txnombres;
    private javax.swing.JTextField txtelefono;
    // End of variables declaration//GEN-END:variables

    

    
}
