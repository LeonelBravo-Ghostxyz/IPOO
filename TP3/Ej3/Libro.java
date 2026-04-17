package Ej3;

public class Libro {
    // Atributos de instancia
    private String titulo;
    private String autor;
    private String editorial;
    private char categoria;

    // Constructor
    public Libro(String n,String a,String e,char c){
        titulo = n;
        autor = a;
        editorial = e;
        categoria = c;
    }

    // Comandos
    public void establecerNombre(String p){
        titulo = p;
    }
    public void establecerAutor(String p){
        autor = p;
    }
    public void establecerEditorial(String p){
        editorial = p;
    }
    public void establecerCategoria(char c){
        categoria = c;
    }

    // Consultas
    public String obtenerNombre(){
        return titulo;
    }
    public String obtenerAutor(){
        return autor;
    }
    public String obtenerEditorial(){
        return editorial;
    }
    public char obtenerCategoria(){
        return categoria;
    }
    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor + ", Editorial: " + editorial + ", Categoria: " + categoria;
    }

}
