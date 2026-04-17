package Ej4;

public class Color {
    /* Atributos de instancia */
    private int rojo,verde,azul;

    /* Contructor */
    public Color(){
        rojo= 255;
        verde = 255;
        azul = 255;
    }
    public Color(int r, int a, int v){
        if( r > 255 || v > 255 || a > 255){
            rojo = 255;
            verde = 255;
            azul = 255;
        }else{
            rojo = r; verde = v; azul = a;
        }
    }

    /* Comandos */
    public void variar(int val){
        if(rojo + val <= 255 && rojo + val >= 0){
            rojo = rojo + val;
        }
        if(verde + val <= 255 && verde + val >= 0){
            verde = verde + val;
        }
        if(azul + val <= 255 && azul + val >= 0){
            azul = azul + val;
        }
    }
    public void variarRojo(int val){
        if(rojo + val <= 255 && rojo + val >= 0){
            rojo = rojo + val;
        }
    }
    public void variarAzul(int val){
        if(azul + val <= 255 && azul + val >= 0){
            azul = azul + val;
        }
    }
    public void variarVerde(int val){
        if(verde + val <= 255 && verde + val >= 0){
            verde = verde + val;
        }
    }
    public void establecerRojo(int val){
        if(val <= 255 && val >= 0){
            rojo = val;
        }
    }
    public void establecerAzul(int val){
        if(val <= 255 && val >= 0){
            azul = val;
        }
    }
    public void establecerVerde(int val){
        if(val <= 255 && val >= 0){
            verde = val;
        }
    }
    public void copy(Color c){
        if(c != null){
            rojo = c.obtenerRojo();
            azul = c.obtenerAzul();
            verde = c.obtenerVerde();
        }
    }

    /* Consultas */
    public int obtenerRojo(){
        return rojo;
    }
    public int obtenerAzul(){
        return azul;
    }
    public int obtenerVerde(){
        return verde;
    }
    public boolean esRojo(){
        if(rojo > azul && rojo > verde)return true;
        else return false;
    }
    public boolean esGris(){
        if(rojo > 0 && rojo == azul && rojo == verde)return true;
        else return false;
    }
    public boolean esNegro(){
        if(rojo == 0 && rojo == azul && rojo == verde)return true;
        else return false;
    }
    public Color complemento(){
        int r = 255 - this.rojo;
        int g = 255 - this.verde;
        int b = 255 - this.azul;

        Color nuevoColor = new Color(r,b,g);
        return nuevoColor;
    }
    public boolean equals(Color c){
        if(c != null){
            if(this.rojo == c.obtenerRojo() && this.azul == c.obtenerAzul() && this.verde == c.obtenerVerde())return true;
            else return false;
        }else return false;
    }
    public Color clone(){
        Color nuevoColor = new Color(this.rojo, this.azul, this.verde);
        return nuevoColor;
    }
    public String toString(){
        return "Rojo: "+this.rojo+" Azul: "+this.azul+" Verde: "+this.verde;
    }

}