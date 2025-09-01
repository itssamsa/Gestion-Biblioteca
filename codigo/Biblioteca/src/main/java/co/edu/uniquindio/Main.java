package co.edu.uniquindio;

import co.edu.uniquindio.factory.Biblioteca;
import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Prestamo;
import co.edu.uniquindio.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstancia();

        Usuario u1 = new Usuario("Ana", "U1");
        Usuario u2 = new Usuario("Luis", "U2");
        biblioteca.agregarUsuario(u1);
        biblioteca.agregarUsuario(u2);

        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "111");
        Libro l2 = new Libro("El Principito", "Antoine", "222");
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        Prestamo p1 = new Prestamo(l1, u1, "2024-08-01", "2024-08-10");
        Prestamo p2 = new Prestamo(l2, u1, "2024-08-05", "2024-08-15");
        Prestamo p3 = new Prestamo(l1, u2, "2024-08-07", "2024-08-20");

        biblioteca.registrarPrestamo(p1);
        biblioteca.registrarPrestamo(p2);
        biblioteca.registrarPrestamo(p3);

        // 1
        System.out.println("El libro 'El principito' se ha prestado "
                + biblioteca.contarPrestamosPorTitulo("El Principito") + " veces.");

        // 2
        System.out.println("Número de préstamos entre 2024-08-01 y 2024-08-10: "
                + biblioteca.contarPrestamosEntreFechas("2024-08-01", "2024-08-10"));

        // 3
        System.out.println("Ana hizo " + biblioteca.contarPrestamosPorUsuario("U1") + " préstamos.");
        System.out.println("Luis hizo " + biblioteca.contarPrestamosPorUsuario("U2") + " préstamos.");
    }
}