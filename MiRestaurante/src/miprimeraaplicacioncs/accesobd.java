
package miprimeraaplicacioncs;
/*PROYECTO FINAL CICLO
-- Objetos y Abstraccion de Datos --
Calculo de Costes
Esneyder Alcivar Velez
*/
import java.sql.*;
public class accesobd {
    private final String host;
    private final String user;
    private final String passwd;
    private final String bd;
    
    private Connection conexion;

    public accesobd(String host, String user, String passwd, String bd) {
        this.host = host;//1  ta
        this.user = user;//2  ta
        this.passwd = passwd;//3 ta
        this.bd = bd;//4  ta
        //T= 4ta
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getBd() {
        return bd;
    }
    
    public void conectarBD() throws Exception{
        try {
            Driver driver=(Driver)//1  ta
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
            String cadena="jdbc:mysql://"+getHost()+"/"+getBd();//2  ta + to
            conexion=DriverManager.getConnection(cadena,getUser(),getPasswd());//3  ta
           } catch (SQLException e) {
            System.out.println("Error a la conexion a la Base de Datos"+e.toString());
        }
        //Tiempo= ta + ta + to + ta
        //T= 3ta + to
    }
    
    public void ActualizarBD(String sql)throws SQLException{
        try {
            Statement stm=conexion.createStatement();//1  ta
            stm.executeUpdate(sql);
            System.out.println("Transaccion Exitosa");
        } catch (SQLException e) {
            System.out.println("Error en la Transaccion "+ e.toString());
        }
        //Tiempo= ta
        
    }
    
    public ResultSet consultaBD(String sql)throws SQLException{
        ResultSet cursor;
        Statement stm=conexion.createStatement();//1  ta
        cursor=stm.executeQuery(sql);//2  ta
        return cursor;
        //T= 2ta
    }
    
   public void cerrarBD()throws SQLException{
       conexion.close();
   }
}

    

