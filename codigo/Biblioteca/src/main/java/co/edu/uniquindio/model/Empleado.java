package co.edu.uniquindio.model;

public abstract class Empleado {

    protected String nombre;
    protected String idEmpleado;

    public Empleado(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }
}
