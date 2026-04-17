package Ej2;
public class TesterPoliza {
    public static void main(String a[]){
        /*
        * Test Ej2 b
        *
        * Poliza p = new Poliza(1,22,26);
        *
        * System.out.println("Testeo de Poliza Ej 2b");
        * p.actualizarPorcentaje(20);
        * p.desactivar();
        * p.actualizarPorcentaje(10);
        * p.activar();
        *
        * System.out.println("Numero de Poliza: "+ p.obtenerNroPoliza());
        * System.out.println("Costo de Poliza: "+ p.obtenerCostoPoliza());
        * System.out.println("Esta activa?: "+ p.estaActiva());
        */

        /* Test Ej2 c */
        Poliza p = new Poliza(111);
        p.establecerRobo(1000);
        p.establecerIncendio(1200);
        p.actualizarPorcentaje(15);

        System.out.println("Testeo de Poliza Ej 2c");
        System.out.println("Numero de Poliza: "+ p.obtenerNroPoliza());
        System.out.println("Costo de Poliza: "+ p.obtenerCostoPoliza());
    }
}
