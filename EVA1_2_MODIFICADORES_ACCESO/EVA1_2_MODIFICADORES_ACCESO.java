
package eva1_2_modificadores_acceso;

public class EVA1_2_MODIFICADORES_ACCESO {

    public static void main(String[] args) {
        Persona persona = new Persona();
        //persona.   //no se puede ver los atributos (son privados)
    }
    
}

class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
}