/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;

public class EVA1_6_FORMATO_APA {

    public static void main(String[] args) {
        Libros[] Libreria = new Libros[3];
        for (int i = 0; i < Libreria.length; i++){
            Libreria[i] = new Libros(); 
            Libreria[i].setAutor("Mariana Acosta, ");
            Libreria[i].setTitulo("El Carpintero y la Cigarra, ");
            Libreria[i].setYear( 2007 );
            Libreria[i].setCity(", Chihuahua: ");
            Libreria[i].setEditorial(" Mundo de Libros");
            Libreria[i].ImprimirDatos();
        }
    }
    
}