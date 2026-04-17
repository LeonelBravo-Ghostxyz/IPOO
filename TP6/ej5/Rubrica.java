package ej5;

public class Rubrica {
    // << Atributos de Instancia >>
    protected int legajo,comunicacion,autonomia,responsabilidad;

    // << Constructor >>
    public Rubrica(int l, int c, int a, int r){
        legajo = l; comunicacion = c; autonomia = a; responsabilidad = r;
    }

    // << Comandos >>
    public void establecerComunicacion(int p){
        if(p >= 0){
            comunicacion = p;
        }
    }
    public void establecerAutonomia(int p){
        if(p >= 0){
            autonomia = p;
        }
    }
    public void establecerResponsabilidad(int p){
        if(p >= 0){
            responsabilidad = p;
        }
    }

    // << Consultas >>
    public int obtenerLegajo(){return legajo;}
    public int obtenerComunicacion(){return comunicacion;}
    public int obtenerAutonomia(){return autonomia;}
    public int obtenerResponsabilidad(){return responsabilidad;}
    public String toString(){
        String res =  "Legajo: "+legajo+"\tComunicación: "+comunicacion+"\nAutonomía: "+autonomia+"\t Responsabilidad: "+responsabilidad;
        return res;
    }
    public int total(){
        return comunicacion+autonomia+responsabilidad;
    }
    public float promedio(){
        return (comunicacion + autonomia + responsabilidad)/3;
    }
    public float productividad(){
        return 2*comunicacion+3*autonomia+5*responsabilidad;
    }
}
