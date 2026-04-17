public class Tarifa {
    // Atributo de Instancia
    private int t15,t30,t60,tFija;

    // Constructor
    public Tarifa(int t1,int t2,int t3,int tFija){
        this.t15 = t1;
        this.t30 = t2;
        this.t60 = t3;
        this.tFija = tFija;
    }

    // Consultas
    public int obtenerT15(){
        return this.t15;
    }
    public int obtenerT30(){
        return this.t30;
    }
    public int obtenerT60(){
        return this.t60;
    }
    public int obtenerTFija(){
        return this.tFija;
    }
}