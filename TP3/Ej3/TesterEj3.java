package Ej3;

public class TesterEj3 {
    public static void main(String args[]){
        // Creo algunos objetos de la clase Fecha
        Fecha f1 = new Fecha(15, 8, 2023);
        Fecha f2 = new Fecha(20, 8, 2023);
        Fecha f3 = new Fecha(10, 8, 2020);
        Fecha f4 = new Fecha(15, 8, 2023); // Misma fecha que f1

        // Pruebas de la clase Fecha
        System.out.println("Pruebas de la clase Fecha:");
        System.out.println("f1: " + f1.obtenerDia() + "/" + f1.obtenerMes() + "/" + f1.obtenerAnio()); // Esperado: 15/8/2023
        System.out.println("f2: " + f2.obtenerDia() + "/" + f2.obtenerMes() + "/" + f2.obtenerAnio()); // Esperado: 20/8/2023
        System.out.println("f3: " + f3.obtenerDia() + "/" + f3.obtenerMes() + "/" + f3.obtenerAnio()); // Esperado: 10/8/2022
        System.out.println("f4: " + f4.obtenerDia() + "/" + f4.obtenerMes() + "/" + f4.obtenerAnio()); // Esperado: 15/8/2023

        System.out.println("f1 es bisiesto? " + f1.esBisiesto()); // Esperado: false
        System.out.println("f3 es bisiesto? " + f3.esBisiesto()); // Esperado: true

        System.out.println("f1 es anterior a f2? " + f1.esAnterior(f2)); // Esperado: true
        System.out.println("f2 es anterior a f1? " + f2.esAnterior(f1)); // Esperado: false
        System.out.println("f1 es anterior a f4? " + f1.esAnterior(f4)); // Esperado: false

        System.out.println("f1 y f4 son del mismo anio? " + f1.mismoAnio(f4)); // Esperado: true
        System.out.println("f1 y f3 son del mismo anio? " + f1.mismoAnio(f3)); // Esperado: false

        // Creo algunos objetos de la clase Libro
        Libro libro1 = new Libro("1984", "George Orwell", "Secker & Warburg", 'F');
        Libro libro2 = new Libro("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 'F');
        Libro libro3 = new Libro("A Brief History of Time", "Stephen Hawking", "Bantam Books", 'N');
        // Pruebas de la clase Libro
        System.out.println("\nPruebas de la clase Libro:");
        System.out.println(libro1.toString()); // Esperado: Titulo: 1984, Autor: George Orwell, Editorial: Secker & Warburg, Categoria: F
        System.out.println(libro2.toString()); // Esperado: Titulo: To Kill a Mockingbird, Autor: Harper Lee, Editorial: J.B. Lippincott & Co., Categoria: F
        System.out.println(libro3.toString()); // Esperado: Titulo: A Brief History of Time, Autor: Stephen Hawking, Editorial: Bantam Books, Categoria: N
        // Creo algunos objetos de la clase Prestamo
        Prestamo prestamo1 = new Prestamo(libro1, f1, f2, "Socio1");
        Prestamo prestamo2 = new Prestamo(libro2, f3, f1, "Socio2");
        Prestamo prestamo3 = new Prestamo(libro1, f1, f2, "Socio1"); // Mismo que prestamo1
        // Pruebas de la clase Prestamo
        System.out.println("\nPruebas de la clase Prestamo:");
        System.out.println(prestamo1.toString()); // Esperado: Detalles del prestamo1
        System.out.println(prestamo2.toString()); // Esperado: Detalles del prestamo2
        System.out.println("prestamo1 y prestamo3 son iguales? " + prestamo1.equals(prestamo3)); // Esperado: true
        System.out.println("prestamo1 y prestamo2 son iguales? " + prestamo1.equals(prestamo2)); // Esperado: false
        System.out.println("prestamo1 esta atrasado en f3? " + prestamo1.estaAtrasado(f3)); // Esperado: false
        System.out.println("prestamo2 esta atrasado en f1? " + prestamo2.estaAtrasado(f1)); // Esperado: true
        Prestamo masAntiguo = prestamo1.masAntiguo(prestamo2);
        System.out.println("El prestamo mas antiguo es de: " + masAntiguo.obtenerSocio()); // Esperado: Socio2

    }
}
