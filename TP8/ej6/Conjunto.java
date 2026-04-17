package ej6;

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
        if(cantElementos < ce.length && !pertenece(e))ce[cantElementos] = e;
    }

    // << Consultas >>
    public Elemento obtener(int pos){
        Elemento res = null;
        if(pos >= 0 && pos < ce.length)
            res = ce[pos];
        return res;
    }
    public boolean pertenece(Elemento e){
        boolean res = false;
        for(int i=0;i<cantElementos && !res;i++){
            if(ce[i] == e)res = true;
        }
        return res;
    }
    public boolean vacio(){return cantElementos == 0;}
    public boolean incluido(Conjunto c){
        boolean res = false;
        int cont = 0;
        if(c != null && c.cardinalidad() <= cantElementos){
            for(int i=0;i<c.cardinalidad() && !res;i++){
                for(int j=0;j<cantElementos && !res;j++){
                    if(c.obtener(i).esEquivalente(ce[j]))cont++;
                }
            if(cont == c.cardinalidad())res = true;
            }
        }
        return res;
    }
    public boolean esEquivalente(Conjunto c){
        boolean res = c == this;
        int cont = 0;
        if(!res && c != null && c.cardinalidad() == cantElementos){
            boolean flag = true;
            for(int i=0;i<cardinalidad() && flag;i++){
                if(c.obtener(i) == ce[i])cont++;
                else flag = false;
            }
            res = cont == cantElementos;
        }
        return res;
    }
    public boolean disjunto(Conjunto c){
        return interseccion(c) == null;
    }
    public Conjunto union(Conjunto c){
        Conjunto union = null;
        if(c != null){
            union = new Conjunto(cantElementos+c.cardinalidad());
            int toAdd = 0; //Note: 0. this - 1. c (param)
            int cantToAdd = union.cardinalidad();
            int indexToAdd = 0;
            while(cantToAdd > 0){
                if(toAdd == 0){
                    if(ce[indexToAdd] == null){
                        toAdd = 1;
                        indexToAdd = 0;
                    }else {
                        union.insertar(ce[indexToAdd]);
                        indexToAdd++;
                        cantToAdd--;
                    }
                }else{
                    if(c.obtener(indexToAdd) != null){
                        union.insertar(c.obtener(indexToAdd));
                        indexToAdd++;
                        cantToAdd--;
                    }
                }
            }
        }else{
            union = this;
        }

        return union;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto interseccion = null;
        int interseccionCant = 0;
        if(c != null){
            if(c.cardinalidad() > cantElementos){
                interseccionCant = c.cardinalidad();
                interseccion = new Conjunto(interseccionCant);
            }else{
                interseccionCant = cantElementos;
                interseccion = new Conjunto(interseccionCant);
            }

            for(int i=0;i<cantElementos;i++){
                for(int j=0;j<c.cardinalidad();j++){
                    if(ce[i] == c.obtener(j)){
                        interseccion.insertar(ce[i]);
                    }
                }
            }
        }
        return interseccion;
    }
    public Conjunto diferencia(Conjunto c){
        Conjunto diferencia = new Conjunto(cantElementos);
        if(c != null){
            if(c.incluido(diferencia)){
                for(int i=0;i<c.cardinalidad();i++){
                    if(!pertenece(c.obtener(i))){
                        diferencia.insertar(c.obtener(i));
                    }
                }
            }
        }
        return diferencia;
    }
    public int cardinalidad(){return cantElementos;}


}