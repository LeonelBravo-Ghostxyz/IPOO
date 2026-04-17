package ej5;

public class RubricaAdministrador extends RubricaLider {
    // << Atributos de Instancia >>
    protected int proyectos;

    // << Constructor >>
    public RubricaAdministrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l, c, a, r, go, ga);
        proyectos = p;
    }

    // << Comandos >>
    public void aumentarProyectos(){proyectos++;}

    // << Consultas >>
    public int obtenerProyectos(){return proyectos;}
    public String toString(){
        String res = super.toString()+"\nProyectos: "+proyectos;
        return res;
    }
    public float productividad(){
        return 4*super.promedio()+proyectos*10;
    }
}