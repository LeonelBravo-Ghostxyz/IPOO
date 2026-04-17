package ej7;

abstract public class Alojamiento {
    // << Atributos de Instancia >>
    protected int id,personas;
    protected DatosPostales datosPostales;

    // << Constructor >>
    public Alojamiento(int id,int p){
        this.id = id; personas = p;
    }

    // << Consultas >>
    public int obtenerId(){return id;}
    public int obtenerPersonas(){return personas;}
    public String toString(){
        String res = "ID: "+id+"\tPersonas: "+personas+"\nDatos Postales: "+datosPostales;
        return res;
    }
    abstract public float costoDiario(int p);
}
