package co.edu.uniquindio.model;

public class Prestamo {

    private Libro libroAsociado;
    private Usuario usuarioAsociado;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) {
        this.libroAsociado = libro;
        this.usuarioAsociado = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;

        libro.setDisponible(false);
        usuario.agregarPrestamo(this);
    }

    public Libro getLibroAsociado() {
        return libroAsociado;
    }

    public void setLibroAsociado(Libro libroAsociado) {
        this.libroAsociado = libroAsociado;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo: Libro=" + libroAsociado + ", Usuario=" + usuarioAsociado +
                ", Fecha Prestamo=" + fechaPrestamo + ", Fecha Devolución=" + fechaDevolucion;
    }

}
