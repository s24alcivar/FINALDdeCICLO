/*
PROYECTO FINAL OBJETOS Y ABSTRACCION DE DATOS
Jorge Vinueza :v
-----------------------------------
 */
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;
public class PedidoBeans {
    private int id_pedido;
    private int id_plato;
    private int cantidad;
    private double precio;
    private double total;
    private accesobd bd;

    public PedidoBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//1  ta
        bd.conectarBD();
        //T= ta
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;//1  ta
        //T= ta
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;//1  ta
        //T= ta
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;//1  ta
        //T= ta
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;//1  ta
        //T= ta
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;//1  ta
        //T= ta
    }
    
     public int Incremento_Pedido() throws SQLException {
        int inc = 0;//1  ta
        ResultSet rs = bd.consultaBD("SELECT max(idpedido) as num FROM pedido;");//2  ta
        if (rs.next()) {//3  n(tc)
            inc = rs.getInt(1) + 1;//4  n(ta+ to)
        } else {
            inc = 1;//5  ta
        }
        return inc;
        //Tiempo
        //T= ta + ta + ntc + nta + nto
        //T= 2ta + n(ta + tc + to)
    }

    
    public void Insertar_Pedido() throws SQLException {
        String cadena = "insert into pedido values('" + Incremento_Pedido()//1  ta
                + "','" + getId_plato()+ "','" + getCantidad()+ "','"  + getPrecio()+ "','" + getTotal()+ "')";
        bd.ActualizarBD(cadena);
        //T= ta
    }

    public void Actualizar_Pedido() throws SQLException {
        // Implementar la lógica para actualizar el pedido
    }

    public void Eliminar_Pedido() throws SQLException{
        // Implementar la lógica para eliminar el pedido
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void Consultar_Pedido() throws SQLException {
        ResultSet rs = bd.consultaBD("select * from pedido");//1  ta
        while (rs.next()) {//2  n(tc)
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
        //Tiempo = ta + ntc
    }
}

