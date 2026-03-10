/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_13_examen;

public class TestCovid {
    private int edad;
    private boolean cronica;
    private double peso;
    private double estatura;
    
    public TestCovid(){
        this.edad = 30;
        this.cronica = false;
        this.peso = 50;
        this.estatura = 1.7;
    }
    public TestCovid(int edad, boolean cronica, double peso, double estatura){
        this.edad = edad;
        this.cronica = cronica;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setCronica(boolean cronica){
        this.cronica = cronica;
    }
    public boolean getCronica(){
        return this.cronica;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public double getEstatura(){
        return this.estatura;
    }
    private double calcularIMC(){
        return peso/ (estatura * estatura);
    }
    public String calcularPersonaRiesgo(){
        String resu = "Persona sin riesgo";
        if((edad >= 65) || (cronica) || (calcularIMC() > 30))
            resu = "Persona con riesgo";
        return resu;
    }
}
