package miprimeraaplicacioncs;

/**
 *
 * @author Usuario
 */
import java.sql.*;


public class ClienteBeans {
    
    private int Id_Cliente;
    private String Nombres;
    private String Direccion;
    private String Telefono;
    private String Correo;
    accesobd bd;

    public ClienteBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "restaurantesj");//1  ta
        bd.conectarBD();
        //T= ta
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;//1  ta
        //T= ta
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;//1  ta
        //T= ta
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;//1  ta
        //T= ta
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;//1  ta
        //T= ta
    }
    
     public void setCorreo(String Correo) {
        this.Correo = Correo;//1  ta
        //T= ta
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }
    
     public String getCorreo() {
        return Correo;
    }

    public int Incremento_CLiente() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idcliente) as num FROM clientes;");//1  ta
        if (rs.next()) {//2  n(tc)
            inc = rs.getInt(1) + 1;//3  n(ta)
        } else {
            inc = 1;//4  ta
        }
        return inc;
        //TIEMPO DEL METODO
        //T= ta + ntc + nta + ta
        //T= 2ta + nta + ntc
        //T= 2ta + n(ta + tc)
    }

    public void Insertar_Cliente() throws SQLException {
        String cadena = "insert into clientes values('" + Incremento_CLiente()//1  ta + to
                + "','" + getNombres() + "','"  + getDireccion() + "','" +
                getTelefono() + "','" + getCorreo() + "')";
        bd.ActualizarBD(cadena);
        //T= ta + to

    }

    public void Actualizar_Cliente() throws SQLException {
        String cadena = "update clientes set nombre='"+ getNombres()//1  ta + to
                +"', direccion= '" + getDireccion() +"',telefono= '" +
                getTelefono() +"',correo= '" +getCorreo()+ "'where idcliente='" 
                + getId_Cliente()+ "' ";
        bd.ActualizarBD(cadena);
        //T = ta + to
    }

    public void Eliminar_Cliente() throws SQLException{
        String cadena = "delete from clientes where idcliente ='" + getId_Cliente()+ "'";//1  ta + to
        bd.ActualizarBD(cadena);
        //T= ta + to
    }
    
    public ResultSet buscarClientePorId(int Id_Cliente) throws SQLException {
    String consulta = "SELECT * FROM clientes WHERE idcliente = " + Id_Cliente;//1  ta + to
    return bd.consultaBD(consulta);
    //T= ta + to
}



    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void Consultar_Cliente() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from clientes");//1  ta
        while (rs.next()) {//2  tc
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
            //Tiempo del metodo
            //T= ta + tc
        }
    }

}
