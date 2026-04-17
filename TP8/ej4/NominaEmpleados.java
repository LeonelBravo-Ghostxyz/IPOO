package ej4;

public class NominaEmpleados extends Coleccion {
    // << Constructor >>
    public NominaEmpleados(int n){
        super(n);
    }

    // << Consultas >>
    public int contarSupHoras(int h){
        int cont = 0;
        Empleado aux;
        for(int i=0;i<super.cantElementos(); i++){
            aux = (Empleado) super.recuperarElemento(i);
            if(aux != null && aux.obtenerCantHoras() > h)
                cont++;
        }
        return cont;
    }
    public float sumarSueldos(){
        float res = 0;
        Empleado aux;

        for(int i=0;i<super.cantElementos();i++){
            aux = (Empleado) super.recuperarElemento(i);
            res = res + aux.obtenerValorHora() * aux.obtenerCantHoras();
        }
        return res;
    }

}
