package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Persona;

public class PersonasJDBC {
    private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";
    // private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido)
    // VALUES(?,?)";
    // private final String SQL_UPDATE = "UPDATE TABLE persona SET nombre = ?,
    // apellido = ? WHERE id_persona = ?";
    // private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    /**
     * Método que ejecuta un SELECT
     *
     * @return personasLista (List<Persona>)
     * @author Dante
     */
    public List<Persona> select() {
        Connection conn = null;
        PreparedStatement prstmt = null;
        ResultSet rs = null;
        Persona persona = null;

        List<Persona> personasLista = new ArrayList<Persona>();

        try {
            conn = Conexion.conectarBD();
            System.out.println("\nEJECUTANDO QUERY: " + SQL_SELECT);
            prstmt = conn.prepareStatement(SQL_SELECT);
            rs = prstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);

                persona = new Persona();
                persona.setId(id);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personasLista.add(persona);
            }
        } catch (SQLException e) {
            System.out.println("ERROR | NO SE HA PODIDO EJECUTAR EL SELECT O CONECTAR A LA BASE DE DATOS");
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } finally {
            Conexion.close(conn);
            Conexion.close(rs);
            Conexion.close(prstmt);
        }
        return personasLista;
    }
}
