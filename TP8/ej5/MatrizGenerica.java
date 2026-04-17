package ej5;

public class MatrizGenerica {
    // << Atributos de Instancia >>
    protected Elemento[][] m;

    // << Constructor >>
    public MatrizGenerica(int nf,int nc){
        m = new Elemento[nf][nc];
    }

    // << Comandos >>
    public void establecer(int f,int c, Elemento e){
        if(f>=0 && f<m.length && c>=0 && c<m[0].length){
            m[f][c] = e;
        }
    }

    // << Consultas >>
    public Elemento obtener(int f, int c){
        Elemento res = null;
        if(f>=0 && f<m.length && c>=0 && c<m[0].length){
            return m[f][c];
        }
        return res;
    }
    public int cantFilas(){return m.length;}
    public int cantColumnas(){return m[0].length;}
    public boolean pertenece(Elemento e){
        boolean res = false;
        for(int i=0;i<cantFilas() && !res;i++){
            for(int j=0;j<cantColumnas() && !res;j++){
                if(m[i][j] == e)res = true;
            }
        }
        return res;
    }
    public int contarElem(Elemento e){
        int cont = 0;
        for(int i=0;i<cantFilas();i++){
            for(int j=0;j<cantColumnas();j++){
                if(m[i][j] == e)cont++;
            }
        }
        return cont;
    }
    public boolean esEquivalente(MatrizGenerica c){
        boolean res = true;
        for(int i=0;i<cantFilas() && res;i++){
            for(int j=0;j<cantColumnas() && res;j++){
                if(m[i][j] != null){
                    res = m[i][j].equals(c.obtener(i, j));
                }
            }
        }
        return res;
    }
    public boolean esComplemento(MatrizGenerica c){
        boolean res = true;
        for(int i=0;i<cantFilas() && res;i++){
            for(int j=0;j<cantColumnas() && res;j++){
                if(m[i][j] != null){
                    res = m[i][j].equals(c.obtener(i, j).complemento());
                }
            }
        }
        return res;
    }
    public MatrizGenerica clone(){
        MatrizGenerica res = new MatrizGenerica(cantFilas(), cantColumnas());

        for(int i=0;i<cantFilas();i++){
            for(int j=0;j<cantColumnas();j++){
                if(m[i][j] == null){
                    res.establecer(i, j, null);
                }else{
                    res.establecer(i, j, m[i][j].clone());
                }
            }
        }

        return res;
    }
}