package ej13;


public class Dispositivo {
    // << Atributos de Clase >>
    protected static final double max = 0.01;

    // << Atributos de Instancia >>
    protected double p1,p2;

    // << Constructor >>
    public Dispositivo(double pU, double pD){
        p1 = pU; p2 = pD;
    }

    // << Comandos >>
    public void establecerP1(double p){
        if(p>= 0){
            p1 = p;
        }
    }
    public void establecerP2(double p){
        if(p>=0){
            p2 = p;
        }
    }
    
    // << Consultas >>
    public double obtenerP1(){return p1;}
    public double obtenerP2(){return p2;}
    public boolean riesgo(){return p2>p1;}
    public boolean emergencia(){return p1<max;}
    public boolean equals(Dispositivo d){
        boolean res = true;
        if(d == null)res = false;
        else{
            res = p1 == d.obtenerP1() && p2 == d.obtenerP2();
        }
        return res;
    }
    public Dispositivo clone(){
        return new Dispositivo(p1, p2);
    }
}