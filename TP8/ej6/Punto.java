package ej6;

//Note: Clase modificada del TP5

public class Punto extends Elemento{
    // << Atributos de Instancia >>
    private int x,y;

    // << Constructor >>
    public Punto(int coord,int ord){
        x = coord;
        y = ord;
    }

    // << Comandos >>
    public void establecerX(int coord){
        if(coord >= 0)x=coord;
    }
    public void establecerY(int ord){
        if(ord >= 0)y=ord;
    }
    public void copy(Punto p){

    }
    // << Consultas >>
    public int obtenerX(){
        return x;
    }
    public int obtenerY(){
        return y;
    }
    public Punto clone(){
        return new Punto(x, y);
    }
    public boolean esEquivalente(Elemento p){
        boolean res = false;
        if(p != null && getClass() == p.getClass()){
            Punto p2 = (Punto) p;
            res = (x == p2.obtenerX() && y == p2.obtenerY());
        }
        return res;
    }
    public double distancia(Punto p){
        double deltaY = Math.pow(y - p.obtenerY(),2);
        double deltaX = Math.pow(x-p.obtenerX(),2);
        return Math.sqrt(deltaX+deltaY);
    }


}