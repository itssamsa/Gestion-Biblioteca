package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String idUsuario;
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | ID: " + idUsuario;
    }


}
