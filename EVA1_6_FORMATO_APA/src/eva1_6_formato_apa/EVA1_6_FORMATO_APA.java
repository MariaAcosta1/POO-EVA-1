
package eva1_6_formato_apa;

public class EVA1_6_FORMATO_APA {

    public static void main(String[] args) {
        Libros[] Libreria = new Libros[1];
        for (int i = 0; i < Libreria.length; i++){
            Libreria[i] = new Libros(); 
            Libreria[i].setAutor("Roald Dahl, ");
            Libreria[i].setTitulo("Fantastic Mr Fox, ");
            Libreria[i].setYear( 1970 );
            Libreria[i].setCity(", Reino Unido: ");
            Libreria[i].setEditorial(" George Allen & Unwin");
            Libreria[i].ImprimirDatos();
        }
        Libros[] Librerio = new Libros[1];
        for (int i = 0; i < Librerio.length; i++){
            Librerio[i] = new Libros(); 
            Librerio[i].setAutor("Antoine de Saint-Exupéry, ");
            Librerio[i].setTitulo("El principito, ");
            Librerio[i].setYear( 1943 );
            Librerio[i].setCity(", Francia: ");
            Librerio[i].setEditorial(" Reynal & Hitchcock");
            Librerio[i].ImprimirDatos();
        }
        
        Libros[] Librerias = new Libros[1];
        for (int i = 0; i < Librerias.length; i++){
            Librerias[i] = new Libros(); 
            Librerias[i].setAutor("Mikecrack,El Trollino Y Timba, ");
            Librerias[i].setTitulo("Los compas 1: y el diamantito legendario, ");
            Librerias[i].setYear( 2018 );
            Librerias[i].setCity(", España: ");
            Librerias[i].setEditorial(" Panamericana");
            Librerias[i].ImprimirDatos();
        }
    }
    
}
