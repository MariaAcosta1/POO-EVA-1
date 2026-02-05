
package eva1_4_encapsulamiento;

public class EVA1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setNombre("Mariana");
        persona.setApellidos("Acosta");
        persona.setEdad(18);
        persona.setGenero('M');
        
        /*System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());*/
        persona.imprimirDatos();
        System.out.println("Nombre completo: " + persona.generarNombreCompleto());
    }
    
}
