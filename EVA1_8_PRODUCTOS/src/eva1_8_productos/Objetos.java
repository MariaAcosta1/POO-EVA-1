/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_productos;

public class Objetos {
    
    private String marca;
    private double precio;
    private String nombre;
    private int cantidad;
    private String unidad;
    
    public Objetos(){
        this.marca = "----";
        this.precio = -1;
        this.nombre = "----";
        this.cantidad = -1;
        this.unidad = "0";
        System.out.println("Producto a comprar:");
    }
    
    public Objetos(String marca, double precio, String nombre, int cantidad, String unidad){
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }    
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public String getUnidad(){
        return unidad;
    }
    public void setUnidad(String unidad){
        this.unidad = unidad;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Unidad: " + unidad);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }
    public double calcularMonto(){
        return cantidad * precio;
    }
}
