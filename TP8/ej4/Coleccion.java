package ej4;

public class Coleccion {
    // << Atributos de Instancia >> 
    protected Elemento[] col;
    protected int cant;

    // << Constructor >>
    public Coleccion(int max){
        col = new Elemento[max]; cant = 0;
    }

    // << Comandos >>
    public void insertar(Elemento e){
        col[cant] = e; cant++;
    }
    public void eliminar(Elemento e){
        boolean esta = false; int p = 0;
        for(int i=0;i<cant && !esta;i++){
            if(e!=null && e.esEquivalente(col[i])){
                esta = true; p = i;
            }
        }
        if(esta){
            for(int j=p;j<cant-1;j++){ //Note: mientras que j sea mayor a p (posicion que quiero eliminar)
            col[j] = col[j+1];
            }
            cant--; 
            col[cant] = null;
        }
    }
public void ordenada(){
        //Note: Aplica metodo shakesort para ordenar los elementos de la coleccion
        /* Hace dos recorridos, uno de izquierda a derecha ordenando los mayores al final
        y otro de derecha a izquierda ordenando los menores al inicio */
        Elemento aux;
        boolean huboCambios = true;

        while(huboCambios){
            huboCambios = false;
            for(int i=0;i<cant-1;i++){
                if(col[i] != null && col[i].esMayor(col[i+1])){
                aux = col[i];
                col[i] = col[i+1];
                col[i+1] = aux;
                huboCambios = true;
                }
            }
            
            for(int j=cant;j>0 && !huboCambios;j--){
                if(col[j] != null && !col[j].esMayor(col[j-1])){
                aux = col[j];
                col[j] = col[j-1];
                col[j-1] = aux;
                }
            }
        }
    }


    // << Consultas >>
    public boolean estaLlena(){return col.length == cant;}
    public boolean hayElementos(){return cant>0;}
    public int cantElementos(){return cant;}
    public boolean existePosicion(int p){return p>=0 && p < cant;}
    public Elemento recuperarElemento(int p){
        Elemento e = null;
        if(existePosicion(p))
            e = col[p];
        return e;
    }
    public boolean estaElemento(Elemento e){
        boolean esta = false;
        for(int i=0;i<cant && !esta;i++)
            if(e.equals(col[i]))esta = true;
        return esta;
    }
    public String toString(){
        String res = "Esta llena?: "+estaLlena()+", Cantidad de elementos: "+cantElementos();
        for(int i=0;i<col.length;i++){
            if(col[i] != null)
                res = res+"\n"+col[i].toString();
            else res = res+"\n Null";
        }
        return res;
    }
}