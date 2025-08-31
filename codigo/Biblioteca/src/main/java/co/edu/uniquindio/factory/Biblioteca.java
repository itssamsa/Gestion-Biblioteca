package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Prestamo;

public class Biblioteca {

    private static Biblioteca instancia;
    private String nombre;

    private Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca("Biblioteca Central");
        }
        return instancia;
    }

    public void mostrarInfo() {
        System.out.println("Biblioteca: " + nombre);
    }

    public void registrarPrestamo(Prestamo p) {
        System.out.println("Préstamo registrado: Libro '" + p.getLibro().getTitulo() +
                "' para el usuario " + p.getUsuario().getNombre());
    }
}