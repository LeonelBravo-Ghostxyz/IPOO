package Ej3;

public class Prestamo {
    // Atributos de Instancia
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;

    // Constructor
    public Prestamo(Libro l, Fecha fp, Fecha fd, String s){
        libro = l;
        fechaPrestamo = fp;
        fechaDevolucion = fd;
        socio = s;
        devuelto = false;
    }

    // Consultas
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }
    public boolean estaDevuelto(){
        return devuelto;
    }
    public String obtenerSocio(){
        return socio;
    }
    public boolean estaAtrasado(Fecha hoy){
        if(hoy.esAnterior(fechaDevolucion))return false;
        else return true;
    }
    public Prestamo masAntiguo(Prestamo p){
        if(this.fechaPrestamo.esAnterior(p.obtenerFechaPrestamo()))return this;
        else return p;
    }
    public boolean equals(Prestamo p){
        return this.libro == p.obtenerLibro() && this.socio == p.obtenerSocio() && this.fechaPrestamo.equals(p.obtenerFechaPrestamo())&& this.fechaDevolucion.equals(p.obtenerFechaDevolucion());
    }
    public String toString(){
        return "Libro: " + libro.toString() + "\nSocio: " + socio + "\nFecha de Prestamo: " + fechaPrestamo.toString() + "\nFecha de Devolucion: " + fechaDevolucion.toString() + "\nDevuelto: " + devuelto;
    }


}