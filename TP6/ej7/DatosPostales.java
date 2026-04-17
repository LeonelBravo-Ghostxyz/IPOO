package ej7;

public class DatosPostales {
    // << Atributos de Instancia >>
    protected String domicilio,edificio;
    protected int cp;

    // << Constructor >>
    public DatosPostales(String d,String e,int c){
        domicilio = d;
        edificio = e;
        cp = c;
    }

    // << Consultas >>
    public String obtenerDomicilio(){return domicilio;}
    public String obtenerEdificio(){return edificio;}
    public int obtenerCP(){return cp;}
    public String toString(){
        String res = "Codigo Postal: "+cp+"\nEdificio"+edificio+"\nDomicilio: "+domicilio;
        return res;
    }
}
