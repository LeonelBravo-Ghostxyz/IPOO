package ej4;

public class Tecnico extends Empleado {
    // << Constructor >>
    public Tecnico(int leg, String nom, int cantH, float valorH){
        super(leg, nom, cantH, valorH);
    }

    // << Consultas >>
    public float obtenerSueldo(){return super.obtenerSueldo()*1.15f;}

}
