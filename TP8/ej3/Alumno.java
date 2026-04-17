package ej3;

public class Alumno extends Elemento {
    // << Atributos de Instancia >>
    protected int nroIngreso;
    protected String nombre;
    protected float promedio;

    // << Constructor >>
    public Alumno(int l,String n, float p){
        nroIngreso = l; nombre = n; promedio = p;
    }

    // << Consultas >>
    public int obtenerNroIngreso(){return nroIngreso;}
    public String obtenerNombre(){return nombre;}
    public float obtenerPromedio(){return promedio;}
    public boolean esEquivalente(Elemento e){
        boolean res = false;
        if(e != null){
            Alumno al = (Alumno) e;
            res = al.obtenerNombre() == obtenerNombre() && al.obtenerNroIngreso() == obtenerNroIngreso() && al.obtenerPromedio() == obtenerPromedio();
        }
        return res;
    }
    public boolean esMayor(Elemento e){
        boolean res = false;
        if(e != null){
            Alumno al = (Alumno) e;
            res = obtenerNroIngreso() > al.obtenerNroIngreso();
        }
        return res;
    }
}
