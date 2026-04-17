package Ej3;
import java.util.Scanner;

public class SimulacionSurtidor {
    public static void main(String a[]){

        Scanner teclado = new Scanner(System.in);

        Surtidor s = new Surtidor();
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println("Cantidad Gasoil: "+ s.obtenerLitrosGasoil());
            System.out.println("Cantidad Super: "+ s.obtenerLitrosSuper());
            System.out.println("Cantidad Premium: "+ s.obtenerLitrosPremium());

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1: s.extraerGasoil(teclado.nextInt());
                break;
                case 2: s.extraerSuper(teclado.nextInt());
                break;
                case 3: s.extraerPremium(teclado.nextInt());
                break;
                case 4: s.llenarDepositoGasoil();
                break;
                case 5: s.llenarDepositoSuper();
                break;
                case 6: s.llenarDepositoPremium();
                break;
            }
        }

        teclado.close();

    }
}