package Ej1;
public class testerEj1 {
    public static void main(String args[]){
        Refugio r1 = new Refugio(3,4,6);
        Refugio r2 = r1;
        Refugio r3 = r1.clone();
        Criatura c1 = new Criatura(r1);
        Criatura c2 = new Criatura(r2);
        Criatura c3 = new Criatura(r3);

        System.out.println("--- Declaraciónes de las variables tipo obj ---");
        System.out.println("R1 es un refugio con "+r1.obtenerAlimentos()+" alimentos, "+r1.obtenerBebidas()+" bebidas y "+r1.obtenerCamas()+" camas.");
        System.out.println("R2 es un refugio con referencia a R1.");
        System.out.println("R3 es un refugio clon de R1.");


        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


        System.out.println("--- Prueba de consumo de alimento ---");
        System.out.println("Cantidad de alimentos de R3: "+ r3.obtenerAlimentos());
        r3.consumirAlimento();
        System.out.println("Resultado luego de consumir alimento: "+r3.obtenerAlimentos());

        System.out.println("--- Prueba de consumo de Ejercicio 1 ---");
        int a = r2.obtenerAlimentos();
        System.out.println("A = "+a);

        System.out.println("--- Prueba de caminata ---");
        System.out.println("Estado inicial de C1: "+c1.obtenerCaminatas());
        c1.caminar();
        System.out.println("Estado final de C1: "+c1.obtenerCaminatas());
        System.out.println("Estado inicial de C1: "+c1.obtenerCaminatas());
        c1.caminar();
        System.out.println("Caminatas: "+c1.obtenerCaminatas());
        c1.caminar();
        System.out.println("Caminatas: "+c1.obtenerCaminatas()+" Debería iniciar a dormir");
        System.out.println("R1 tiene disponibilidad de camas: "+r1.disponibilidad());
        System.out.println("¿C1 está dormido? "+c1.estaDormido());
        c1.caminar();
        System.out.println("Caminatas: "+c1.obtenerCaminatas()+" Debería estar dormido por lo tanto no suma caminatas");
        System.out.println("¿C1 está dormido? "+c1.estaDormido());
        System.out.println("Despierta C1"+c1.despertar());
        c1.caminar();
        System.out.println("Caminatas: "+c1.obtenerCaminatas()+" Deberia tener 1 caminata");

    }
}
