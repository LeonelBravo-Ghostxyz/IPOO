package ej13;

public class DispositivoFull extends Dispositivo {
    // << Atributos de Instancia >>
    protected double p3,p4;

    // << Constructor >>
    public DispositivoFull(double pU, double pD, double pT, double pC){
        super(pU,pD);
        p3 = pT; p4 = pC;
    }

    // << Comandos >>
    public void establecerP3(double p){
        if(p>=0){
            p3 = p;
        }
    }
    public void establecerP4(double p){
        if(p>=0){
            p4 = p;
        }
    }

    // << Consultas >>
    public double obtenerP3(){return p3;}
    public double obtenerP4(){return p4;}
    public boolean riesgo(){return super.riesgo() || p4>p3;}
    public boolean emergencia(){return p4<max;}
    public boolean equals(Dispositivo d){
        boolean res = true;

        if(d == null){
            res = false;
        }else{
            DispositivoFull df = (DispositivoFull) d;
            res = super.equals(d) && p3 == df.obtenerP3() && p4 == df.obtenerP4();
        }

        return res;
    }
    public DispositivoFull clone(){
        return new DispositivoFull(p1, p2, p3, p4);
    }
}