package co.edu.uniquindio;

import co.edu.uniquindio.factory.Biblioteca;
import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Prestamo;
import co.edu.uniquindio.model.Usuario;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblio = Biblioteca.getInstancia();
        biblio.mostrarInfo();

        Usuario u1 = new Usuario("Ana", "U001");
        Libro l1 = new Libro("El Quijote", "Cervantes", "12345");
        Bibliotecario b1 = new Bibliotecario("Carlos", "B001");

        b1.gestionarItem(l1);

        Prestamo p1 = new Prestamo(l1, u1, "2025-08-31", "2025-09-15");
        biblio.registrarPrestamo(p1);
    }
}
