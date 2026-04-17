package ej7;

public class Criatura extends Elemento{
    // << Atributo de Clase >>
    protected static final int maxEnergia = 1000;

    // << Atributo de Instancia >>
    protected String nombre;
    protected int energia;

    // << Constructor >>
    public Criatura(String nom){
        nombre = nom; energia = maxEnergia;
    }

    // << Comandos >>
    public void jugar(){
        if(energia > 0){
            energia--;
        }
    }
    
    // << Consultas >>
    public String obtenerNombre(){return nombre;}
    public int obtenerEnergia(){return energia;}
    public boolean equals(Elemento c){
        boolean ig = this == c;
        if(!ig && c != null && getClass() == c.getClass()){
            Criatura e = (Criatura) c;
            ig = e.obtenerEnergia() == energia && e.obtenerNombre() == nombre;
        }

        return ig;
    }
    public boolean complemento(Elemento c){
        boolean res = false;

        if(c != null && c.getClass() == getClass()){
            Criatura cast = (Criatura) c;
            res = cast.obtenerEnergia() + energia > maxEnergia;
        }
        return res;
    }
}