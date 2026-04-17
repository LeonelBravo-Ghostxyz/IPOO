package ej2;

public class TesterEj2 {

    public static void main(String[] args){
        int lenghtArray = 10;
        int cantInsert = 7;
        Coleccion col = new Coleccion(lenghtArray);
        System.out.println("============== Testeando metodo insertar ==============");
        for(int i=0;i<cantInsert;i++){
            float min = 0f;
            float max = 10f;
            int maxLeg = 49;
            float promedioRand = (float) (min + Math.random() * (max - min));
            int legajoRand = (int) (min + Math.random() * (maxLeg - min));
            String[] nom = {"Juan", "Pedro", "Mati", "Fede", "Marcos", "Lauti", "Joaquin"};
            Elemento e = new Alumno(legajoRand+1, nom[i], promedioRand);
            System.out.println("Insertando alumno..."+(i+1)+"- "+nom[i]);
            col.insertar(e);
        }
        System.out.println("Estado interno actual de la coleccion:");
        System.out.println(col.toString());
        System.out.println("============== Testeando metodo eliminar ==============");
        Alumno al = (Alumno) col.recuperarElemento(5);
        System.out.println("Eliminando al alumno: "+al.obtenerNombre());
        col.eliminar(al);
        System.out.println("Estado interno actual de la coleccion:");
        System.out.println(col.toString());
        System.out.println("============== Testeando metodo ordenar ==============");
        col.ordenada();
        System.out.println("Estado interno actual de la coleccion:");
        System.out.println(col.toString());

    }

}