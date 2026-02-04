
package eva1_3_packages;

import PAQUETOTE.Persona;

public class EVA1_3_PACKAGES {

    public static void main(String[] args) {
        Persona persona = new Persona();
        // persona. //los atributos son default, no son accesibles (diferente paquete)
        Automovil auto = new Automovil();
        //auto.  //atributos son default, son accesibles (mismo paquete)
    }
    
}
