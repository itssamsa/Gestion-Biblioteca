package co.edu.uniquindio.model;

import co.edu.uniquindio.services.GestionInventario;

public class Bibliotecario extends Empleado implements GestionInventario {
    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void gestionarItem(Libro libro) {
        System.out.println("El bibliotecario " + nombre + " gestiona el libro: " + libro.getTitulo());
    }
}