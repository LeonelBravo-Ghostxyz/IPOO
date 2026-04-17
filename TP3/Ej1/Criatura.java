package Ej1;

public class Criatura {   
 /* Atributos de Clase */
    private static int maxEnergia = 100;
    private static int minEnergia = 0;
    private static int consumoEnergia = 10;

 /* Atributos de Instancia */
    private int energia;
    private Refugio refugio;
    private boolean despierto;
    private int caminatas;

 /* Constructor */
    public Criatura(Refugio r){
        refugio = r;
        energia = maxEnergia;
        despierto = true;
        caminatas = 0;
    }

 /* Comandos */
    public boolean dormir(){
        if(despierto && refugio.disponibilidad() > 0){
            refugio.ocuparCama();
            energia = maxEnergia;
            despierto = false;
            return true;
        }else{
            return false;
        }
    }

    public boolean comer(){
        if(refugio != null && despierto && energia++ > maxEnergia){
            refugio.consumirAlimento();
            energia = energia ++;
            return true;
        }else{
            return false;
        }
    }

    public boolean beber(){
        if(refugio != null && despierto && energia++ > maxEnergia){
            refugio.consumirBebida();
            energia = energia++;
            return true;
        }else{
            return false;
        }
    }

    public boolean caminar(){
        if(despierto && energia >= consumoEnergia){
            if(caminatas >= 3){
                if(refugio.disponibilidad() > 0){
                    this.dormir();
                    despierto = false;
                }else{
                    energia = minEnergia;
                }
                return false;
            }else{
            energia = energia - consumoEnergia;
            caminatas = caminatas + 1;
            return true;
            }
        }else{
            return false;
        }
    }

    public boolean despertar(){
        if(refugio != null && !despierto){
            despierto = true;
            refugio.desocuparCama();
            caminatas = 0;
            return true;
        }else{
            return false;
        }
    }

 /* Consultas */
    public int obtenerEnergia(){
        return energia;
    }

    public int obtenerCaminatas(){
        return caminatas;
    }

    public int obtenerHumor(){ 
        if(energia <= 40){
            return 1;
        }else if(energia > 40 && energia <= 70){
            return 2;
        }else{
            return 3;
        }
    }

    public Refugio obtenerRefugio(){
        return refugio;
    }

    public boolean estaDormido(){
        return !despierto;
    }

    public boolean mayorEnergia(Criatura c){
        if(this.energia > c.energia){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Energia: " + energia + " Caminatas: " + caminatas + " Despierto: " + despierto + " Humor: " + this.obtenerHumor();
    }
}