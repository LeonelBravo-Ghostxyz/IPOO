public class Hora {
    // Atributo de Instancia
    private int hor,min;

    // Constructor
    public Hora(int h,int m){
        this.hor = h;
        this.min = m;
    }

    // Comandos
    public void establecerHora(int c){
        this.hor = c;
    }
    public void establecerMinutos(int c){
        this.min = c;
    }
    public void copy(Hora h){
        this.hor = h.obtenerHora();
        this.min = h.obtenerMinutos();
    }

    // Consultas
    public int obtenerHora(){
        return this.hor;
    }
    public int obtenerMinutos(){
        return this.min;
    }
    public boolean equals(Hora c){
        return (this.hor == c.obtenerHora() && this.min == c.obtenerMinutos());
    }
    public int diferenciaMinutos(Hora c){
        return Math.abs((this.hor - c.obtenerHora())*60) + Math.abs((this.min - c.obtenerMinutos()));
    }
    public boolean anterior(Hora c){
        if(this.hor < c.obtenerHora())return true;
        else if(this.hor == c.obtenerHora() && this.min < c.obtenerMinutos())return true;
        else return false;
    }
}
