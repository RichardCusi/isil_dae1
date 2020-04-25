package pe.isil.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL="jdbc:mysql://isil-db.c4utrkzk5zgf.us-west-1.rds.amazonaws.com:3306/isil_dae1_db";
    private static final String USSER="isil_dae1_user";
    private static final String PSWRD="isil_dae1_password";

    public static final String DRIVER="com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        //Si el driver no existe, retora una excepcion  ClassNotFoundException
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USSER,PSWRD);
    }

    //Prueba
    public static void main(String[] args) {
        try {
            DatabaseUtil.getConnection();
            System.out.println("Conexion satisfactoria! estas dentro! ayyyyyyyyyyyy");
        } catch (SQLException e) {
            System.err.println("Error de conexion a base de datos");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("No se pudo ubicar el driver o no existe");
            e.printStackTrace();
        }
    }

}
