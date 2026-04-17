package ej1;

public class PromocionPymes extends PlanBase{
    // << Atributos de Instancia >>
    protected boolean activa;

    // << Constructor >>
    public PromocionPymes(int u, int b){
        super(u,b);
        activa = true;
    }

    // << Comandos >>
    public void cambiarActiva(){
        activa = !activa;
    }
    
    // << Consultas >>
    public boolean estaActiva(){
        return activa;
    }
    public int costoPlan(){
        int res;

        if(activa){
            res = base;
        }else{
            res = base + usuarios * 5;
        }

        return res;
    }
}
