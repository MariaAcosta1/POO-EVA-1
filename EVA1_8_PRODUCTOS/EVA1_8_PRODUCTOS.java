
package eva1_8_productos;

public class EVA1_8_PRODUCTOS {

    public static void main(String[] args) {
        Objetos objeto = new Objetos("Alsuper", 70.75, "Salchicha", 1, "Kg");
        objeto.imprimirDatos();
        objeto.calcularMonto();
        double monto = objeto.calcularMonto();
        System.out.println("Monto: " + monto);
    }
    
}
