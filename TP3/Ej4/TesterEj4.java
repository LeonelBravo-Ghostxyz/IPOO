package Ej4;

public class TesterEj4 {
    // Tester de ejercicio 4, se hara uso de todos los metodos de la clase Borde y se imprimira por pantalla los resultados y los resultados esperados para corroborar el correcto funcionamiento
    public static void main(String[] args) {
        // Crear colores
        Color color1 = new Color(100, 150, 200);
        Color color2 = new Color(50, 75, 100);
        Color color3 = new Color(300, -20, 100); // Valores fuera de rango, deberia ser blanco (255,255,255)

        // Imprimir colores
        System.out.println("Color 1: " + color1); // Esperado: Color 1: (100, 150, 200)
        System.out.println("Color 2: " + color2); // Esperado: Color 2: (50, 75, 100)
        System.out.println("Color 3: " + color3); // Esperado: Color 3: (255, 255, 255)

        // Variar colores
        color1.variar(30);
        color2.variar(-20);
        System.out.println("Color 1 after variar(30): " + color1); // Esperado: Color 1 after variar(30): (130, 180, 230)
        System.out.println("Color 2 after variar(-20): " + color2); // Esperado: Color 2 after variar(-20): (30, 55, 80)

        // Crear bordes
        Borde borde1 = new Borde(5, color1);
        Borde borde2 = new Borde(10, color2);

        // Imprimir bordes
        System.out.println("Borde 1: " + borde1); // Esperado: Borde 1: Grosor: 5, Color: (130, 180, 230)
        System.out.println("Borde 2: " + borde2); // Esperado: Borde 2: Grosor: 10, Color: (30, 55, 80)

        // Clonar borde
        Borde borde3 = borde1.clone();
        System.out.println("Borde 3 (clone of Borde 1): " + borde3); // Esperado: Borde 3 (clone of Borde 1): Grosor: 5, Color: (130, 180, 230)

        // Comparar bordes
        System.out.println("Borde 1 equals Borde 3: " + borde1.equals(borde3)); // Esperado: Borde 1 equals Borde 3: true
        System.out.println("Borde 1 equals Borde 2: " + borde1.equals(borde2)); // Esperado: Borde 1 equals Borde 2: false
    }
}
