package ej4;

public class Empleado extends Elemento {
    // << Atributos de Instancia >>
    protected int legajo,cantHoras;
    protected String nombre;
    protected float valorHora;

    // << Constructor >>
    public Empleado(int leg, String nombre, int cantH, float valorH){
        legajo = leg; this.nombre = nombre; cantHoras = cantH; valorHora = valorH;
    }

    // << Comandos >>


    // << Consultas >>
    public int obtenerLegajo(){return legajo;}
    public int obtenerCantHoras(){return cantHoras;}
    public String obtenerNombre(){return nombre;}
    public float obtenerValorHora(){return valorHora;}
    public float obtenerSueldo(){return valorHora*cantHoras;}
    public boolean esEquivalente(Elemento e){
        boolean res = false;
        if(this == e)res = true;
        else if(e != null && getClass() == e.getClass()){
            Empleado em = (Empleado) e;
            res = em.obtenerLegajo() == legajo;
        }
        return res;
    }
    public boolean esMayor(Elemento e){
        boolean res = false;
        if(e != null && getClass() == e.getClass()){
            Empleado em = (Empleado) e;
            res = legajo > em.obtenerLegajo();
        }
        return res;
    }
}