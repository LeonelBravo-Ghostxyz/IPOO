package Ej6;

public class Equipo {
    // Atributos de Instancia
    private String nombre;
    private Jugador capitan;
    private int pG,pE,pP,gFavor,gContra;

    // Constructor
    public Equipo(String nom, Jugador cap){
        nombre = nom;
        capitan = cap;
    }

    // Comandos
    public void incrementarPG(boolean jugoElCap){
        this.pG = this.pG+1;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }
    }
    public void incrementarPE(boolean jugoElCap){
        this.pE = this.pE+1;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }
    }
    public void incrementarPP(boolean jugoElCap){
        this.pP = this.pP+1;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }
    }
    public void aumentarGFavor(int total, int delCap){
        gFavor = gFavor + total;
        capitan.aumentarGoles(delCap);
    }
    public void aumentarGContra(int total){
        gContra = gContra + total;
    }

    // Consultas
    public String obtenerNombre(){
        return this.nombre;
    }
    public Jugador obtenerCapitan(){
        return this.capitan;
    }
    public int obtenerPG(){
        return this.pG;
    }
    public int obtenerPE(){
        return this.pE;
    }
    public int obtenerPP(){
        return this.pP;
    }
    public int obtenerGFavor(){
        return this.gFavor;
    }
    public int obtenerGContra(){
        return this.gContra;
    }
    public int obtenerPartidos(){
        return (this.pE + this.pG + this.pP);
    }
    public int obtenerPuntos(){
        int total = (this.pG*3 + this.pE*2 + this.pP);
        return total;
    }
    public Equipo mejorPuntaje(Equipo e){
        if(e.obtenerPuntos() > this.obtenerPuntos()){
            return e;
        }
        if(e.obtenerPuntos() < this.obtenerPuntos()){
            return this;
        }
        if(e.obtenerPuntos() == this.obtenerPuntos()){
            if(e.obtenerGFavor() > this.obtenerGFavor()){
                return e;
            }
            if(e.obtenerGFavor() < this.obtenerGFavor()){
                return this;
            }
            if(e.obtenerGFavor() == this.obtenerGFavor()){
                if(e.obtenerGContra() < this.obtenerGContra()){
                    return e;
                }else{
                    return this;
                }
            }
        }
        return this;
    }
    public Jugador capitanConMasGoles(Equipo e){
        return this.capitan.jugConMasGoles(e.capitan);
    }
    public String toString(){
        return "Equipo: " + this.nombre + " Capitan: " + this.capitan.obtenerNombre() + " PG: " + this.pG + " PE: " + this.pE + " PP: " + this.pP + " GF: " + this.gFavor + " GC: " + this.gContra;
    }
    public boolean equals(Equipo e){
        return (nombre == e.obtenerNombre() && capitan == e.obtenerCapitan() && pG == e.obtenerPG() && pE == e.obtenerPE() && pP == e.obtenerPP() && gContra == e.obtenerGContra() && gFavor == e.obtenerGFavor());
    }


}