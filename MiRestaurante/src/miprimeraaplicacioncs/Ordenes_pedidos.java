/*
PROYECTO FINAL OBJETOS Y ABSTRACCION DE DATOS
Jorge Vinueza :v
-----------------------------------
 */
package miprimeraaplicacioncs;

import java.sql.*;

public class Ordenes_pedidos {
    private int Id_Pedido;
    private String fecha;
    private String hora;
    private int mesa;
    
    accesobd bd;

    public Ordenes_pedidos() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//1  ta
        bd.conectarBD();
        //T=  ta
    }

    public int getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(int Id_Pedido) {
        this.Id_Pedido = Id_Pedido;//1  ta
        //T= ta
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;//1  ta
        //T=  ta
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;//1  ta
        //T=  ta
    }
    
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;//1  ta
        //T= ta
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;//1  ta
        //T=  ta
    }

    public int Incremento_Ordenes_pedidos() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idpedido) as num FROM ordenespedidos;");//1  ta
        if (rs.next()) {//2  n(tc)
            inc = rs.getInt(1) + 1;//3  n(ta+to)
        } else {
            inc = 1;//4  ta
        }
        return inc;
        //Tiempo del metodo
        //T= ta + ntc + nta + nto + ta
        //T= 2ta + n(ta + tc + to)
    }

    public void Insertar_Ordenes_pedidos() throws SQLException {
        String cadena = "insert into ordenespedidos values('" + //1  ta + to
                Incremento_Ordenes_pedidos() + "','" + getFecha() 
                + "','"  + getHora() + "','"+ getMesa()+ "')";
        bd.ActualizarBD(cadena);
//Tiempo= ta + to
    }

    public void Actualizar_Ordenes_pedidos() throws SQLException {
        String cadena = "update ordenespedidos set fecha='"+ getFecha()+//1  ta + to
                "', hora= '" + getHora() +"', mesa= '" + getMesa()
                +"'where idpedido='" + getId_Pedido()+ "' ";
        bd.ActualizarBD(cadena);
        //Tiempo= ta + to
    }

    public void Eliminar_Ordenes_pedidos() throws SQLException{
        String cadena = "delete from ordenespedidos where idpedido ='" + getId_Pedido()+ "'";//1  ta + to
        bd.ActualizarBD(cadena);
        //Tiempo= ta + to
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

     public void Consultar_Ordenes_pedidos() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from ordenespedidos");//1  ta
        while (rs.next()) {//2  n(tc)
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
            //Tiempo= ta + ntc
        }
    }
}
