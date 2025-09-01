package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Prestamo;
import co.edu.uniquindio.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private static Biblioteca instancia;

    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();

    private Biblioteca() {}

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void agregarUsuario(Usuario usuario) { listaUsuarios.add(usuario); }
    public void agregarLibro(Libro libro) { listaLibros.add(libro); }
    public void agregarBibliotecario(Bibliotecario biblio) { listaBibliotecarios.add(biblio); }

    public void registrarPrestamo(Prestamo prestamo) { listaPrestamos.add(prestamo); }

    //ejercios-1
    public int contarPrestamosPorTitulo(String titulo) {
        int contador = 0;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibroAsociado().getTitulo().equalsIgnoreCase(titulo)) {
                contador++;
            }
        }
        return contador;
    }

    //2
    public int contarPrestamosEntreFechas(String inicio, String fin) {
        int contador = 0;
        for (Prestamo prestamo : listaPrestamos) {
            String fecha = prestamo.getFechaPrestamo();
            if (fecha.compareTo(inicio) >= 0 && fecha.compareTo(fin) <= 0) {
                contador++;
            }
        }
        return contador;
    }

    //3
    public int contarPrestamosPorUsuario(String idUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdUsuario().equalsIgnoreCase(idUsuario)) {
                return usuario.getListaPrestamos().size();
            }
        }
        return 0; // Si no encuentra el usuario
    }

    public void mostrarInfo() {
        System.out.println("Usuarios: " + listaUsuarios);
        System.out.println("Libros: " + listaLibros);
        System.out.println("Bibliotecarios: " + listaBibliotecarios);
        System.out.println("Préstamos: " + listaPrestamos);
    }
}