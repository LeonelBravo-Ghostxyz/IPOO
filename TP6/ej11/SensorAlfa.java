package ej11;

public class SensorAlfa extends Sensor{
    // << Atributos de Instancia >>
    protected float p3,p4;

    // << Constructor >>
    public SensorAlfa(float pU, float pD, float pT, float pC){
        super(pU, pD);
        p3 = pT; p4 = pC;
    }

    // << Comandos >>
    public void establecerP3(float p){
        p3 = p;
    }
    public void establecerP4(float p){
        p4 = p;
    }

    // << Consultas >>
    public float obtenerP3(){return p3;}
    public float obtenerP4(){return p4;}
    public boolean riesgo(){
        boolean res = false;
        if(super.riesgo() || p4 > p3)res = true;
        return res;
    }
    public boolean emergencia(){
        return p4<max;
    }
    public SensorAlfa clone(){
        return new SensorAlfa(obtenerP1(), obtenerP2(), obtenerP3(), obtenerP4());
    }
}