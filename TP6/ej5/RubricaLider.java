package ej5;

public class RubricaLider extends Rubrica {
    // << Atributos de Instancia >>
    protected int gestionConflictos,gestionCambios;

    // << Constructor >>
    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l, c, a, r);
        gestionConflictos = go;
        gestionCambios = ga;
    }

    // << Comandos >>
    public void establecerConflictos(int p){
        if(p >= 0){
            gestionConflictos = p;
        }
    }
    public void establecerCambios(int p){
        if(p >= 0){
            gestionCambios = p;
        }
    }

    // << Consultas >>
    public int obtenerGestionConflictos(){return gestionConflictos;}
    public int obtenerGestionCambios(){return gestionCambios;}
    public String toString(){
        String res = super.toString()+"\nGestionConflictos: "+gestionConflictos+"\tGestionCambios: "+gestionCambios;
        return res;
    }
    public int total(){
        return super.total() + gestionConflictos + gestionCambios;
    }
    public float promedio(){
        return (obtenerAutonomia() + obtenerComunicacion() + obtenerResponsabilidad() + gestionConflictos + gestionCambios)/5;
    }
}