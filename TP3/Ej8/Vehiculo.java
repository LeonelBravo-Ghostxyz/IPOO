public class Vehiculo {
    // Atributo de Instancia
    private Hora ingreso,egreso;
    private int numero;
    private String patente;

    // Constructor
    public Vehiculo(Hora i,int n,String p){
        this.ingreso = i;
        this.numero = n;
        this.patente = p;
    }

    // Comandos
    public void egresaVehiculo(Hora c){
        this.egreso = c;
    }
    public void copy(Vehiculo v){
        this.patente = v.obtenerPatente();
        this.numero = v.obtenerNumero();
        this.ingreso.copy(v.obtenerIngreso());
        this.egreso.copy(v.obtenerEgreso());
    }

    // Consultas
    public Hora obtenerIngreso(){
        return this.ingreso;
    }
    public Hora obtenerEgreso(){
        return this.egreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obteneraCobrar(Tarifa t){
        int difMin = this.egreso.diferenciaMinutos(this.ingreso);
        if(this.egreso == null)return 0;
        if(difMin <= 15 && difMin > 0)return t.obtenerT15();
        else if(difMin <= 30 && difMin > 15)return t.obtenerT30();
        else if(difMin == 60 && difMin > 30)return t.obtenerT60();
        else return t.obtenerTFija();
    }
    public boolean equals(Vehiculo v){
        return (this.ingreso.equals(v.obtenerIngreso()) &&
        this.egreso.equals(v.obtenerEgreso()) && this.numero == v.obtenerNumero() && this.patente == v.obtenerPatente());
    }
}