package ej3;

public class ColeccionOrdenada {
    // << Atributos de Instancia >>
    protected Elemento[] t;
    protected int cant;

    // << Constructor >>
    public ColeccionOrdenada(int max){
        t = new Elemento[max];
        cant = 0;
    }

    // << Comandos >>
    public void insertar(Elemento e){
        boolean insertado = false;
        for(int i=0;i<cant && !insertado;i++){
            if(!e.esMayor(t[i])){
                for(int j=cant;j>i;j--){
                    t[j+1] = t[j];
                }
                t[i] = e;
                insertado = true;
            }
        }
    }
    public void eliminar(Elemento e){
        boolean esta = false; int p = 0;
        for(int i=0;i<cant && !esta;i++){
            if(e!=null && e.esEquivalente(t[i])){
                esta = true; p = i;
            }
        }
        if(esta){
            for(int j=cant;j>p;j--){ //Note: mientras que j sea mayor a p (posicion que quiero eliminar)
            t[j-1] = t[j];
            }
            cant--; 
        }
    }

    // << Consultas >>
    public boolean estaLlena(){return t.length == cant;}
    public boolean hayElementos(){return cant>0;}
    public int cantElementos(){return cant;}
    public boolean existePosicion(int p){return p>=0 && p<cant;}
    public Elemento recuperarElemento(int p){
        Elemento res = null;
        if(existePosicion(p))res = t[p];
        return res;
    }
    public boolean estaElemento(Elemento e){
        boolean res = false;

        if(hayElementos() && e != null){
            int lower = 0;
            int higher = cant;
            int middleIndex = (lower+higher)/2;
            Elemento middleIndexElemento = t[middleIndex];

            while(lower < higher && !res){
                if(middleIndexElemento.esEquivalente(e)){
                    res = true;
                }
                if(middleIndexElemento.esMayor(e)){
                    higher = middleIndex;
                }
                if(e.esMayor(middleIndexElemento)){
                    lower = middleIndex;
                }
            }
        }
        return res;
    }
    public ColeccionOrdenada intercalar(ColeccionOrdenada c){
        ColeccionOrdenada res;
        if(c != null){
            res = new ColeccionOrdenada(cant + c.cantElementos());
            int index00 = 0; //Note: index00 pertenece a la coleccion que recibe el mensaje
            int index01 = 0;
            for(int i=0;i<res.cantElementos() && index00 < cant && index01 < c.cantElementos();i++){
                if(index00 == index01){
                    res.insertar(t[index00]);
                    index00++;
                }else{
                    res.insertar(c.recuperarElemento(index01));
                    index01++;
                }
            }
        }else{
            res = this;
        }

        return res;
    }

}
