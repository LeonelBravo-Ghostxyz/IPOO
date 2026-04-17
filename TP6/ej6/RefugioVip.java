package ej6;

public class RefugioVip extends Refugio {
    // << Atributos de Clase >>
    protected static final int capacidadSillones = 10;

    // << Atributos de Instancia >>
    protected int sillones;

    // << Constructor >>
    public RefugioVip(int a, int b, int c, int s){
        super(a, b, c);
        sillones = s;
    }

    // << Comandos >>
    public boolean ocuparSillon(){
        boolean res = false;
        if(capacidadSillones < sillones){
            sillones++;
            res = true;
        }
        return res;
    }
    public boolean desocuparSillon(){
        boolean res = false;
        if(sillones >= 0){
            sillones--;
            res = true;
        }
        return res;
    }

    // << Consultas >>
    public int obtenerSillones(){return sillones;}
    public int disponibilidad(){return disponibilidad()+sillones;}
    public RefugioVip clone(){
        return new RefugioVip(obtenerAlimentos(),obtenerBebidas(),obtenerCamas(),sillones);
    }
}