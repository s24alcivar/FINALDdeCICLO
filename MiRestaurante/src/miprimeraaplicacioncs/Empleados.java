
package miprimeraaplicacioncs;
import java.sql.*;
/*PROYECTO FINAL CICLO
-- Objetos y Abstraccion de Datos --
Calculo de Costes
Esneyder Alcivar Velez
*/
public class Empleados {

    private int id_empleado;
    private int id_reservaciones;
    private int id_pedido;
    private String nombre;
    private String rol;
    private int salario;
    accesobd bd;

    public Empleados() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//1  ta
        bd.conectarBD();
        //T= ta
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;//1  ta
        //T= ta
    }

    public int getId_reservaciones() {
        return id_reservaciones;
    }

    public void setId_reservaciones(int id_reservaciones) {
        this.id_reservaciones = id_reservaciones;//1  ta
        //T= ta
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;//1  ta
        //T= ta
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;//1  ta
        //T= ta
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;//1  ta
        //T= ta
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;//1  ta
        //T= ta
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;
    }

    public int Incremento_Empleados() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idempleado) as num FROM empleados;");//1  ta
        if (rs.next()) {//2  tc
            inc = rs.getInt(1) + 1; //3  n(ta + to)
        } else {
            inc = 1;//4  ta
        }
        return inc;
        //Tiempo del metodo
        //T= ta + tc + n(ta + to)+ ta
        //T= ta + tc + nta + nto + ta
        //T= 2ta + tc + nta + nto
        //T= 2ta + tc + n(ta + to)
    }
    

    public void Insertar_Empleados() throws SQLException {
        String cadena = "insert into empleados values('" + Incremento_Empleados() //1  ta + to
                + "','" + getId_reservaciones() + "','" + getId_pedido() + "','" 
                + getNombre() + "','" + getRol() + "','" + getSalario() + "')";
        bd.ActualizarBD(cadena);
        //T= ta + to

    }

    public void Actualizar_Empleados() throws SQLException {
        String cadena = "update empleados set idreservaciones='"+//1  ta + to
                getId_reservaciones()+"', idpedido= '" + getId_pedido() 
                +"',nombre= '" + getNombre() +"',rol= '" +getRol()
                +"',salario= '" +getSalario()+ "'where idempleado='" + getId_empleado()+ "' ";
        bd.ActualizarBD(cadena);
        //T= ta + to
    }

    public void Eliminar_Empleados() throws SQLException{
        String cadena = "delete from empleados where idempleado ='" + getId_empleado()+ "'";//1  ta + to
        bd.ActualizarBD(cadena);
        //T= ta + to
    }
    

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void Consultar_Empleados() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from empleados");//1  ta
        while (rs.next()) {//2  ntc
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
        //Tiempo del metodo
        //T= ta + ntc
    }

}

    
    

