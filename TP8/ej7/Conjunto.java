package ej7;

public class Conjunto {
    // << Atributos de Instancia >>
    protected Elemento[] ce;
    protected int cantElementos;

    // << Constructor >>
    public Conjunto(int max){
        if(max > 0){
            ce = new Elemento[max];
        }else{
            ce = new Elemento[10];
        }
        cantElementos = 0;
    }

    // << Comandos >>
    public void insertar(Elemento e){
        if(cantElementos < ce.length && !pertenece(e)){ce[cantElementos] = e; cantElementos++;}
    }

    // << Consultas >>
    public boolean pertenece(Elemento e){
        boolean res = false;
        for(int i=0;i<cantElementos && !res;i++){
            if(ce[i].equals(e))res = true;
        }
        return res;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto interseccion = null;
        int interseccionCant = 0;
        if(c != null){
            if(c.cantElementos() > cantElementos){
                interseccionCant = c.cantElementos();
                interseccion = new Conjunto(interseccionCant);
            }else{
                interseccionCant = cantElementos;
                interseccion = new Conjunto(interseccionCant);
            }

            for(int i=0;i<cantElementos;i++){
                for(int j=0;j<c.cantElementos();j++){
                    if(ce[i].equals(c.obtener(j))){
                        interseccion.insertar(ce[i]);
                    }
                }
            }
        }
        return interseccion;
    }
    public boolean aLoSumoNComplemento(int n,Elemento e){
        boolean res = false;
        int cont = 0;
        for(int i=0;i<cantElementos && cont<=n;i++){
            if(e != null && e.complemento(ce[i])){
                cont++;
            }
        }
        if(cont <= n)res = true;
        return res;
    }
    public int cantElementos(){return cantElementos;}


    // << Metodos privados >>
    private Elemento obtener(int pos){
        Elemento res = null;
        if(pos >= 0 && pos < ce.length)
            res = ce[pos];
        return res;
    }

}