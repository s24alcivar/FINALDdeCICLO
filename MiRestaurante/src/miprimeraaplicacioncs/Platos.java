/*
OBJETOS Y ABSTRACCION DE DATOS
Jorge Vinueza
 */
package miprimeraaplicacioncs;

import java.sql.*;

public class Platos {
    private int Id_Platos;
    private int Id_Pedido;
    private String nombres;
    private String descripcion;
    private int precio;
    accesobd bd;

    public Platos() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//  ta
        bd.conectarBD();
        //T= ta
    }

    public int getId_Platos() {
        return Id_Platos;
    }

    public void setId_Platos(int Id_Platos) {
        this.Id_Platos = Id_Platos;//1  ta
        //T= ta
    }

    public int getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(int Id_Pedido) {
        this.Id_Pedido = Id_Pedido;//1  ta
        //T= ta
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;//1  ta
        //T= ta
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;//1  ta
        //T= ta
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;//1  ta
        //T= ta
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;//1  ta
        //T= ta
    }

  
    public int Incremento_Platos() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idplatos) as num FROM platos;");//  ta
        if (rs.next()) {//2  n(tc)
            inc = rs.getInt(1) + 1;//3  n(ta + to)
        } else {
            inc = 1;//4  ta
        }
        return inc;
        //Tiempo
        //T= ta + ntc + nta + nto + ta
        //T= 2ta + nta + ntc + nto
        //T= 2ta + n(ta + tc +to)
    }

    
    public void Insertar_Platos() throws SQLException {
        String cadena = "insert into platos values('" + Incremento_Platos() //1  ta + to
                + "','" + getId_Pedido() + "','" + getNombres() + "','"  + getDescripcion() + "','" + getPrecio() + "')";
        bd.ActualizarBD(cadena);
        //Tiempo=  ta + to

    }

    public void Actualizar_Platos() throws SQLException {
        String cadena = "update platos set idpedido='"+ getId_Pedido()//1  ta + to
                +"', nombre= '" + getNombres() +"',descripcion= '" + getDescripcion() +"',precio= '" +getPrecio()+ "'where idplatos='" + getId_Platos()+ "' ";
        bd.ActualizarBD(cadena);
        //Tiempo=  ta + to
    }

    public void Eliminar_Platos() throws SQLException{
        String cadena = "delete from platos where idplatos ='" + getId_Platos()+ "'";//1  ta + to
        bd.ActualizarBD(cadena);
        //Tiempo = ta + to
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void Consultar_Platos() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from platos");//1  ta
        while (rs.next()) {//2  n(tc)
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
        //Tiempo=  ta + ntc
    }

}
