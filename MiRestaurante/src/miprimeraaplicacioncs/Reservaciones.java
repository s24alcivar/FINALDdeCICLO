/*
OBJETOS Y ABSTRACCION DE DATOS
Jorge Vinueza
 */
package miprimeraaplicacioncs;

import java.sql.*;
public class Reservaciones {
    private int Id_Reservaciones;
    private int Id_Cliente;
    private String Fecha;
    private String Hora;
    private int Num_Persona;
    accesobd bd;

    public Reservaciones() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//1  ta
        bd.conectarBD();
        //T= ta
    }

    public void setId_Reservaciones(int Id_Reservaciones) {
        this.Id_Reservaciones = Id_Reservaciones;
    }
    
    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;//1  ta
        //T= ta
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;//1  ta
        //T= ta
    }

    public void setHora(String Hora) {
        this.Hora = Hora;//1  ta
        //T= ta
    }

    public void setNum_Persona(int Num_Persona) {
        this.Num_Persona = Num_Persona;//1  ta
        //T= ta
    }

    public int getId_Reservaciones() {
        return Id_Reservaciones;
    }
    
    public int getId_Cliente() {
        return Id_Cliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public int getNum_Persona() {
        return Num_Persona;
    }
   

    public int Incremento_Reservaciones() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idreservaciones) as num FROM reservaciones;");//1  ta
        if (rs.next()) {//2 n(tc)
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
    

    public void Insertar_Reservaciones() throws SQLException {
        String cadena = "insert into reservaciones values('" +Incremento_Reservaciones()//1  ta + to
                + "','" +getId_Cliente() + "','" + getFecha() + "','"  + getHora() + "','" + getNum_Persona() + "')";
        bd.ActualizarBD(cadena);
        //Tiempo=  ta + to

    }

    public void Actualizar_Reservaciones() throws SQLException {
        String cadena = "update reservaciones set idcliente='"+ getId_Cliente()//1  ta + to
                +"', fecha= '" + getFecha() +"',hora= '" + getHora() +"',numpersona= '" +getNum_Persona()+ "'where idreservaciones='" + getId_Reservaciones()+ "' ";
        bd.ActualizarBD(cadena);
        //Tiempo=  ta + to
    }

    public void Eliminar_Reservaciones() throws SQLException{
        String cadena = "delete from reservaciones where idreservaciones ='" +//1  ta + to
                getId_Reservaciones()+ "'";
        bd.ActualizarBD(cadena);
        //Tiempo= ta + to
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void Consultar_Reservaciones() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from reservaciones");//1  ta
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
