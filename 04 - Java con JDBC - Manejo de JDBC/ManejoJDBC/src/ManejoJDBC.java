import java.util.List;

import datos.PersonasJDBC;
import domain.Persona;

public class ManejoJDBC {
    public static void main(String[] args) throws Exception {
        PersonasJDBC personaJDBC = new PersonasJDBC();
        // Prueba método select
        List<Persona> personasLista = personaJDBC.select();

        for (Persona persona : personasLista) {
            System.out.print(persona);
            System.out.println("");
        }

        System.out.println("Registros seleccionados: " + personasLista.size());
    }
}
