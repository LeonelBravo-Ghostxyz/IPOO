package ej5;

public class Imagen extends MatrizGenerica{
    // << Constructor >>
    public Imagen(int n){
        super(n, n);
    }

    // << Consultas >>
    public boolean todosGrises(){
        boolean res = true;
        for(int i=0;i<super.cantFilas() && res;i++){
            for(int j=0;j<super.cantColumnas() && res;j++){
                Color col = (Color) super.obtener(i, j);
                res = col.esGris();
            }
        }
        return res;
    }
}
