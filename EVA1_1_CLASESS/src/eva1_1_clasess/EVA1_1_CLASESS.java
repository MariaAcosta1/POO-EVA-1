
package eva1_1_clasess;

public class EVA1_1_CLASESS {

    public static void main(String[] args) {
        //CREAR OBJETOS;: --> INSTANCIAR
       //DECLARACIÓN = INSTANTACIÓN
       //CLASE identificador = new CLASE(argumentos);
       //new --> crea el objeto en la memoria RAM
       Persona perso1 = new Persona();
       System.out.println(perso1);//REFERENCIA (DIRECCION DE MEMORIA)   
       perso1.nombre = "Juan";
       perso1.apellidos = "Perez Jolote";
       perso1.edad = 30;
       perso1.imprimir();
    }
    
}
//Persona --> platilla de código: NO EXISTE
//TIPOS DE DATOS ABSTRACTOS
class Persona{
    //DATOS (ESTADO), VARAIBLES --> ATRIBUTOS
    String nombre;
    String apellidos;
    int edad;
    //COMPORTAMIENTO --> METODOS
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}
