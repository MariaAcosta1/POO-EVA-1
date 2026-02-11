
package eva1_5_vehiculo;

public class EVA1_5_VEHICULO {

    public static void main(String[] args) {
        /*Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("3A");
        vehiculo.setYear(1987);
        vehiculo.setColor("verde");
        vehiculo.setKilometraje(100000);
        vehiculo.setPrecio(10000);
        vehiculo.ImprimirDatos();*/
        Vehiculo[] agencia = new Vehiculo[10];
        for (int i = 0; i < agencia.length; i++){
            agencia[i] = new Vehiculo(); //CREAMOS EL VEHICULO PARA LA POSICIÓN 
            agencia[i].setMarca("Chevrolet");
            agencia[i].setModelo("3A");
            agencia[i].setYear(1987);
            agencia[i].setColor("verde");
            agencia[i].setKilometraje(100000);
            agencia[i].setPrecio(10000);
            agencia[i].ImprimirDatos();
        }
    }
    
}
