
package eva1_7_constructores;

public class EVA1_7_CONSTRUCTORES {

    public static void main(String[] args) {
                                //LLAMADA AL CONSTRUCTOR DE LA CLASE
                                //CONSTRUCTOR DEFAULT
        Persona perso = new Persona();
        perso.ImprimirDatos();
        
        Persona perso2 = new Persona("Daniel", "Charles", 28);
        perso2.ImprimirDatos();
    }
    
}
