package ej7;

public class Tribu extends Conjunto{
    // << Constructor >>
    public Tribu(int max){
        super(max);
    }

    // << Consultas >>
    public boolean hayTresDecrecientes(){
        int cont = 0;
        int cumplen = 0;
        boolean res = false;
        Criatura esCriatura = new Criatura(null);
        for(int i=0;i<super.cantElementos();i++){
            if(ce[i] != null && ce[i].getClass() == esCriatura.getClass())cont++;
            else cont = 0;
            if(cont == 3){
                cont = 0;
                cumplen++;
            }
        }
        if(cumplen == 1)res = true;
        return res;
    }
}
