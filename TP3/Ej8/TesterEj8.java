public class TesterEj8 {
    public static void main(String[] args) {
        // Creacion de objetos Hora
        Hora h1 = new Hora(10,30);
        Hora h2 = new Hora(11,0);
        Hora h3 = new Hora(10,30);
        Hora h4 = new Hora(12,15);
        // Creacion de objetos Tarifa
        Tarifa t1 = new Tarifa(50,80,120,200);
        Tarifa t2 = new Tarifa(60,90,150,250);
        // Creacion de objetos Vehiculo
        Vehiculo v1 = new Vehiculo(h1,1,"ABC123");
        Vehiculo v2 = new Vehiculo(h2,2,"DEF456");
        Vehiculo v3 = new Vehiculo(h3,3,"GHI789");
        Vehiculo v4 = new Vehiculo(h4,4,"JKL012");
        // Egreso de vehiculos
        v1.egresaVehiculo(h2);
        v2.egresaVehiculo(h4);
        v3.egresaVehiculo(h1);
        v4.egresaVehiculo(h3);
        // Pruebas de los metodos de la clase Hora
        System.out.println("Hora 1: " + h1.obtenerHora() + ":" + h1.obtenerMinutos());
        System.out.println("Hora 2: " + h2.obtenerHora() + ":" + h2.obtenerMinutos());
        System.out.println("Hora 3: " + h3.obtenerHora() + ":" + h3.obtenerMinutos());
        System.out.println("Hora 4: " + h4.obtenerHora() + ":" + h4.obtenerMinutos());
        System.out.println("Diferencia en minutos entre Hora 1 y Hora 2: " + h1.diferenciaMinutos(h2));
        System.out.println("Hora 1 es igual a Hora 3: " + h1.equals(h3));
        System.out.println("Hora 1 es anterior a Hora 2: " + h1.anterior(h2));
        // Pruebas de los metodos de la clase Tarifa
        System.out.println("Tarifa 1 - 15 min: " + t1.obtenerT15() + ", 30 min: " + t1.obtenerT30() + ", 60 min: " + t1.obtenerT60() + ", Fija: " + t1.obtenerTFija());
        System.out.println("Tarifa 2 - 15 min: " + t2.obtenerT15() + ", 30 min: " + t2.obtenerT30() + ", 60 min: " + t2.obtenerT60() + ", Fija: " + t2.obtenerTFija());
        // Pruebas de los metodos de la clase Vehiculo
        System.out.println("Vehiculo 1 - Patente: " + v1.obtenerPatente() + ", Numero: " + v1.obtenerNumero() + ", Ingreso: " + v1.obtenerIngreso().obtenerHora() + ":" + v1.obtenerIngreso().obtenerMinutos() + ", Egreso: " + v1.obtenerEgreso().obtenerHora() + ":" + v1.obtenerEgreso().obtenerMinutos() + ", A cobrar (Tarifa 1): " + v1.obteneraCobrar(t1));
        System.out.println("Vehiculo 2 - Patente: " + v2.obtenerPatente() + ", Numero: " + v2.obtenerNumero() + ", Ingreso: " + v2.obtenerIngreso().obtenerHora() + ":" + v2.obtenerIngreso().obtenerMinutos() + ", Egreso: " + v2.obtenerEgreso().obtenerHora() + ":" + v2.obtenerEgreso().obtenerMinutos() + ", A cobrar (Tarifa 2): " + v2.obteneraCobrar(t2));
        System.out.println("Vehiculo 3 - Patente: " + v3.obtenerPatente() + ", Numero: " + v3.obtenerNumero() + ", Ingreso: " + v3.obtenerIngreso().obtenerHora() + ":" + v3.obtenerIngreso().obtenerMinutos() + ", Egreso: " + v3.obtenerEgreso().obtenerHora() + ":" + v3.obtenerEgreso().obtenerMinutos() + ", A cobrar (Tarifa 1): " + v3.obteneraCobrar(t1));
        System.out.println("Vehiculo 4 - Patente: " + v4.obtenerPatente() + ", Numero: " + v4.obtenerNumero() + ", Ingreso: " + v4.obtenerIngreso().obtenerHora() + ":" + v4.obtenerIngreso().obtenerMinutos() + ", Egreso: " + v4.obtenerEgreso().obtenerHora() + ":" + v4.obtenerEgreso().obtenerMinutos() + ", A cobrar (Tarifa 2): " + v4.obteneraCobrar(t2));
        System.out.println("Vehiculo 1 es igual a Vehiculo 3: " + v1.equals(v3));
        System.out.println("Vehiculo 2 es igual a Vehiculo 4: " + v2.equals(v4));
    }
}