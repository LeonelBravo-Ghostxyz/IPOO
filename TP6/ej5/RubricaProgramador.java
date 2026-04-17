package ej5;

public class RubricaProgramador extends Rubrica{
    // << Atributos de Instancia >>
    protected int lineasCodigo;

    // << Constructor >>
    public RubricaProgramador(int l, int c, int a, int r, int lc){
        super(l, c, a, r);
        lineasCodigo = lc;
    }

    // << Comandos >>
    public void aumentarLineasCodigo(int p){
        lineasCodigo = lineasCodigo + p;
    }

    // << Consultas >>
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }
    public String toString(){
        String res = super.toString()+"\nLineasCodigo: "+lineasCodigo;
        return res;
    }
    public float productividad(){
        return (1.5f * obtenerComunicacion() + 3 * obtenerAutonomia() + 5 * obtenerResponsabilidad() + lineasCodigo / 10000);
    }
}