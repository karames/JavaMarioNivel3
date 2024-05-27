package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String HOST = "jdbc:mariadb://localhost:3306/";
    private static final String BD = "sga-mario";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static synchronized Connection conectarBD() {
        System.out.println("");
        System.out.println("CONECTANDO CON LA BASE DE DATOS...");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(HOST + BD, USER, PASSWORD);
            System.out.println("\033[32mOK\033[39;49m | SE HA CONECTADO A LA BASE DE DATOS");
        } catch (SQLException e) {
            System.out.println("\033[31mERROR\033[39;49m | NO SE HA CONECTADO A LA BASE DE DATOS");
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return conn;
    }

    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                System.out.println("\033[32mOK\033[39;49m | SE HA PODIDO CERRAR EL RESULTSET");
            }
        } catch (SQLException e) {
            System.out.println("ERROR | NO SE HA PODIDO CERRAR EL RESULTSET");
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    public static void close(PreparedStatement prstmt) {
        try {
            if (prstmt != null) {
                prstmt.close();
                System.out.println("\033[32mOK\033[39;49m | SE HA PODIDO CERRAR EL PREPARESTATEMENT");
            }
        } catch (SQLException e) {
            System.out.println("\033[31mERROR\033[39;49m | NO SE HA PODIDO CERRAR EL PREPARESTATEMENT");
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("\033[32mOK\033[39;49m | SE HA PODIDO CERRAR LA CONEXIÓN");
            }
        } catch (SQLException e) {
            System.out.println("ERROR | NO SE HA PODIDO CERRAR LA CONEXIÓN");
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }
}
