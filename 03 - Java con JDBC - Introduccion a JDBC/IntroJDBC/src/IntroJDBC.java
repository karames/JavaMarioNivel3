import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IntroJDBC {
    public static void main(String[] args) throws Exception {
        // Cadena de conexion
        String url = "jdbc:mariadb://localhost:3306/sga-mario?useSSL=false";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement declaracion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido FROM persona";
            ResultSet resultado = declaracion.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("");
                System.out.print("ID: " + resultado.getInt(1));
                System.out.print("\tNombre: " + resultado.getString(2));
                System.out.print("\tApellido: " + resultado.getString(3));
            }
            resultado.close();
            declaracion.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.err.println("Ha ocurrido un error fatal: " + error);
            error.printStackTrace();
        } finally {
            System.out.println("\nSe ha completado el código");
        }
    }
}
