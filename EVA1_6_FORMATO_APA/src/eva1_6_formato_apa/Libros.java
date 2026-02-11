/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_formato_apa;

public class Libros {
    
    private String autor;
    private String titulo;
    private int year;
    private String city;
    private String editorial;

    public String getAutor(){
        return autor;
    }
    public void setAutor(String valor){
        autor = valor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String valor){
        titulo = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String valor){
        city = valor;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String valor){
        editorial = valor;
    }
    public void ImprimirDatos(){
        System.out.println("");
        System.out.println("(" + autor + titulo + year + city + editorial + ")");
    }
}
