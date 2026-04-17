package Ej4;

public class Borde {
    //Atributo de instancia
    private int grosor;
    private Color color;

    //Constructor
    public Borde(int g, Color c){
        grosor = g;
        color = c;
    }

    //Comandos
    public void establecerColor(Color c){
        color = c;
    }
    public void establecerGrosor(int g){
        grosor = g;
    }
    public void copy(Borde b){
        this.grosor = b.obtenerGrosor();
        this.color = b.obtenerColor();
    }

    //Consultas
    public int obtenerGrosor(){
        return grosor;
    }
    public Color obtenerColor(){
        return color;
    }
    public Borde clone(){
        Borde b = new Borde(this.grosor, this.color);
        return b;
    }
    public boolean equals(Borde b){
        return (this.grosor == b.obtenerGrosor() && this.color == b.obtenerColor());
    }
    public String toString(){
        return "Grosor: " + this.grosor + ", Color: " + this.color;
    }
}
