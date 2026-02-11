
package eva1_5_vehiculo;

public class Vehiculo {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private int kilometraje;
    private double precio;
    //COMPORTAMIENTO
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    public int getkilometraje(){
        return kilometraje;
    }
    public void setKilometraje(int valor){
        kilometraje = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public void ImprimirDatos(){
        System.out.println("------- DATOS DEL VEHICULO -------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Precio: " + precio);
    }
    
}
