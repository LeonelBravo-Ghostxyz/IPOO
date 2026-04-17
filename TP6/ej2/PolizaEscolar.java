package ej2;

public class PolizaEscolar extends Poliza {
    // << Atributos de Instancia >>
    private int cantAlumnos,cantDocentes;

    // << Constructores >>
    public PolizaEscolar(int np){
        super(np);
    }
    public PolizaEscolar(int np, float i, float r, int ca, int cd){
        super(np,i,r);
        cantAlumnos = ca;
        cantDocentes = cd;
    }

    // << Comandos >>
    public void establecerCantAlumnos(int n){
        cantAlumnos = n;
    }
    public void establecerCantDocentes(int n){
        cantDocentes = n;
    }

    // << Consultas >>
    public int obtenerCantAlumnos(){
        return cantAlumnos;
    }
    public int obtenerCantDocentes(){
        return cantDocentes;
    }
    public float obtenerCostoPoliza(int p){
        return (super.obtenerCostoPoliza()+cantAlumnos*1.5f+cantDocentes*p);
    }
}
